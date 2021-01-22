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
public class CheckISBN13 {

	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sum = 0;

		System.out.print("Enter the first 12 digits of an ISBN-13 as a string: ");
		String isbn = input.nextLine();
		if (isbn.length() == 12) {
			for (int i = 0; i < isbn.length(); i++) {
				if (i % 2 != 0) {
					sum += 3 * Integer.parseInt(isbn.charAt(i) + "");
				} else {
					sum += Integer.parseInt(isbn.charAt(i) + "");
				}
			}
			sum = 10 - sum % 10;
			System.out.print("The ISBN-13 number is " + isbn);
			if (sum == 10) {
				System.out.print("0");
			} else {
				System.out.print(sum);
			}
		} else {
			System.out.println(isbn + " is an invalid input");
		}

		input.close();
	}
}
