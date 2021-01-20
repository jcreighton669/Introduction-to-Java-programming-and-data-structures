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
public class Payroll {

	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// INPUTS
		System.out.print("Enter employee's name: ");
		String name = input.nextLine();

		System.out.print("Enter number of hours worked in a week: ");
		double hours = input.nextDouble();

		System.out.print("Enter hourly pay rate: ");
		double payRate = input.nextDouble();

		System.out.print("Enter federal tax withholding rate: ");
		double fedTaxRate = input.nextDouble();

		System.out.print("Enter state tax withholdingrate: ");
		double stateTaxRate = input.nextDouble();

		// CALCULATIONS
		double grossPay = hours * payRate;
		double fedWithholding = grossPay * fedTaxRate;
		double fedPercentage = fedTaxRate * 100;
		double stateWithholding = grossPay * stateTaxRate;
		double statePercentage = stateTaxRate * 100;
		double netPay = grossPay - (fedWithholding + stateWithholding);
		double totalWithholding = fedWithholding + stateWithholding;

		// Formatting
		String fed = String.format("%,.2f", fedWithholding);
		String state = String.format("%,.2f", stateWithholding);
		String net = String.format("%,.2f", netPay);
		String total = String.format("%,.2f", totalWithholding);

		// OUTPUT
		System.out.println("Employee Name: " + name);
		System.out.println("Hours Worked: " + hours);
		System.out.println("Pay Rate: " + payRate);
		System.out.printf("Gross Pay: $%.2f\n", grossPay);
		System.out.println("Deductions: ");
		System.out.println("  Federal Withholding (" + fedPercentage + "%): $" + fed);
		System.out.println("  State Withholding (" + statePercentage + "%): $" + state);
		System.out.println("  Total Withholding: $" + total);
		System.out.println("Net pay: $" + net);
		
		input.close();
	}
}
