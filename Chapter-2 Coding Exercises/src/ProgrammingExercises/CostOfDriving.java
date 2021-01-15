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
public class CostOfDriving {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the driving distance: ");
		double distance = input.nextDouble();

		System.out.print("Enter miles per gallon: ");
		double gasMilage = input.nextDouble();

		System.out.print("Enter price per gallon: ");
		double gasPricePerGallon = input.nextDouble();

		double costOfDriving = (distance / gasMilage) * gasPricePerGallon;

		System.out.println("The cost of driving is $" + costOfDriving);

		input.close();
	}
}
