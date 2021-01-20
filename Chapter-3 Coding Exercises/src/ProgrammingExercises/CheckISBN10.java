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
public class CheckISBN10 {

	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the first nine integers of ISBN: ");
		int[] nums = new int[9];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = input.nextInt();
		}

		int checksum = 0;
		String isbn = "";

		for (int i = 0; i < nums.length; i++) {
			checksum += (nums[i] * (i + 1));
			isbn += String.valueOf(nums[i]);
		}

		if (checksum % 11 == 10) {
			isbn += "X";
		} else {
			isbn += String.valueOf(checksum % 11);
		}

		System.out.println(isbn);

		input.close();
	}
}
