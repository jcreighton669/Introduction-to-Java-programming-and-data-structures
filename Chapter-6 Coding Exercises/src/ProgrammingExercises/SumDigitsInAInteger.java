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
public class SumDigitsInAInteger {

	/**
	 * Main method
	 * @param args 
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter any integer: ");
		long number = input.nextLong();

		System.out.println("The sum of the digits in " + number + " is " + sumDigits(number));
	}

	/**
	 * 
	 * @param n
	 * @return 
	 */
	public static int sumDigits(long n) {
		int sum = 0;
		int temp = 0;
		while (n != 0) {
			temp = (int) n % 10;
			sum += temp;
			n /= 10;
		}
		return sum;
	}
}
