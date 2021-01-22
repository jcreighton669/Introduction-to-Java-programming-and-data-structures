/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgrammingExercises;

import java.util.Scanner;

/**
 *
 * @author Justin
 */
public class FindTheSalesAmount {

	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double commission = 0;

		System.out.print("Enter the sales amount: ");
		double salesAmount = input.nextDouble();

		if (salesAmount <= 5000 && salesAmount > 0) {
			commission = salesAmount * 0.06;
		} else if (salesAmount <= 10000) {
			commission = 5000 * 0.06 + (salesAmount - 5000) * 0.08;
		} else if (salesAmount > 10000) {
			commission = 5000 * 0.06 + 5000 * 0.08 + (salesAmount - 10000) * 0.1;
		}

		System.out.printf("The commission for $%.2f sales is $%.2f\n", salesAmount, commission);

		input.close();
	}
}
