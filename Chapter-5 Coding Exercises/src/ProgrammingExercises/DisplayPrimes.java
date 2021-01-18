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
public class DisplayPrimes {

	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		final int NUMBERS_PER_LINE = 8;

		int startValue = 2;
		int endValue = 1200;
		int count = 0;

		for (int i = startValue; i < endValue; i++) {
			if (isPrime(i)) {
				count++;
				if (count % NUMBERS_PER_LINE == 0) {
					System.out.println(i);
				} else {
					System.out.print(i + "\t");
				}
			}
		}
	}

	/**
	 * Check whether number is prime
	 *
	 * @param number
	 * @return
	 */
	public static boolean isPrime(int number) {
		for (int divisor = 2; divisor <= number / 2; divisor++) {
			if (number % divisor == 0) {  // If true, number is not prime
				return false;  // Number is not a prime
			}
		}
		return true;  // Number is prime
	}
}
