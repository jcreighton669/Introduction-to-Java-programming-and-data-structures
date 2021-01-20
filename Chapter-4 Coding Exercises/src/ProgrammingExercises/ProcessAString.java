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
public class ProcessAString {

	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a string of text: ");
		String text = input.nextLine();

		System.out.println("The text was " + text.length() + " characters long and the final character is " + text.charAt(text.length() - 1));

		input.close();
	}
}
