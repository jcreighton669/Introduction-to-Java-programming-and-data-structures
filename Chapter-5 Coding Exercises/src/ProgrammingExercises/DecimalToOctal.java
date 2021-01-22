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
public class DecimalToOctal {

	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String octal = "";

		System.out.print("Enter an integer: ");
		int decimal = input.nextInt();

		for (int i = decimal; i > 0; i /= 8) {
			octal = (i % 8) + octal;
		}

		System.out.println("The binary equivalent to " + decimal + " is " + octal);
		if (octal.equals(Integer.toOctalString(decimal))) {
			System.out.println(Integer.toOctalString(decimal) + ": this is the check sum to confirm code is correct.");

		}
		input.close();
	}
}
