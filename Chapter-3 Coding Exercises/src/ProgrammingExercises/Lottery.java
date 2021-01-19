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
public class Lottery {

	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		// Generate a lottery number
		int lottery = (int) (Math.random() * 1000);
		int temp = lottery;
		System.out.println(lottery);

		// Prompt the user to enter a guess
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your lottery pick (three digits): ");
		int guess = input.nextInt();
		int guessTemp = guess;

		//Get digits from lottery
		int lotteryDigit1 = temp % 10;
		temp /= 10;
		int lotteryDigit2 = temp % 10;
		temp /= 10;
		int lotteryDigit3 = temp % 10;

		// Get digits from guess
		int guessDigit1 = guessTemp % 10;
		guessTemp /= 10;
		int guessDigit2 = guessTemp % 10;
		guessTemp /= 10;
		int guessDigit3 = guessTemp % 10;

		System.out.println("The lottery number is " + lottery);

		// Check the guess
		if (lottery == guess) {
			System.out.println("Exact match: you win $12,000");
		} else if ((guessDigit1 == lotteryDigit1 && guessDigit2 == lotteryDigit3 && guessDigit3 == lotteryDigit2)
				|| (guessDigit1 == lotteryDigit2 && guessDigit2 == lotteryDigit1 && guessDigit3 == lotteryDigit3)
				|| (guessDigit1 == lotteryDigit2 && guessDigit2 == lotteryDigit3 && guessDigit3 == lotteryDigit1)
				|| (guessDigit1 == lotteryDigit3 && guessDigit2 == lotteryDigit1 && guessDigit3 == lotteryDigit2)
				|| (guessDigit1 == lotteryDigit3 && guessDigit2 == lotteryDigit2 && guessDigit3 == lotteryDigit1)) {
			System.out.println("Match all digits: you win $5,000");
		} else if (guessDigit1 == lotteryDigit1
				|| guessDigit1 == lotteryDigit2
				|| guessDigit1 == lotteryDigit3
				|| guessDigit2 == lotteryDigit1
				|| guessDigit2 == lotteryDigit2
				|| guessDigit2 == lotteryDigit3
				|| guessDigit3 == lotteryDigit1
				|| guessDigit3 == lotteryDigit2
				|| guessDigit3 == lotteryDigit3) {
			System.out.println("Match one digit: you win $2,000");
		} else {
			System.out.println("Sorry, no match");
		}

		input.close();
	}
}
