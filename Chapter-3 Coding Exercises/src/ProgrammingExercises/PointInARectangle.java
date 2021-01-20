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
public class PointInARectangle {

	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a point with two coordinates: ");
		double x = input.nextDouble();
		double y = input.nextDouble();

		if ((10.0 / 2 >= Math.abs(x)) && (5.0 / 2 >= Math.abs(y))) {
			System.out.println("Point (" + x + ", " + y + ") is in the rectangle");
		} else {
			System.out.println("Point (" + x + ", " + y + ") is not in the rectangle");
		}

		input.close();
	}
}
