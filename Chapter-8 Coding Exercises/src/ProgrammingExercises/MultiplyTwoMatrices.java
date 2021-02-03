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
public class MultiplyTwoMatrices {

	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		double[][] m1 = getMatrix(1);
		double[][] m2 = getMatrix(2);

		double[][] result = multiplyMatrix(m1, m2);

		print(m1, m2, result);
	}

	/**
	 * Return a 3-by-3 matrix
	 *
	 * @param n
	 * @return
	 */
	public static double[][] getMatrix(int n) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter matrix" + n + ": ");

		double[][] m = new double[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				m[i][j] = input.nextDouble();
			}
		}

		input.close();
		return m;
	}

	/**
	 * Multiply two matrices and return result
	 *
	 * @param a
	 * @param b
	 * @return
	 */
	public static double[][] multiplyMatrix(double[][] a, double[][] b) {
		double[][] c = new double[3][3];

		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				for (int h = 0; h < c.length; h++) {
					c[i][j] += a[i][h] * b[h][j];
				}
			}
		}
		return c;
	}

	/**
	 * Print displays all the elements in row r
	 *
	 * @param m
	 * @param r
	 */
	public static void print(double[][] m, int r) {
		for (int j = 0; j < m[r].length; j++) {
			System.out.printf("%5.1f", m[r][j]);
		}
	}

	/**
	 * Print displays results
	 *
	 * @param m1
	 * @param m2
	 * @param m3
	 */
	public static void print(double[][] m1, double[][] m2, double[][] m3) {
		System.out.println("The matrices are added as follows");

		for (int i = 0; i < 3; i++) {
			print(m1, i);
			System.out.print((i == 1 ? "   * " : "     "));
			print(m2, i);
			System.out.print((i == 1 ? "   = " : "     "));
			print(m3, i);
			System.out.println();
		}
	}
}
