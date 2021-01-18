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
public class CostOfShipping {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the weight of the package in pounds: ");
		double weight = input.nextDouble();
		double cost = 0.00;

		if (weight <= 2) {
			cost = 2.50;
		} else if (weight <= 4) {
			cost = 4.50;
		} else if (weight <= 10) {
			cost = 7.50;
		} else if (weight <= 20) {
			cost = 10.50;
		} else {
			System.out.println("The package cannot be shipped. ");
		}

		System.out.println("The shipping cost will be $" + cost);

		input.close();
	}
}
