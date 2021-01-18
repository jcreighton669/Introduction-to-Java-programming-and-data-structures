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
public class PalindromeInteger {

	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter an integer to text if it is a palindrome: ");
		int number = input.nextInt();
		if (isPalindrome(number)) {
			System.out.println("The number " + number + " is a palindrome.");
		} else {
			System.out.println("The number " + number + " is not a palindrome.");
		}
	}

	/**
	 * Return the reversed value of the users input
	 *
	 * @param number
	 * @return
	 */
	public static int reverse(int number) {
		int temp = 0;
		int reverse = 0;
		String num = "";
		while (number != 0) {
			temp = number % 10;
			num += String.valueOf(temp);
			number /= 10;
		}
		reverse = Integer.parseInt(num);
		return reverse;
	}

	/**
	 * Check if the reversed integer is equal to the original integer value
	 *
	 * @param number
	 * @return
	 */
	public static boolean isPalindrome(int number) {
		return number == reverse(number);
	}
}
