/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgrammingExercises;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Justin
 */
public class HeadsOrTails {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int result = (int) (Math.random() * 10) % 2;

		System.out.print("Guess the coinflip (0-Heads, 1-Tails): ");
		int guess = input.nextInt();
		if (result == guess) {
			System.out.println("You guessed it correctly");
		} else {
			System.out.println("You guessed incorrectly");
		}

		input.close();
	}
}
