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
public class AverageAnArray {

	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] integers = {13, 15, 9, 18, 4, 14, 7, 3, 8, 20, 1, 12, 10, 16, 6};
		double[] doubles = {8.50744, 3.61156, 6.53698, 6.26175, 3.29141, 2.52896, 9.75634,
			2.22187, 8.84570, 9.56112, 8.28048, 3.98329, 6.93909, 6.14118, 4.63292};

		System.out.println(average(integers));
		System.out.println(average(doubles));

		input.close();
	}

	/**
	 * Return integer average
	 *
	 * @param array
	 * @return
	 */
	public static int average(int[] array) {
		int average = 0;

		for (int i = 0; i < array.length; i++) {
			average += array[i];
		}
		average /= array.length;

		return average;
	}

	/**
	 * Return double average
	 *
	 * @param array
	 * @return
	 */
	public static double average(double[] array) {
		double average = 0;

		for (int i = 0; i < array.length; i++) {
			average += array[i];
		}
		average /= array.length;

		return average;
	}
}
