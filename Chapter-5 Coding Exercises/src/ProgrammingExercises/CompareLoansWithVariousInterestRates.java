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
public class CompareLoansWithVariousInterestRates {

	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Loan amount: ");
		double loanAmount = input.nextDouble();

		System.out.print("Number of years: ");
		int numberOfYears = input.nextInt();

		System.out.println("Interest Rate\t\tMonthly Payment\t\t\tTotal Payment");

		double monthlyPayment = 0;
		double totalPayment = 0;

		for (double i = 2.5; i < 5; i += 0.250) {
			System.out.printf("%.3f", i);
			System.out.print("\t\t\t");
			monthlyPayment = loanAmount * (i / 1200) / (1 - 1 / Math.pow(1 + (i / 1200), numberOfYears * 12));
			System.out.printf("$%.2f", monthlyPayment);
			System.out.print("\t\t\t");
			totalPayment = monthlyPayment * 12 * numberOfYears;
			System.out.printf("$%.2f", totalPayment);
			System.out.println();
		}
		
		input.close();
	}
}
