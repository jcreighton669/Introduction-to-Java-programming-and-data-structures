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
public class CreditCardNumberValidation {

	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a credit card number as a long integer: ");
		long number = input.nextLong();

		System.out.println(number + " is " + (isValid(number) ? "valid" : "invalid"));

		input.close();
	}

	/**
	 * Return true if the card number is valid
	 *
	 * @param number
	 * @return
	 */
	public static boolean isValid(long number) {
		boolean valid = (getSize(number) >= 13 && getSize(number) <= 16)
				&& (prefixMatched(number, 4) || prefixMatched(number, 5)
				|| prefixMatched(number, 37) || prefixMatched(number, 4))
				&& ((sumOfDoubleEvenPlace(number)) + sumOfOddPlace(number)) % 10 == 0;
		return valid;
	}

	/**
	 * Get the result from Step 2
	 *
	 * @param number
	 * @return
	 */
	public static int sumOfDoubleEvenPlace(long number) {
		int sum = 0;
		String num = number + "";
		for (int i = getSize(number) - 2; i >= 0; i -= 2) {
			sum += getDigit(Integer.parseInt(num.charAt(i) + "") * 2);
		}
		return sum;
	}

	/**
	 * Return this number if it is a single digit, otherwise, return the sum of the two digits
	 *
	 * @param number
	 * @return
	 */
	public static int getDigit(int number) {
		if (number < 9) {
			return number;
		} else {
			return (number / 10) + (number % 10);
		}

	}

	/**
	 * Return the sum of odd-placed digits in number
	 *
	 * @param number
	 * @return
	 */
	public static int sumOfOddPlace(long number) {
		int sum = 0;
		String num = Long.toString(number);
		for (int i = getSize(number) - 1; i >= 0; i -= 2) {
			sum += Integer.parseInt(num.charAt(i) + "");
		}
		return sum;
	}

	/**
	 * Return true if the number d is a prefix for number
	 *
	 * @param number
	 * @param d
	 * @return
	 */
	public static boolean prefixMatched(long number, int d) {
		return getPrefix(number, getSize(d)) == d;
	}

	/**
	 * Return the number of digits in d
	 *
	 * @param d
	 * @return
	 */
	public static int getSize(long d) {
		String size = Long.toString(d);
		return size.length();
	}

	/**
	 * Return the first k number of digits from number. If the number of digits in number is less than k, return number
	 *
	 * @param number
	 * @param k
	 * @return
	 */
	public static long getPrefix(long number, int k) {
		if (getSize(number) > k) {
			String num = number + "";
			return Long.parseLong(num.substring(0, k));
		}
		return number;
	}
}
