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
public class SumASeries {

	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		double i = 1;
		double j = 3;
		double sum = 0;

		while (j <= 99) {
			sum += ((i / j) * 100) / 100.0;
			i += 2;
			j += 2;
		}

		System.out.println("Sum of the series: " + sum);
	}
}
