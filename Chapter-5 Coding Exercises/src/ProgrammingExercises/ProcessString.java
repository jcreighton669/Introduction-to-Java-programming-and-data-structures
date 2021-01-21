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
public class ProcessString {

	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String text = input.nextLine();
		String evenText = "";

		for (int i = 1; i < text.length(); i++) {
			if (i % 2 == 0) {
				evenText += text.charAt(i);
			}
		}

		System.out.println(evenText);

		input.close();
	}
}
