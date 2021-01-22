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
public class ComputeE {

	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		double e = 0.0;
		double value = 10000.0;

		for (double i = 1; i <= value; i++) {
			double denominator = i;
			for (double k = i - 1; k >= 1; k--) {
				denominator *= k;
			}
			e += 1 / denominator;
		}

		System.out.println("The e value for i = 10000: " + e);

		e = 0.0;
		value = 20000.0;

		for (int i = 1; i <= value; i++) {
			double denominator = i;
			for (int j = i; j >= 1; j--) {
				denominator *= j;
			}
			e += 1 / denominator;
		}

		System.out.println("The e value for i = 20000: " + e);

		e = 0.0;
		value = 100000.0;

		for (int i = 1; i <= value; i++) {
			double denominator = i;
			for (int j = i; j >= 1; j--) {
				denominator *= j;
			}
			e += 1 / denominator;
		}

		System.out.println("The e value for i = 100000: " + e);
	}
}
