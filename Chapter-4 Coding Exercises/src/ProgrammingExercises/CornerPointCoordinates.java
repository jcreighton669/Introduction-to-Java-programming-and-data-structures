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
public class CornerPointCoordinates {

	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the radius of the bounding circle: ");
		double radius = input.nextDouble();

		System.out.println("The coordinates of five points on the pentagon are: ");
		for (int i = 0; i < 5; i++) {
			double x = radius * Math.sin(2.0 * Math.PI / 5.0 * i);
			double y = radius * Math.cos(2.0 * Math.PI / 5.0 * i);
			System.out.printf("(%.2f", x);
			System.out.printf(", %.2f)", y);
			System.out.println();
		}
		
		input.close();
	}
}
