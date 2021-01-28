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
public class ReverseAnArray {

	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] numbers = new int[10];

		System.out.print("Enter 10 integers: ");
		for (int i = 0; i < 10; i++) {
			numbers[i] = input.nextInt();
		}

		System.out.println("Original array: ");
		for (int i = 0; i < 10; i++) {
			System.out.print(numbers[i] + " ");
		}
		int[] revNums = reverse(numbers);

		System.out.println("\nReversed array: ");
		for (int i = 0; i < 10; i++) {
			System.out.print(revNums[i] + " ");
		}

		input.close();
	}

	/**
	 * Reverse an array of integers
	 *
	 * @param array
	 * @return
	 */
	public static int[] reverse(int[] array) {
		int[] reversedArray = new int[array.length];
		int j = 0;
		for (int i = array.length - 1; i >= 0; i--) {
			reversedArray[j] = array[i];
			j++;
		}
		return reversedArray;
	}
}
