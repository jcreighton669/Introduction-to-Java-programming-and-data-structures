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
public class ComputeWeeklyHoursForEachEmployee {

	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of employees: ");
		int employees = input.nextInt();
		double[][] hours = new double[employees][7];
		for (int i = 0; i < employees; i++) {
			for (int j = 0; j < 7; j++) {
				hours[i][j] = input.nextDouble();
			}
		}

		for (int i = 0; i < hours.length; i++) {
			System.out.println("Employee " + i + " worked an average of " + averageRow(hours, i));
		}

		input.close();
	}

	/**
	 * Return the sum of a specific row in a matrix
	 *
	 * @param matrix
	 * @param row
	 * @return
	 */
	public static double averageRow(double[][] matrix, int row) {
		int sum = 0;
		for (int i = 0; i < matrix[row].length; i++) {
			sum += matrix[row][i];
		}
		return sum / 7.0;
	}

}
