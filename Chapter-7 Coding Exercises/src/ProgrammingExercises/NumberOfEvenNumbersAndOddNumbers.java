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
public class NumberOfEvenNumbersAndOddNumbers {

	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		int evens = 0;
		int odds = 0;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter numbers: ");
		int number = input.nextInt();
		do {
			if (isEven(number)) {
				evens++;
			} else {
				odds++;
			}
			number = input.nextInt();
		} while (number != 0);

		System.out.println("The number of odd numbers: " + odds);
		System.out.println("The number of even numbers: " + evens);
		
		input.close();
	}

	public static boolean isEven(int num) {
		return num % 2 == 0;
	}
}
