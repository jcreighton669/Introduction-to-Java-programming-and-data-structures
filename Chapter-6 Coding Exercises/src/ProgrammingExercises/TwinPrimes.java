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
public class TwinPrimes {

	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		for (int i = 2; i < 1200; i++) {
			if (isPrime(i) && isTwinPrime(i)) {
				System.out.println("(" + i + ", " + (i + 2) + ")");
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
			if (number % divisor == 0) {
				return false;
			}
		}
		return true;
	}

	/**
	 * return if n + 2 is prime
	 *
	 * @param n
	 * @return
	 */
	public static boolean isTwinPrime(int n) {
		return isPrime(n + 2);
	}
}
