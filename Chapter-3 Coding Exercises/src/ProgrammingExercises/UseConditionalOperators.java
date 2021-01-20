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
public class UseConditionalOperators {

	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter an integer: ");
		int number = input.nextInt();

		boolean and = (number % 4 == 0 && number % 5 == 0);
		boolean or = (number % 4 == 0 || number % 5 == 0);
		boolean xor = (number % 4 == 0 ^ number % 5 == 0);

		System.out.println("Is " + number + " divisible by 4 and 5? " + and);
		System.out.println("Is " + number + " divisible by 4 or 5? " + or);
		System.out.println("Is " + number + " divisible by 4 or 5 but not both? " + xor);
		
		input.close();
	}
}
