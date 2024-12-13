/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kelompok2.util;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class LinearCorrelation {
    
    public static double calculateCorrelation(double[] x, double[] y) {
        if (x.length != y.length) {
            throw new IllegalArgumentException("Arrays must have the same length.");
        }

        int n = x.length;
        double sumX = 0, sumY = 0, sumXY = 0, sumX2 = 0, sumY2 = 0;

        for (int i = 0; i < n; i++) {
            sumX += x[i];
            sumY += y[i];
            sumXY += x[i] * y[i];
            sumX2 += x[i] * x[i];
            sumY2 += y[i] * y[i];
        }

        double numerator = n * sumXY - sumX * sumY;
        double denominator = Math.sqrt((n * sumX2 - sumX * sumX) * (n * sumY2 - sumY * sumY));

        if (denominator == 0) {
            throw new ArithmeticException("Denominator is zero, correlation is undefined.");
        }

        return numerator / denominator;
    }

}
