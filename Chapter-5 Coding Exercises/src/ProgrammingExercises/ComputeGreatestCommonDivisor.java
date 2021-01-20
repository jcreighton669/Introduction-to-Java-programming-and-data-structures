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
public class ComputeGreatestCommonDivisor {

	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean flag = true;

		System.out.print("Enter the first (smaller) integer: ");
		int smaller = input.nextInt();

		System.out.print("Enter the second (larger) integer: ");
		int bigger = input.nextInt();

		int gcd = 0;

		while (flag) {
			int remainder = bigger % smaller;
			if (remainder == 0) {
				gcd = smaller;
				flag = false;
			} else {
				bigger = smaller;
				smaller = remainder;
			}
		}

		System.out.println("The GCD is " + gcd);
		
		input.close();
	}
}
