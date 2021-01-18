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
public class PassOrFail {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter your score: ");
		double score = input.nextDouble();
		do {
			if (score >= 60) {
				System.out.println("You pass the exam.");
			} else if (score < 60) {
				System.out.println("You don't pass the exam. ");
			}

			score = input.nextDouble();
		} while (score != -1);

		if (score == -1) {
			System.out.println("No numbers are entered except 0");
		}

		input.close();
	}
}
