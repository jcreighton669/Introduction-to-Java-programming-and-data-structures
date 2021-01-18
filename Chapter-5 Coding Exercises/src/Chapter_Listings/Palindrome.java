/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter_Listings;

import java.util.Scanner;

/**
 *
 * @author Justin
 */
public class Palindrome {

	/**
	 * Main method
	 */
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter a string
		System.out.print("Enter a string: ");
		String s = input.nextLine().toLowerCase();

		// The index of the first character in the string
		int low = 0;

		// The index of the last character in the string
		int high = s.length() - 1;

		boolean isPalindrome = true;
		while (low < high) {
			if (s.charAt(low) != s.charAt(high)) {
				isPalindrome = false;
				break;
			}

			low++;
			high--;
		}

		if (isPalindrome) {
			System.out.println(s + " is a palindrome ");
		} else {
			System.out.println(s + " is not a palindrome ");
		}
	}
}
