/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter_Listings;

import java.util.Scanner;

/**
 *
 * @author Justin
 */
public class GuessNumber {

	public static void main(String[] args) {
		// Generate a random number to be guessed
		int number = (int) (Math.random() * 101);

		Scanner input = new Scanner(System.in);
		System.out.println("Guess a magic number between 0 and 100");

		int guess = -1;
		while (guess != number) {
			// Prompt the user to guess the number
			System.out.print("\nEnter your guess: ");
			guess = input.nextInt();

			if (guess == number) {
				System.out.println("Yes, the number is " + number);
			} else if (guess > number) {
				System.out.println("Your guess is too high");
			} else {
				System.out.println("Your guess is too low");
			}
		}
	}
}
