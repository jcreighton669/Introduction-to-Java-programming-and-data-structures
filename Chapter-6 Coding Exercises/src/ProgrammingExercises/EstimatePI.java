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
public class EstimatePI {

	/**
	 * Main method
	 * @param args 
	 */
	public static void main(String[] args) {
		double start = 1;
		double end   = 100001;
		System.out.println("\ni           m(i)     ");
		System.out.println("---------------------");
		for (double i = start; i <= end; i += 100) {
			System.out.printf("%-12.0f", i);
			System.out.printf("%-6.7f\n", estimatePI(i));
		}
	}

	/**
	 * Method to estimate pi
	 * @param n
	 * @return 
	 */
	public static double estimatePI(double n) {
		double pi = 0;
		for (double i = 1; i <= n; i++) {
			pi += Math.pow(-1, i + 1) / (2 * i - 1);
		}
		pi *= 4;
		return pi;
	}
}
