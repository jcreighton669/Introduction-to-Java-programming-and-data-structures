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
public class AssignGrades {

	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		int students = input.nextInt();

		int[] scores = new int[students];
		char[] grades = new char[students];

		System.out.print("Enter " + students + " scores: ");
		for (int i = 0; i < scores.length; i++) {
			scores[i] = input.nextInt();
		}

		getGrades(scores, grades);

		for (int i = 0; i < scores.length; i++) {
			System.out.println("Student " + i + " score is " + scores[i] + " and grade is " + grades[i]);
		}

		input.close();
	}

	/**
	 * Return the highest score from the array
	 *
	 * @param array
	 * @return
	 */
	public static int max(int[] array) {
		int max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}

	/**
	 * Assign the scores a letter grade at the same index of the character array
	 *
	 * @param scores
	 * @param grades
	 */
	public static void getGrades(int[] scores, char[] grades) {
		int best = max(scores);
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] >= (best - 5)) {
				grades[i] = 'A';
			} else if (scores[i] >= (best - 10)) {
				grades[i] = 'B';
			} else if (scores[i] >= (best - 15)) {
				grades[i] = 'C';
			} else if (scores[i] >= (best - 20)) {
				grades[i] = 'D';
			} else {
				grades[i] = 'F';
			}
		}
	}
}
