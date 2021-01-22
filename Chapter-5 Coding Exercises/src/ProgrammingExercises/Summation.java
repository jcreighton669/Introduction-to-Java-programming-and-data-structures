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
public class Summation {

	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		double sum = 0.0;

		for (double i = 1; i <= 999; i++) {
			sum += 1 / (Math.sqrt(i) + Math.sqrt(i + 1));
		}

		System.out.println("Summation: " + sum);
	}
}
