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
public class ComputeMeanAndStandardDeviation {

	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double sum = 0.0;
		double number;
		double mean;
		double standardDev = 0.0;

		System.out.print("Enter 10 numbers: ");

		for (int i = 0; i < 10; i++) {
			number = input.nextDouble();
			sum += number;
			standardDev += Math.pow(number, 2);
		}

		mean = sum / 10;
		standardDev = Math.sqrt((standardDev - Math.pow(mean, 2) / 10)) / (10 - 1);

		System.out.println("The mean is " + mean);
		System.out.println("The staandard deviation is " + standardDev);

		input.close();
	}
}
