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
public class FindNumbersDivisibleBy3And4 {

	public static void main(String[] args) {
		final int NUMBER_OF_DIVISORS_PER_LINE = 10;
		int count = 0;
		int number = 100;

		System.out.println("The numbers divisible by 3 and 4 are \n");

		while (number <= 1000) {

			boolean isDivisible = false;

			// Test whether number is prime
			for (int divisor = 2; divisor <= number / 2; divisor++) {
				if (number % 3 == 0 && number % 4 == 0) {
					isDivisible = true;
				}
			}

			// Display the prime number and increase the count
			if (isDivisible) {
				count++;  // Increase the count

				if (count % NUMBER_OF_DIVISORS_PER_LINE == 0) {
					// Display the number and advance to the new line
					System.out.println(number);
				} else {
					System.out.print(number + "\t");
				}
			}

			number++;
		}
	}
}
