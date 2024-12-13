/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kelompok2.util;

import java.util.List;

/**
 *
 * @author LENOVO
 */
public class Tree {

    public TreeNode root;

    public Tree() {
        root = null;
    }

    public Tree(TreeNode root) {
        this.root = root;
    }

    // Metode untuk menambahkan data ke tree
    public void insert(int data) {
        TreeNode baru = new TreeNode(data);  // Membuat simpul baru
        if (root == null) {  // Jika tree kosong
            this.root = baru;  // Simpul baru menjadi root
        } else {
            TreeNode bantu = root;  // Mulai dari root
            while (true) {
                // Jika data lebih kecil atau sama dengan simpul saat ini, arahkan ke kiri
                if (data <= bantu.getData()) {
                    if (bantu.getLeftNode() == null) {
                        bantu.setLeftNode(baru);  // Tambahkan simpul baru di kiri
                        baru.setParent(bantu);  // Set parent simpul baru
                        return;
                    } else {
                        bantu = bantu.getLeftNode();  // Lanjutkan ke kiri
                    }
                } else {
                    // Jika data lebih besar, arahkan ke kanan
                    if (bantu.getRightNode() == null) {
                        bantu.setRightNode(baru);  // Tambahkan simpul baru di kanan
                        baru.setParent(bantu);  // Set parent simpul baru
                        return;
                    }
                    bantu = bantu.getRightNode();  // Lanjutkan ke kanan
                }
            }
        }
    }

    public TreeNode getPredeccessor(TreeNode temp) {
        temp = temp.getLeftNode();
        while (temp.getRightNode() != null) {
            temp = temp.getRightNode();

        }
        return temp;
    }

    // Metode untuk menghapus data dari tree
    public void delete(int data) {
        TreeNode temp = search(data);  // Cari simpul dengan data tertentu
        if (temp == null) {  // Jika simpul tidak ditemukan
            System.out.println("Data tidak ditemukan.");
            return;
        }
        TreeNode parent = temp.getParent();  // Ambil parent dari simpul yang akan dihapus

        // Jika simpul adalah root dan tidak punya anak
        if (temp == root && temp.getLeftNode() == null && temp.getRightNode() == null) {
            root = null;  // Hapus root
        } else {
            // Jika simpul tidak punya anak
            if (temp.getLeftNode() == null && temp.getRightNode() == null) {
                if (temp.getData() <= parent.getData()) {
                    parent.setLeftNode(null);  // Hapus simpul dari sisi kiri
                } else {
                    parent.setRightNode(null);  // Hapus simpul dari sisi kanan
                }
            } // Jika simpul hanya punya anak kanan
            else if (temp.getLeftNode() == null && temp.getRightNode() != null) {
                if (temp.getData() <= parent.getData()) {
                    parent.setLeftNode(temp.getRightNode());  // Pindahkan anak kanan ke posisi simpul
                } else {
                    parent.setRightNode(temp.getRightNode());
                }
                temp.getRightNode().setParent(parent);  // Set parent anak kanan
            } // Jika simpul hanya punya anak kiri
            else if (temp.getLeftNode() != null && temp.getRightNode() == null) {
                if (temp.getData() <= parent.getData()) {
                    parent.setLeftNode(temp.getLeftNode());  // Pindahkan anak kiri ke posisi simpul
                } else {
                    parent.setRightNode(temp.getLeftNode());
                }
                temp.getLeftNode().setParent(parent);  // Set parent anak kiri
            } // Jika simpul punya dua anak
            else {
                TreeNode predecessor = getPredeccessor(temp); // Cari predecessor (anak terbesar di subtree kiri)
                int predecessorData = predecessor.getData();  // Simpan data dari predecessor

                // Hapus predecessor dari posisinya
                delete(predecessorData);

                // Ganti data simpul yang dihapus dengan data dari predecessor
                temp.setData(predecessorData);
            }
        }
    }
    // Metode untuk mencari simpul berdasarkan data

    public TreeNode search(int Data) {
        if (root == null) {  // Jika tree kosong
            System.out.println("Pohon kosong, data tidak ditemukan");
            return null;
        }

        TreeNode bantu = root;  // Mulai dari root
        while (bantu != null) {
            if (Data == bantu.getData()) {  // Jika data ditemukan
                return bantu;
            } else if (Data < bantu.getData()) {  // Arahkan ke kiri jika data lebih kecil
                bantu = bantu.getLeftNode();
            } else {  // Arahkan ke kanan jika data lebih besar
                bantu = bantu.getRightNode();
            }
        }

        System.out.println("Data tidak ditemukan: " + Data);  // Data tidak ditemukan
        return null;
    }

    // Metode untuk in-order traversal
    public void inOrderTraversal() {
        inOrderHelper(root);
    }


     // Helper untuk in-order traversal
    public void inOrderHelper(TreeNode root) {
        if (root != null) {
            inOrderHelper(root.getLeftNode());
            System.out.print(root.getData() + " ");
            inOrderHelper(root.getRightNode());
        }
    }
}
