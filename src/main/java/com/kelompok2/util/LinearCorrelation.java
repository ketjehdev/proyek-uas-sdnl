/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kelompok2.util;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class LinearCorrelation {
    public static double calculateCorrelation(ArrayList<Double> x, ArrayList<Double> y) {
        try {
            if (x.size() != y.size()) {
                throw new IllegalArgumentException("Arrays must have the same length.");
            }

            int n = x.size();
            double sumX = 0, sumY = 0, sumXY = 0, sumX2 = 0, sumY2 = 0;

            for (int i = 0; i < n; i++) {
                sumX += x.get(i);
                sumY += y.get(i);
                sumXY += x.get(i) * y.get(i);
                sumX2 += x.get(i) * x.get(i);
                sumY2 += y.get(i) * y.get(i);
            }

            double numerator = n * sumXY - sumX * sumY;
            double denominator = Math.sqrt((n * sumX2 - sumX * sumX) * (n * sumY2 - sumY * sumY));

            if (denominator == 0) {
                throw new ArithmeticException("Denominator is zero, correlation is undefined.");
            }

            return numerator / denominator;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return 0d;
    }
}
