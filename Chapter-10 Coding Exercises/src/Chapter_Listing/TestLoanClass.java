/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter_Listing;

import java.util.Scanner;

/**
 *
 * @author Justin
 */
public class TestLoanClass {

	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Enter annual interest rate
		System.out.print("Enter annual interestrate, for example, 8.25: ");
		double annualInterestRate = input.nextDouble();

		// Enter number of years
		System.out.print("Enter number of years as an integer: ");
		int numberOfYears = input.nextInt();

		// Enter loan amount
		System.out.print("Enter loan amoun, for example, 120000.95: ");
		double loanAmount = input.nextDouble();

		// Create a Loan object
		Loan loan = new Loan(annualInterestRate, numberOfYears, loanAmount);

		// Display loan date, monthly paymnet, and total payment
		System.out.printf("The loan created on %s\n"
				+ "The monthly payment is %.2f\nThe total amount is %.2f\n",
				loan.getLoanDate().toString(), loan.getMonthlyPayment(), loan.getTotalPayment());
	}
}
