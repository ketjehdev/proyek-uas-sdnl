/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kelompok2.test;

import com.kelompok2.util.Tree;

/**
 *
 * @author ASUS
 */
public class TestTree {
    public static void main(String[] args) {
        Tree treeUmp = new Tree();
        Tree treePangan = new Tree();
        
        treeUmp.insert(2_727_812);// Banten
        treeUmp.insert(5_067_381);// Jakarta
        treeUmp.insert(2_057_495);// Jabar
        treeUmp.insert(2_036_947);// Jateng
        treeUmp.insert(2_125_897);// DIY
        treeUmp.insert(2_165_244);// Jatim
        
        treePangan.insert(44_408);// Banten
        treePangan.insert(45_968);// Jakarta
        treePangan.insert(44_052);// Jabar
        treePangan.insert(43_064);// Jateng
        treePangan.insert(41_432);// DIY
        treePangan.insert(39_142);// Jatim
        
        System.out.println("in order for UMP tree : ");
        treeUmp.inOrderTraversal();
        System.out.println();
        
        System.out.println("in order for Pangan tree : ");
        treePangan.inOrderTraversal();
        System.out.println();
        
        
    }
}
