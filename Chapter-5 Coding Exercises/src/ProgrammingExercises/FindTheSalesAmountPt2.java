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
public class FindTheSalesAmountPt2 {

	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double commission = 0.0;
		double balance;
		double salesAmount;

		System.out.print("Enter the commission sought: ");
		double commissionSought = input.nextDouble();

		for (salesAmount = 0.01; commission < commissionSought; salesAmount += 0.01) {
			balance = commission = 0.0;

			if (salesAmount >= 10000.01) {
				commission += (balance = salesAmount - 10000) * 0.12;
			}

			if (salesAmount >= 5000.01) {
				commission += (balance -= balance - 5000) * 0.10;
			}

			if (salesAmount >= 0.01) {
				commission += balance * 0.08;
			}
		}

		System.out.printf("Minimum sales to earn $%.0f: $%.0f\n", commissionSought, salesAmount);

		input.close();
	}
}
