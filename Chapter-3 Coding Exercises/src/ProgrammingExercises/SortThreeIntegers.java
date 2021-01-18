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
public class SortThreeIntegers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter three integers: ");
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		int number3 = input.nextInt();
		int max = number1;
		int mid = number1;
		int min = number1;

		if (number1 >= number2 && number1 >= number3) {
			if (number2 >= number3) {
				max = number1;
				mid = number2;
				min = number3;
			} else {
				max = number1;
				mid = number3;
				min = number2;
			}
		} else if (number2 >= number1 && number2 >= number3) {
			if (number1 >= number3) {
				max = number2;
				mid = number1;
				min = number3;
			} else {
				max = number2;
				mid = number3;
				min = number1;
			}
		} else if (number3 >= number1 && number3 >= number1) {
			if (number1 >= number2) {
				max = number3;
				mid = number1;
				min = number2;
			} else {
				max = number3;
				mid = number2;
				min = number1;
			}
		}

		System.out.println("These numbers are ordered as " + min + ", " + mid + ", " + max);
		input.close();
	}
}
