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
public class VowelOrConsonant {

	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a letter: ");
		char ch = input.next().charAt(0);

		if (Character.isLetter(ch)) {
			switch (Character.toUpperCase(ch)) {
				case 'A':
				case 'E':
				case 'I':
				case 'O':
				case 'U':
				case 'Y':
					System.out.println(ch + " is a vowel");
					break;
				default:
					System.out.println(ch + " is a consonant");
					break;
			}
		} else {
			System.out.println(ch + " is an invalid input");
		}

		input.close();
	}
}
