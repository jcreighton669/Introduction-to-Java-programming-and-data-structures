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
public class ComparingNumbers {

	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] numbers = new int[11];

		System.out.print("Enter 11 integers: ");

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextInt();
		}

		compareNumbers(numbers);

		input.close();
	}

	/**
	 * Compare each number to the last integer in the array
	 *
	 * @param nums
	 */
	public static void compareNumbers(int[] nums) {
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] > nums[nums.length - 1]) {
				System.out.println(nums[i] + " > " + nums[nums.length - 1]);
			} else if (nums[i] < nums[nums.length - 1]) {
				System.out.println(nums[i] + " < " + nums[nums.length - 1]);
			} else {
				System.out.println(nums[i] + " = " + nums[nums.length - 1]);
			}
		}
	}
}
