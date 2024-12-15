/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kelompok2.test;

import com.kelompok2.util.LinearCorrelation;
import com.kelompok2.util.Tree;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class TestTree {

    public static void main(String[] args) {
        Tree treeUmp = new Tree();
        Tree treePangan = new Tree();

        // Insert data UMP ke Tree
        treeUmp.insert(2_727_812); // Banten
        treeUmp.insert(5_067_381); // Jakarta
        treeUmp.insert(2_057_495); // Jabar
        treeUmp.insert(2_036_947); // Jateng
        treeUmp.insert(2_125_897); // DIY
        treeUmp.insert(2_165_244); // Jatim

        ArrayList<Double> ump = new ArrayList<>();
        ump.add(Double.valueOf(treeUmp.search(2_727_812).getData()));
        ump.add(Double.valueOf(treeUmp.search(5_067_381).getData()));
        ump.add(Double.valueOf(treeUmp.search(2_057_495).getData()));
        ump.add(Double.valueOf(treeUmp.search(2_036_947).getData()));
        ump.add(Double.valueOf(treeUmp.search(2_125_897).getData()));
        ump.add(Double.valueOf(treeUmp.search(2_165_244).getData()));

        // Insert data Pangan ke Tree
        treePangan.insert(44_408); // Banten
        treePangan.insert(45_968); // Jakarta
        treePangan.insert(44_052); // Jabar
        treePangan.insert(43_064); // Jateng
        treePangan.insert(41_432); // DIY
        treePangan.insert(39_142); // Jatim

        ArrayList<Double> pangan = new ArrayList<>();
        pangan.add(Double.valueOf(treePangan.search(44_408).getData()));
        pangan.add(Double.valueOf(treePangan.search(45_968).getData()));
        pangan.add(Double.valueOf(treePangan.search(44_052).getData()));
        pangan.add(Double.valueOf(treePangan.search(43_064).getData()));
        pangan.add(Double.valueOf(treePangan.search(41_432).getData()));
        pangan.add(Double.valueOf(treePangan.search(39_142).getData()));

        // Hitung korelasi
        double correlation = LinearCorrelation.calculateCorrelation(ump, pangan);
        
        System.out.println(correlation);
    }

}
