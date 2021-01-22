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
public class DemonstrateCancellationErrors {

	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		double sumLeftToRight = 0.0;
		for (double i = 1.0; i <= 50000.0; i++) {
			sumLeftToRight += 1 / i;
		}

		System.out.println("Summation of series left to right: " + sumLeftToRight);

		double sumRightToLeft = 0.0;
		for (double i = 50000.0; i >= 1.0; i--) {
			sumRightToLeft += 1 / i;
		}

		System.out.println("Summation of series right to left: " + sumRightToLeft);

		System.out.println("Summation of the series right to left - Summation of the series left to right: " + (sumRightToLeft - sumLeftToRight));
	}
}
