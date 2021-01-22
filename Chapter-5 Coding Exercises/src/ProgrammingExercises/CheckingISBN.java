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
public class CheckingISBN {

	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sum = 0;
		String isbn = "";

		for (int i = 0; i < 9; i++) {
			System.out.print("Enter a single-digit of the ISBN: ");
			int digit = input.nextInt();
			sum += digit;
			isbn += Integer.toString(digit);
		}

		if (sum % 11 == 10) {
			isbn += "X";
		} else {
			isbn += String.valueOf(sum % 11);
		}

		System.out.println("ISBN: " + isbn);

		input.close();
	}
}
