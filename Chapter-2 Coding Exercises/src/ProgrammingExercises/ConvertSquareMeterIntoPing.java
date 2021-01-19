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
public class ConvertSquareMeterIntoPing {

	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double pingPerSquareMeter = 0.3025;

		System.out.print("Enter a number in square meters: ");
		double squareMeters = input.nextDouble();

		double pings = pingPerSquareMeter * squareMeters;

		System.out.println(squareMeters + " square meters is " + pings + " pings");
		input.close();
	}
}
