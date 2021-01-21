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
public class ComputeCommissions {

	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(" Sales Amount\t\tCommission");
		System.out.println("---------------------------------------");
		for (int i = 10000; i <= 100000; i += 5000) {
			System.out.printf(i + "\t\t\t%.2f\n", computeCommission(i));
		}
	}

	/**
	 * Compute the commission on the amount of sales
	 *
	 * @param salesAmount
	 * @return
	 */
	public static double computeCommission(double salesAmount) {
		double commission = 0;

		if (salesAmount <= 5000 && salesAmount > 0) {
			commission = salesAmount * 0.08;
		} else if (salesAmount <= 10000) {
			commission = (5000 * 0.08) + ((salesAmount - 5000) * 0.10);
		} else if (salesAmount > 10000) {
			commission = (5000 * 0.08) + (5000 * 0.10) + ((salesAmount - 10000) * 0.12);
		}

		return commission;
	}
}
