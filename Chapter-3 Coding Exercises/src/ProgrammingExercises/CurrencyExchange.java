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
public class CurrencyExchange {

	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double dollars;
		double yuan;

		System.out.print("Enter the exchange rate from dollars to RMB: ");
		double dollarsToRMBRate = input.nextDouble();

		System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
		int option = input.nextInt();

		switch (option) {
			case 0:
				System.out.print("Enter the dollar amount: ");
				dollars = input.nextDouble();
				yuan = dollars * dollarsToRMBRate;
				System.out.printf("$%.2f is %.2f yuan", dollars, yuan);
				break;
			case 1:
				System.out.print("Enter the RMB amount: ");
				yuan = input.nextDouble();
				dollars = yuan / dollarsToRMBRate;
				System.out.printf("%.2f yuan is $%.2f\n", yuan, dollars);
				break;
			default:
				System.out.println("Incorrect input");
		}
		
		input.close();
	}
}
