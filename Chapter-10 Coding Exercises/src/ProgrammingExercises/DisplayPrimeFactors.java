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
public class DisplayPrimeFactors {

	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter a positive integer
		System.out.print("Enter a positive integer: ");
		int number = input.nextInt();

		// Displays all the number's smallest factors in decreasing order
		System.out.print("The smallest factors of " + number + " are: ");
		StackOfIntegers stack = new StackOfIntegers(); // Create a StackOfIntegers

		smallestFactors(number, stack);

		while (!stack.empty()) {
			System.out.print(stack.pop() + " ");
		}
		System.out.println();
	}

	/**
	 * Find smallestFactors and push them to StackOfIntegers
	 *
	 * @param number
	 * @param stack
	 */
	public static void smallestFactors(int number, StackOfIntegers stack) {
		int i = 2; // Potential prime factor
		while (number / i != 1) {
			if (number % i == 0) {
				stack.push(i);
				number /= i;
			} else {
				i++;
			}
		}
		stack.push(number);
	}
}
