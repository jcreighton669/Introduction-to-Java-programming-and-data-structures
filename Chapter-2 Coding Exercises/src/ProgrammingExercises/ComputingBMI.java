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
public class ComputingBMI {

	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter weight in pounds: ");
		double weightInPounds = input.nextDouble();

		System.out.print("Enter the height in inches: ");
		double heightInInches = input.nextDouble();

		double weightInKilos = weightInPounds * 0.45359237;
		double heightInMeters = heightInInches * 0.0254;

		double bmi = (weightInKilos) / (Math.pow(heightInMeters, 2));

		System.out.println("BMI is " + bmi);

		input.close();
	}
}
