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
public class SumElementsByRow {

	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {

		double[][] m = {{70, 93, 68, 78, 83}, {68, 89, 91, 93, 72}, {98, 68, 69, 79, 88}};
		double[][] n = {{1, 1, 1}, {2, 2, 2}, {3, 3, 3}};
		double[][] o = {{2, 4, 6, 8, 10}, {1, 2, 3, 4, 5}, {10, 20, 30, 40, 50}};
		for (int i = 0; i < m.length; i++) {
			System.out.println("Sum of the elements at row " + i + " is " + sumRow(m, i));
		}

		for (int i = 0; i < n.length; i++) {
			System.out.println("Sum of the elements at row " + i + " is " + sumRow(n, i));
		}

		for (int i = 0; i < o.length; i++) {
			System.out.println("Sum of the elements at row " + i + " is " + sumRow(o, i));
		}

	}

	/**
	 * Return the sum of a specific row in a matrix
	 *
	 * @param matrix
	 * @param row
	 * @return
	 */
	public static double sumRow(double[][] matrix, int row) {
		int sum = 0;
		for (int i = 0; i < matrix[row].length; i++) {
			sum += matrix[row][i];
		}
		return sum;
	}
}
