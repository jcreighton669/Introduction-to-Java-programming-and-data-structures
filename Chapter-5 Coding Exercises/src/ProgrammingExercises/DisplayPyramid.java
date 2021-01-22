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
public class DisplayPyramid {

	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of lines: ");
		int number = input.nextInt();
		int temp = number;

		for (int i = 1; i <= number; i++) {
			for (int j = temp; j > 0; j--) {
				System.out.print(j + " ");
			}
			for (int j = 2; j <= temp; j++) {
				System.out.print(j + " ");
			}
			temp--;
			System.out.println();
		}

		input.close();
	}
}
