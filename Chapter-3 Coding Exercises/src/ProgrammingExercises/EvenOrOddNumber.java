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
public class EvenOrOddNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter an integer: ");
		int number = input.nextInt();

		if (number % 2 == 0) {
			System.out.println(number + " is even number. ");
		} else {
			System.out.println(number + " is odd number. ");
		}

		input.close();
	}
}
