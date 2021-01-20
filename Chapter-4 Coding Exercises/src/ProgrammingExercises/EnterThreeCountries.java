/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgrammingExercises;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Justin
 */
public class EnterThreeCountries {

	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the first country: ");
		String first = input.nextLine();

		System.out.print("Enter the second country: ");
		String second = input.nextLine();

		System.out.print("Enter the third country: ");
		String third = input.nextLine();

		String[] countries = {first, second, third};

		Arrays.sort(countries);
		System.out.println("The three countries in descending order are " + countries[2] + " " + countries[1] + " " + countries[0]);

		input.close();
	}
}
