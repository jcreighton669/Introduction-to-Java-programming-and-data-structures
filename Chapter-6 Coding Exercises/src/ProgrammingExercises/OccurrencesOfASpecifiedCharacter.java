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
public class OccurrencesOfASpecifiedCharacter {

	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String text = input.nextLine();

		System.out.print("Enter the letter to count: ");
		char ch = input.nextLine().charAt(0);

		int count = count(text, ch);

		System.out.println("The charcter " + ch + " appears " + count + " in \n\"" + text + "\"");
	}

	/**
	 * Count the number of occurrences of a in str
	 *
	 * @param str
	 * @param a
	 * @return
	 */
	public static int count(String str, char a) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (Character.toLowerCase(a) == str.toLowerCase().charAt(i)) {
				count++;
			}
		}
		return count;
	}
}
