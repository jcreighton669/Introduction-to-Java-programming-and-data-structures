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
public class AddTwoMatrices {

	/**
	 * Main method
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter matrix1: ");
		double[][] first = new double[2][2];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				first[i][j] = input.nextDouble();
			}
		}

		System.out.print("Enter matrix2: ");
		double[][] second = new double[2][2];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				second[i][j] = input.nextDouble();
			}
		}

		double[][] sum = sumMatrices(first, second);

		print(first, second, sum);

	}

	public static double[][] sumMatrices(double[][] first, double[][] second) {
		double[][] sum = new double[first.length][first[0].length];

		if ((first.length == second.length) && (first[0].length == second[0].length)) {
			for (int i = 0; i < first.length; i++) {
				for (int j = 0; j < first[0].length; j++) {
					sum[i][j] = first[i][j] + second[i][j];
				}
			}
		}

		return sum;
	}

	/**
	 * Print displays all the elements in row r
	 *
	 * @param m
	 * @param r
	 */
	public static void print(double[][] m, int r) {
		for (int j = 0; j < m[r].length; j++) {
			System.out.print(m[r][j] + " ");
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

		for (int i = 0; i < 2; i++) {
			print(m1, i);
			System.out.print((i == 1 ? "  +  " : "     "));
			print(m2, i);
			System.out.print((i == 1 ? "  =  " : "     "));
			print(m3, i);
			System.out.println();
		}
	}
}
