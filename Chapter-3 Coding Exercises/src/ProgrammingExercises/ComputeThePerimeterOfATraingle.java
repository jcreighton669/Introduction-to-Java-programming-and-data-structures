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
public class ComputeThePerimeterOfATraingle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter three points
		System.out.print("Enter three points: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();

		double a = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));
		double b = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
		double c = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));

		double perimeter = ((a + b + c) * 100) / 100.0;
		if (a + b > c && b + c > a && a + c > b) {
			System.out.println("The perimeter of the triangle is " + perimeter);
		} else {
			System.out.println("These points do not make a triangle. ");
		}
	}
}
