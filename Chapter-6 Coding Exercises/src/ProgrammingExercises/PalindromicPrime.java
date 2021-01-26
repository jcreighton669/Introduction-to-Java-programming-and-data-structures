/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgrammingExercises;

/**
 *
 * @author Justin
 */
public class PalindromicPrime {

	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		int count = 0;
		final int NUM_PER_LINE = 10;
		while (count < 121) {
			for (int i = 2; i < Integer.MAX_VALUE; i++) {
				if (isPrime(i)) {
					if (isPalindrome(i)) {
						count++;
						if (count % 10 == 0 && count <= 120) {
							System.out.println(i);
						} else if (count <= 120) {
							System.out.print(i + "\t");
						} else if (count > 120) {
							break;
						}
					}
				}
			}
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

	/**
	 * Check whether number is prime
	 *
	 * @param number
	 * @return
	 */
	public static boolean isPrime(int number) {
		for (int divisor = 2; divisor <= number / 2; divisor++) {
			if (number % divisor == 0) {
				return false;
			}
		}
		return true;
	}
}
