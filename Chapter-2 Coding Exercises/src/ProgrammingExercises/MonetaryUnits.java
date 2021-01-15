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
public class MonetaryUnits {

	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Receive the amount
		System.out.print("Enter an amount in double for example 11.56: ");
		int amount = input.nextInt();

		int remainingAmount = amount;

		int cents = remainingAmount % 100;
		int dollars = remainingAmount / 100;

		System.out.println(amount + " represents " + dollars + " dollars and " + cents + " cents");

		input.close();
	}
}
