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
public class MultiplicationQuiz {

	public static void main(String[] args) {
		int number1 = (int) (Math.random() * 1000);
		int number2 = (int) (Math.random() * 1000);

		System.out.print("What is " + number1 + " * " + number2 + "? ");
		Scanner input = new Scanner(System.in);
		int answer = input.nextInt();

		if (number1 * number2 == answer) {
			System.out.println("You are correct!");
		} else {
			System.out.println("Your answer is wrong.");
			System.out.println(number1 + " * " + number2 + " should be " + (number1 - number2));
		}

		input.close();
	}
}
