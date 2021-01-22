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
public class ReverseAString {

	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String reverse = "";

		System.out.print("Enter a string: ");
		String text = input.nextLine();

		for (int i = text.length() - 1; i >= 0; i--) {
			reverse += text.charAt(i);
		}

		System.out.println("The reversed string is " + reverse);

		input.close();
	}
}
