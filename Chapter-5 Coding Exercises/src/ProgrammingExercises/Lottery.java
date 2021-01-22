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
		Scanner input = new Scanner(System.in);
		int lotteryD1 = -1;
		int lotteryD2 = -2;

		// Generate lottery numbers
		do {
			lotteryD1 = (int) (Math.random() * 10);
			lotteryD2 = (int) (Math.random() * 10);

			if (lotteryD1 == lotteryD2) {
				lotteryD1 = (int) (Math.random() * 10);
				lotteryD2 = (int) (Math.random() * 10);
			}
		} while (lotteryD1 <= 0 && lotteryD2 <= 0);

		// Convert single digits to two digit number
		int lottery = Integer.parseInt(Integer.toString(lotteryD1) + Integer.toString(lotteryD2));

		System.out.print("Enter your lottery pick (two digits): ");
		int guess = input.nextInt();
		int guessTemp = guess;

		int guessDigit1 = guessTemp % 10;
		guessTemp /= 10;
		int guessDigit2 = guessTemp % 10;

		System.out.println("The lottery number is " + lottery);

		if (guess == lottery) {
			System.out.println("Exact match: you win $10,000");
		} else if (guessDigit2 == lotteryD1 && guessDigit1 == lotteryD2) {
			System.out.println("Match all digits: you win $3,000");
		} else if (guessDigit1 == lotteryD1
				|| guessDigit1 == lotteryD2
				|| guessDigit2 == lotteryD1
				|| guessDigit2 == lotteryD2) {
			System.out.println("Match one digit: you win $1,000");
		} else {
			System.out.println("Sorry, no match");
		}
		
		input.close();
	}
}
