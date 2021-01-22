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
public class CompoundValue {

	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double savings = 0;

		System.out.print("Enter the amount to deposit each month (e.g., 100): ");
		double savingsAmount = input.nextDouble();

		System.out.print("Enter the annual interest rate (e.g., 3.75): ");
		double annualInterestRate = input.nextDouble();
		double monthlyInterestRate = annualInterestRate / 1200;

		System.out.print("Enter the number of months of savings (e.g., 3): ");
		int months = input.nextInt();

		for (int i = 0; i < months; i++) {
			savings = (savings + savingsAmount) * (1 + monthlyInterestRate);
		}

		System.out.println("savings: " + savings);

		input.close();
	}
}
