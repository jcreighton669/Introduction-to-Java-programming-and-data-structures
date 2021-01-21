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
public class PhoneKeypads {

	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String text = input.nextLine();
		char ch;

		for (int i = 0; i < text.length(); i++) {
			ch = text.charAt(i);
			if (Character.isLetter(ch)) {
				System.out.print(getNumber(ch));
			} else {
				System.out.print(ch);
			}
		}
		System.out.println("");
		
		input.close();
	}

	/**
	 * Convert letter to digit
	 *
	 * @param uppercaseLetter
	 * @return
	 */
	public static int getNumber(char uppercaseLetter) {
		if (Character.isLetter(uppercaseLetter)) {
			switch (Character.toUpperCase(uppercaseLetter)) {
				case 'A':
				case 'B':
				case 'C':
					return 2;
				case 'D':
				case 'E':
				case 'F':
					return 3;
				case 'G':
				case 'H':
				case 'I':
					return 4;
				case 'J':
				case 'K':
				case 'L':
					return 5;
				case 'M':
				case 'N':
				case 'O':
					return 6;
				case 'P':
				case 'Q':
				case 'R':
				case 'S':
					return 7;
				case 'T':
				case 'U':
				case 'V':
					return 8;
				case 'W':
				case 'X':
				case 'Y':
				case 'Z':
					return 9;
			}
		}
		return uppercaseLetter;

	}
}
