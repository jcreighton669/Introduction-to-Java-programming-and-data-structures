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
public class SortStudents {

	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of students: ");
		String[] students = new String[input.nextInt()];
		int[] scores = new int[students.length];

		System.out.println("Enter the students name: ");
		for (int i = 0; i < students.length; i++) {
			System.out.print("Student " + (i + 1) + ": ");
			students[i] = input.next();
			System.out.print("Score: ");
			scores[i] = input.nextInt();
		}

		sortDecreasing(students, scores);

		for (String e : students) {
			System.out.println(e);
		}
		
		input.close();
	}

	/**
	 * Sorts a string and integer array in decreasing array
	 *
	 * @param names
	 * @param nums
	 */
	public static void sortDecreasing(String[] names, int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			int max = nums[i];
			int maxIndex = i;
			String temp;

			for (int j = i + 1; j < nums.length; j++) {
				if (nums[j] > max) {
					max = nums[j];
					maxIndex = j;
				}
			}

			if (maxIndex != i) {
				temp = names[i];
				names[i] = names[maxIndex];
				names[maxIndex] = temp;

				nums[maxIndex] = nums[i];
				nums[i] = max;
			}
		}
	}
}
