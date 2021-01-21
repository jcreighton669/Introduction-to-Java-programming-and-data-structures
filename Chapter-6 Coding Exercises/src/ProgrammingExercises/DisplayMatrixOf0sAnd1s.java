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
public class DisplayMatrixOf0sAnd1s {

	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter n: ");
		int n = input.nextInt();
		printMatrix(n);

		input.close();
	}

	/**
	 * Print random binary matrix of n by n
	 *
	 * @param n
	 */
	public static void printMatrix(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print((int) (Math.random() * 2) % 2 + " ");
			}
			System.out.println("");
		}
	}
}
