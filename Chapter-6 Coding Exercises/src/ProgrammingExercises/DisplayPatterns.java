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
public class DisplayPatterns {

	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		displayPattern(10);
	}

	/**
	 *
	 * @param n
	 */
	public static void displayPattern(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

		for (int i = n; i >= 1; i--) {
			for (int j = i; j > 0; j--) {
				System.out.print(j + " ");
			}
			System.out.println("");
		}
	}
}
