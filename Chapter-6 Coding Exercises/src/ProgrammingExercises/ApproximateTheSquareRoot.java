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
public class ApproximateTheSquareRoot {

	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number: ");
		long number = input.nextLong();

		System.out.println("The approximated square root of " + number + " is: " + sqrt(number));

		input.close();
	}

	/**
	 * Method sqrt approximates the square root of n
	 *
	 * @param n
	 * @return
	 */
	public static double sqrt(long n) {
		long lastGuess = 1;
		long nextGuess = (lastGuess + n / lastGuess) / 2;

		while (nextGuess - lastGuess > 0.0001) {
			lastGuess = nextGuess;
			nextGuess = (lastGuess + n / lastGuess) / 2;
		}
		lastGuess = nextGuess;
		return nextGuess = (lastGuess + n / lastGuess) / 2;
	}
}
