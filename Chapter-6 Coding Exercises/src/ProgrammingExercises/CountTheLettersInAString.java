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
public class CountTheLettersInAString {

	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String s = input.nextLine();
		
		System.out.println("There are " + countLetters(s) + " letters in \n\"" + s + "\"");
		
		input.close();
	}

	/**
	 * Count the letters in a string of text
	 *
	 * @param s
	 * @return
	 */
	public static int countLetters(String s) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (Character.isLetter(ch)) {
				count++;
			}
		}
		return count;
	}
}
