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
public class UsePrimeMethod {

	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		int count = 0;
		for (int i = 2; i < 10000; i++) {
			if (isPrime(i)) {
				count++;
			}
		}
		System.out.println("There are " + count + " prime numbers less than 10,000");
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
