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
public class CountOccurrenceOfNumbers {

	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] nums = new int[100];

		System.out.print("Enter the integers between 1 and 50: ");

		compareIntegers(nums);

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > 0) {
				System.out.println((i + 1) + " occurs " + nums[i] + " time" + (nums[i] > 1 ? "s" : ""));
			}
		}

		input.close();
	}

	/**
	 * Method count reads integers between 1 and 100 and counts the occurrences of each
	 *
	 * @param array
	 */
	public static void compareIntegers(int[] array) {
		Scanner input = new Scanner(System.in);
		int num;
		do {
			num = input.nextInt();
			if (num >= 1 && num <= 100) {
				array[num - 1]++;
			}
		} while (num != 0);
	}
}
