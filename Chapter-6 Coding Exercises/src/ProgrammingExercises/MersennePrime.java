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
public class MersennePrime {

	/**
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("p\t\t\t2^p - 1");
		System.out.println("-----------------------------");

		for (int p = 2; p <= 31; p++) {
			if (isPrime(p)) {
				System.out.print(p);
				System.out.println("\t\t\t" + mersennePrime(p));
			}
		}
	}

	/**
	 * Returns the Mersenne prime number
	 *
	 * @param p
	 * @return
	 */
	public static int mersennePrime(int p) {
		return (int) (Math.pow(2, p) - 1);
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
