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
public class SumSeries {

	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		final int MAX = 20;
		System.out.println("i\t\tm(i)");
		for (int i = 1; i <= MAX; i++) {
			System.out.printf(i + "\t\t%.4f\n", checkSum(i));
		}
	}

	/**
	 * Return the summation of series
	 *
	 * @param num
	 * @return
	 */
	public static double checkSum(int num) {
		double sum = 0.0;

		for (double i = 1; i <= num; i++) {
			sum += (i / (i + 2));
		}
		return sum;
	}
}
