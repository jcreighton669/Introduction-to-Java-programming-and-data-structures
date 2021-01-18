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
public class FindTheHighestScore {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double max = Double.MIN_VALUE;
		String maxName = "";

		System.out.print("Enter the number of students: ");
		int numberOfStudents = input.nextInt();

		for (int i = 0; i < numberOfStudents; i++) {
			System.out.print("Enter the students name: ");
			String name = input.next();
			System.out.print("Enter the score of the student: ");
			double grade = input.nextDouble();
			if (grade > max) {
				max = grade;
				maxName = name;
			}
		}

		System.out.println("The highest score is " + max + " by " + maxName);

		input.close();
	}
}
