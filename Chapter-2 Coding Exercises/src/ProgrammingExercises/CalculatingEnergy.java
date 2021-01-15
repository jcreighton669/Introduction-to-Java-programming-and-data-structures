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
public class CalculatingEnergy {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the amount of water in kilograms: ");
		double kiloOfWater = input.nextDouble();

		System.out.print("Enter the initial temperature: ");
		double initialTemp = input.nextDouble();

		System.out.print("Enter the final temperature: ");
		double finalTemp = input.nextDouble();

		double energy = kiloOfWater * (finalTemp - initialTemp) * 4184;

		System.out.println("The energy needed is " + energy);

		input.close();
	}
}
