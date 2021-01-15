/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter_Listings;

import java.util.Scanner;

/**
 *
 * @author Justin
 */
public class ComputeLoan {

	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Enter annual interest rate in percentage, e.g., 7.25
		System.out.print("Enter annual interest rate, e.g., 7.25: ");
		double annualInterestRate = input.nextDouble();

		// Obtain monthly interest rate
		double monthlyInterestRate = annualInterestRate / 1200;

		// Enter number of years
		System.out.print("Enter number of years as an integer, e.g., 5: ");
		int numberOfYears = input.nextInt();

		// Enter loan amount
		System.out.print("Enter loan amount, e.g., 120000.95: ");
		double loanAmount = input.nextDouble();

		// Calculate payment
		double monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
		double totalPayment = monthlyPayment * numberOfYears * 12;

		// Display results
		System.out.println("The monthly payment is $" + (int) (monthlyPayment * 100) / 100.0);
		System.out.println("The total payment is $" + (int) (100 * totalPayment) / 100.0);
	}
}
