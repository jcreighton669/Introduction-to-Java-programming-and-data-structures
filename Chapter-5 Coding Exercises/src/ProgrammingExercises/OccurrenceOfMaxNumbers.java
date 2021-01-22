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
public class OccurrenceOfMaxNumbers {

	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter numbers: ");
		int max = input.nextInt();
		int count = 1;
		int number = -1;

		while (number != 0) {
			number = input.nextInt();
			if (number > max) {
				max = number;
				count = 1;
			}
			if (number == max) {
				count++;
			}
		}

		System.out.println("The largest number is " + max);
		System.out.println("The occurrence count of the largest number is " + count);

		input.close();
	}
}
