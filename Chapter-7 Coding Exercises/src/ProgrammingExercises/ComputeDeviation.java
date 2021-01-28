/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgrammingExercises;

import java.util.Scanner;

/**
 *
 * @author Justin
 */
public class ComputeDeviation {

	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] elements = new double[10];
		
		System.out.print("Enter 10 numbers: ");
		for (int i = 0; i < 10; i++) {
			elements[i] = input.nextDouble();
		}
		
		System.out.println("The mean is " + mean(elements));
		System.out.println("The standard deviation is " + deviation(elements));
		input.close();
	}

	/**
	 * Compute the deviation of an array of floating point decimals
	 *
	 * @param x
	 * @return
	 */
	public static double deviation(double[] x) {
		double arrayMean = mean(x);
		double stdDev = 0;
		
		for (int i = 0; i < x.length; i++) {
			stdDev += (Math.pow(x[i] - arrayMean, 2));
		}
		
		stdDev /= (x.length - 1);
		stdDev = Math.sqrt(stdDev);
		return stdDev;
	}

	/**
	 * Compute the arithmetical mean of an array of floating point decimals
	 *
	 * @param x
	 * @return
	 */
	public static double mean(double[] x) {
		double arrayMean = 0;
		for (int i = 0; i < x.length; i++) {
			arrayMean += x[i];
		}

		return arrayMean /= x.length;
	}
}
