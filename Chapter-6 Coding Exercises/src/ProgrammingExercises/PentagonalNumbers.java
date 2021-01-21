/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgrammingExercises;

/**
 *
 * @author Justin
 */
public class PentagonalNumbers {

	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			System.out.printf("%7d", getPentagonalNumber(i));

			if (i % 10 == 0) {
				System.out.println();
			}
		}
	}

	/**
	 * Calculate the pentagonal number from the input
	 *
	 * @param n
	 * @return
	 */
	public static int getPentagonalNumber(int n) {
		return (n * (3 * n - 1)) / 2;
	}
}
