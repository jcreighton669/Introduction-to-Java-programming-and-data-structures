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
public class FindTheLowestScores {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double min = Double.MAX_VALUE;
		double nextMin = min - 1;
		String minName = "";
		String nextName = "";

		System.out.print("Enter the number of students: ");
		int numberOfStudents = input.nextInt();

		for (int i = 0; i < numberOfStudents; i++) {
			System.out.print("Enter the students name: ");
			String name = input.next();
			System.out.print("Enter the score of the student: ");
			double grade = input.nextDouble();
			if (grade < nextMin) {
				if (grade < min) {
					min = grade;
					minName = name;
					continue;
				}
				nextMin = grade;
				nextName = name;
			}
		}

		System.out.println("The lowest score is " + min + " by " + minName);
		System.out.println("The next lowest score is " + nextMin + " by " + nextName);

		input.close();
	}
}
