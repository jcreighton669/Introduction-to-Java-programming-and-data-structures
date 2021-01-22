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
public class ScissorRockPaper {

	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int computerWins = 0;
		int playerWins = 0;

		do {
			int computer = (int) (Math.random() * 3);

			System.out.print("scissor (0), rock(1), paper (2): ");
			int user = input.nextInt();

			System.out.print("The computer is ");
			switch (computer) {
				case 0:
					System.out.print("scissor.");
					break;
				case 1:
					System.out.print("rock.");
					break;
				case 2:
					System.out.print("paper.");
					break;
			}

			System.out.print(" You are ");
			switch (user) {
				case 0:
					System.out.print("scissor");
					break;
				case 1:
					System.out.print("rock");
					break;
				case 2:
					System.out.print("paper");
					break;
				default:
					System.out.println(
							"disqualified for entering an invalid number.");
					System.exit(1);
			}

			if (computer == user) {
				System.out.println(" too, It is a draw");
			} else {
				boolean win = (user == 0 && computer == 2)
						|| (user == 1 && computer == 0)
						|| (user == 2 && computer == 1);
				if (win) {
					System.out.println(". You won");
					computerWins++;
				} else {
					System.out.println(". You lose");
					playerWins++;
				}

			}

			System.out.println("Computer wins: " + computerWins + "\nUser wins: " + playerWins);

		} while (Math.abs(computerWins - playerWins) <= 2);

		input.close();
	}
}
