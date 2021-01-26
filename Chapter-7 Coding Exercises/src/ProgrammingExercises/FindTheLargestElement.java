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
public class FindTheLargestElement {

	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double[] doubles = {8.50744, 3.61156, 6.53698, 6.26175, 3.29141, 2.52896, 9.75634, 2.22187, 8.84570, 9.56112, 8.28048, 3.98329, 6.93909, 6.14118, 4.63292};
		System.out.println("The maximum value is " + max(doubles));

		double[] elements = new double[10];
		System.out.print("Enter ten numbers: ");
		for (int i = 0; i < 10; i++) {
			elements[i] = input.nextDouble();
		}

		System.out.println("The maximum value is " + max(elements));

		input.close();
	}

	/**
	 * Get the largest value in an array
	 *
	 * @param array
	 * @return
	 */
	public static double max(double[] array) {
		double max;
		if (array.length >= 0) {
			max = array[0];
			for (int i = 1; i < array.length; i++) {
				if (array[i] > max) {
					max = array[i];
				}
			}
			return max;
		} else {
			return Double.MIN_VALUE;
		}
	}
}
