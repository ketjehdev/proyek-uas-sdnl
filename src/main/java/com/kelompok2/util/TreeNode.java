/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kelompok2.util;

/**
 *
 * @author LENOVO
 */
public class TreeNode {
    // Data yang disimpan di simpul

    private int Data;
    // Referensi ke anak kiri dan kanan
    private TreeNode leftNode;
    private TreeNode rightNode;
    // Referensi ke parent (simpul induk)
    private TreeNode Parent;

    // Constructor untuk membuat simpul dengan data tertentu
    public TreeNode(int Data) {
        this.Data = Data;
    }

    // Getter dan setter untuk data dan simpul anak/kiri/kanan/parent
    public int getData() {
        return Data;
    }

    public void setData(int Data) {
        this.Data = Data;
    }

    public TreeNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(TreeNode leftNode) {
        this.leftNode = leftNode;
    }

    public TreeNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(TreeNode rightNode) {
        this.rightNode = rightNode;
    }

    public TreeNode getParent() {
        return Parent;
    }

    public void setParent(TreeNode Parent) {
        this.Parent = Parent;
    }
}
