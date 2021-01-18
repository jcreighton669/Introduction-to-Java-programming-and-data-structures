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
public class LoanAmortizationSchedule {

	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int paymentNumber = 1;

		System.out.print("Loan amount: ");
		double loanAmount = input.nextDouble();

		System.out.print("Number of years: ");
		int numberOfYears = input.nextInt();

		System.out.print("Annual Interest Rate: ");
		double annualInterestRate = input.nextDouble();

		double monthlyPayment = loanAmount * (annualInterestRate / 1200) / (1 - 1 / Math.pow(1 + (annualInterestRate / 1200), numberOfYears * 12));

		double interestPayment = 0;
		double principalPayment = 0;
		double totalPayment = monthlyPayment * 12 * numberOfYears;

		System.out.printf("\nMonthly Payment: %.2f\n", monthlyPayment);
		System.out.printf("Total Payment: $%.2f\n\n", totalPayment);

		System.out.println("Payment #\tInterest\tPrincipal\tBalance");

		double balance = totalPayment;
		while (paymentNumber <= 12 * numberOfYears) {
			interestPayment = balance * (annualInterestRate / 1200);
			principalPayment = monthlyPayment - interestPayment;
			balance = balance - monthlyPayment;

			System.out.printf(paymentNumber + "\t\t%.2f", interestPayment);
			System.out.printf("\t\t%.2f", principalPayment);
			System.out.printf("\t\t%.2f\n", balance);
			paymentNumber++;
		}

	}
}
