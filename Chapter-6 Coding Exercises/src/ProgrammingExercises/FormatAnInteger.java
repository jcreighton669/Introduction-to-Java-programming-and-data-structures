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
public class FormatAnInteger {

	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int num = input.nextInt();

		System.out.print("Enter the width of the output: ");
		int width = input.nextInt();

		System.out.println(num + " formatted to width " + width + ": " + format(num, width));
	}

	/**
	 * Method format returns a string for the number with one or more prefix 0s
	 *
	 * @param number
	 * @param width
	 * @return
	 */
	public static String format(int number, int width) {
		String num = number + "";

		if (num.length() < width) {
			for (int i = width - num.length(); i > 0; i--) {
				num = 0 + num;
			}
		}
		return num;
	}
}
