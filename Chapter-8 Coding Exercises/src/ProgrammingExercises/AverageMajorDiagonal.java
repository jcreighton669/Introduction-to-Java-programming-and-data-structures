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
public class AverageMajorDiagonal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a 4-by-4 matrix row by row: ");

		double[][] m = new double[4][4];
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				m[i][j] = input.nextDouble();
			}
		}
		System.out.println("Average of the elements in the major diagonal is " + averageMajorDiagonal(m));

		input.close();
	}

	/**
	 * Return the average of the diagonal of a regular matrix
	 *
	 * @param m
	 * @return
	 */
	public static double averageMajorDiagonal(double[][] m) {
		double sum = 0.0;
		if (m.length == m[0].length) {
			for (int i = 0; i < m.length; i++) {
				sum += m[i][i];
			}
		}
		return sum / m.length;
	}
}
