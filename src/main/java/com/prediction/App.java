package com.prediction;

import org.apache.commons.math3.analysis.interpolation.LinearInterpolator;
import org.apache.commons.math3.analysis.polynomials.PolynomialFunction;
import org.apache.commons.math3.analysis.polynomials.PolynomialSplineFunction;
import org.apache.commons.math3.stat.regression.GLSMultipleLinearRegression;
import org.apache.commons.math3.stat.regression.OLSMultipleLinearRegression;
import org.apache.commons.math3.stat.regression.SimpleRegression;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args )
    {
        double[] x = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        double[] y1 = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        double[] y3 = {5, 7, 4, 8, 3, 9, 2, 10, 1};
        double[] x2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        LinearRegression regression = new LinearRegression(x,y3);

        System.out.println( regression.predict(10) );

        SimpleRegression regression2 = new SimpleRegression();
        for (int i = 0; i < x.length; i++) {
            regression2.addData(x[i], y3[i]);
        }
        System.out.println( regression2.predict(10) );
        System.out.println( regression.R2());
    }
}
