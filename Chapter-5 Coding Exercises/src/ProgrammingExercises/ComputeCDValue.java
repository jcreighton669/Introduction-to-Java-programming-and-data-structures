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
public class ComputeCDValue {

	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the initial deposit amount: ");
		double initialAmount = input.nextDouble();

		System.out.print("Enter annual percentage yield: ");
		double annualPercentage = input.nextDouble();
		double monthlyPercentage = annualPercentage / 1200;

		System.out.print("Enter maturity period (number of months): ");
		int months = input.nextInt();

		System.out.println("Month\t\tCD Value");
		for (int i = 0; i <= months; i++) {
			initialAmount += initialAmount * monthlyPercentage;
			if (i >= 1) {
				System.out.printf(i + "\t\t%.2f\n", initialAmount);
			}
		}
		
		input.close();
	}
}
