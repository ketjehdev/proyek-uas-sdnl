/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kelompok2.test;

import static com.kelompok2.util.LinearCorrelation.calculateCorrelation;

/**
 *
 * @author ASUS
 */
public class LinearCorellationTest {

    public static void main(String[] args) {
        double[] x = {6, 2, 9, 12, 5};
        double[] y = {1, 5, 2, 1, 9};

        try {
            double correlation = calculateCorrelation(x, y);
            System.out.println("Pearson Correlation Coefficient: " + correlation);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
