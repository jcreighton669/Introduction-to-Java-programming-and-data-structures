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
public class CountVowelsInString {

	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final char[] VOWELS = {'a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U', 'y', 'Y'};

		int count = 0;
		System.out.print("Enter a string: ");
		String str = input.nextLine();

		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < VOWELS.length; j++) {
				if (str.charAt(i) == VOWELS[j]) {
					count++;
				}
			}
		}

		System.out.println("There are " + count + " vowels in the string.");
		
		input.close();
	}
}
