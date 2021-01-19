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
public class ConvertLetterGradeToNumber {

	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numValue = -1;

		System.out.print("Enter a letter grade: ");

		char letterGrade = input.next().toUpperCase().charAt(0);
		switch (letterGrade) {
			case 'A':
				numValue = 4;
				break;
			case 'B':
				numValue = 3;
				break;
			case 'C':
				numValue = 2;
				break;
			case 'D':
				numValue = 1;
				break;
			case 'F':
				numValue = 0;
				break;
		}

		if (numValue != -1) {
			System.out.println("The numeric value for grade " + letterGrade + " is " + numValue);
		} else {
			System.out.println(letterGrade + " is an invalid grade");
		}
	}
}
