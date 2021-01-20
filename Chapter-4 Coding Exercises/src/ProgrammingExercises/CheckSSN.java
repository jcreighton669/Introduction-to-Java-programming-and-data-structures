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
public class CheckSSN {

	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a SSN: ");
		String ssn = input.nextLine();

		boolean isValid
				= (ssn.length() == 11)
				&& (Character.isDigit(ssn.charAt(0)))
				&& (Character.isDigit(ssn.charAt(1)))
				&& (Character.isDigit(ssn.charAt(2)))
				&& (ssn.charAt(3) == '-')
				&& (Character.isDigit(ssn.charAt(4)))
				&& (Character.isDigit(ssn.charAt(5)))
				&& (Character.isDigit(ssn.charAt(7)))
				&& (ssn.charAt(6) == '-')
				&& (Character.isDigit(ssn.charAt(8)))
				&& (Character.isDigit(ssn.charAt(9)))
				&& (Character.isDigit(ssn.charAt(10)));

		System.out.println(ssn + " is " + ((isValid) ? "a valid " : "an invalid ")
				+ "social security number");
		
		input.close();
	}
}
