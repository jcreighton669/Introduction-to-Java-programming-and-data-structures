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
public class CheckPassword {

	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String password = input.nextLine();
		System.out.println(isValid(password));

		input.close();
	}

	/**
	 * Check for password validity
	 *
	 * @param pw
	 * @return
	 */
	public static boolean isValid(String pw) {
		final int VALID_LENGTH = 10;
		final int MINIMUM_DIGITS = 3;

		boolean valid = isProperLength(pw.length(), VALID_LENGTH)
				&& isLettersAndDigitsOnly(pw)
				&& containsThreeDigits(pw, MINIMUM_DIGITS);

		return valid;
	}

	/**
	 * Tests whether a string is a valid length
	 *
	 * @param pwLength
	 * @param validLength
	 * @return
	 */
	public static boolean isProperLength(int pwLength, int validLength) {
		return pwLength >= validLength;
	}

	/**
	 * Tests if a string only contains letters or digits
	 *
	 * @param pw
	 * @return
	 */
	public static boolean isLettersAndDigitsOnly(String pw) {
		for (int i = 0; i < pw.length(); i++) {
			if (!Character.isLetterOrDigit(pw.charAt(i))) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Tests if a password contains at least n digits
	 *
	 * @param pw
	 * @param n
	 * @return
	 */
	public static boolean containsThreeDigits(String pw, int n) {
		int numDigits = 0;
		for (int i = 0; i < pw.length(); i++) {
			if (Character.isDigit(pw.charAt(i))) {
				numDigits++;
			}
			if (numDigits >= n) {
				return true;
			}
		}
		return false;
	}
}
