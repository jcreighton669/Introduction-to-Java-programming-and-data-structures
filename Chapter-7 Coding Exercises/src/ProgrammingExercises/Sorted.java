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
public class Sorted {

	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter list: ");
		int[] nums = new int[input.nextInt()];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = input.nextInt();
		}

		if (isSorted(nums)) {
			System.out.println("The list is alreay sorted");
		} else {
			System.out.println("The list is not sorted");
		}
	}

	public static boolean isSorted(int[] nums) {
		boolean flag = false;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] >= nums[i + 1]) {
				flag = true;
			} else {
				flag = false;
				break;
			}
		}
		return flag;
	}
}
