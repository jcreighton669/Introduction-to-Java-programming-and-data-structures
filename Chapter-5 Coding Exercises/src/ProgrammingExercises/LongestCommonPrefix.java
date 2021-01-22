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
public class LongestCommonPrefix {

	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String prefix = "";
		int index = 0;

		System.out.print("Enter the first string: ");
		String str1 = input.nextLine();

		System.out.print("Enter the second string: ");
		String str2 = input.nextLine();

		while (str1.charAt(index) == str2.charAt(index)) {
			prefix += str1.charAt(index);
			index++;
		}

		if (prefix.length() != 0) {
			System.out.println("The common prefix is " + prefix);
		} else {
			System.out.println(str1 + " and " + str2 + " have no common prefix");
		}
	}
}
