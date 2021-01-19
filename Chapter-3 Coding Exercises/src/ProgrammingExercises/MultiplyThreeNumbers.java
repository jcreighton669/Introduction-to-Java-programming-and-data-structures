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
public class MultiplyThreeNumbers {

	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int number1 = (int) (System.currentTimeMillis() % 10);
		int number2 = (int) (System.currentTimeMillis() / 10 % 10);
		int number3 = (int) (System.currentTimeMillis() / 5 % 10);

		System.out.println("What is " + number1 + " * " + number2 + " * " + number3 + "?");

		int answer = input.nextInt();

		System.out.println(number1 + " * " + number2 + " * " + number3 + " = " + answer + " is " + (number1 * number2 * number3 == answer));

		input.close();
	}
}
