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
public class PointInACircle {

	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double x1 = 0;
		double y1 = 0;

		System.out.print("Enter a point with two coordinates: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();

		double distance = Math.sqrt(Math.pow(y2 - y1, 2) + Math.pow(x2 - x1, 2));

		if (distance > 10) {
			System.out.println("Point (" + x2 + ", " + y2 + ") is not in the circle");
		} else {
			System.out.println("Point (" + x2 + ", " + y2 + ") is in the circle");
		}
	}
}
