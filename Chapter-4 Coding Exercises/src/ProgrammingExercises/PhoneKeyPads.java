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
public class PhoneKeyPads {

	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a letter: ");
		char letter = input.next().charAt(0);
		int dialpadDigit = -1;

		if (Character.isLetter(letter)) {
			switch (Character.toLowerCase(letter)) {
				case 'a':
				case 'b':
				case 'c':
					dialpadDigit = 2;
					break;
				case 'd':
				case 'e':
				case 'f':
					dialpadDigit = 3;
					break;
				case 'g':
				case 'h':
				case 'i':
					dialpadDigit = 4;
					break;
				case 'j':
				case 'k':
				case 'l':
					dialpadDigit = 5;
					break;
				case 'm':
				case 'n':
				case 'o':
					dialpadDigit = 6;
					break;
				case 'p':
				case 'q':
				case 'r':
				case 's':
					dialpadDigit = 7;
					break;
				case 't':
				case 'u':
				case 'v':
					dialpadDigit = 8;
					break;
				case 'w':
				case 'x':
				case 'y':
				case 'z':
					dialpadDigit = 9;
					break;
			}
			System.out.println("The corresponding number is " + dialpadDigit);
		} else {
			System.out.println(letter + " is an invalid input");
		}

	}
}
