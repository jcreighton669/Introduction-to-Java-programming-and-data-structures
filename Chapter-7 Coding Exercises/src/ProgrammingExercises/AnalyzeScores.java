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
public class AnalyzeScores {

	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter scores (negative number signifies end): ");

		double[] scores = new double[100];
		double num;
		int numberOfScores = 0;
		int average = 0;

		for (int i = 0; i < 100; i++) {
			num = input.nextDouble();

			if (num < 0) {
				break;
			}

			scores[i] = num;
			average += num;
			numberOfScores++;
		}

		average /= numberOfScores;

		int numBelowAve = 0;
		int aboveOrEqual = 0;

		for (int i = 0; i < scores.length; i++) {
			if (scores[i] < average) {
				numBelowAve++;
			} else {
				aboveOrEqual++;
			}
		}

		System.out.println("The avereage of the numbers is " + average);
		System.out.println("Number below the average: " + numBelowAve);
		System.out.println("Number above or equal to the average: " + aboveOrEqual);

		input.close();
	}
}
