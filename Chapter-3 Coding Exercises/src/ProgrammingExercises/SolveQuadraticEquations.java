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
public class SolveQuadraticEquations {

	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a, b, c: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();

		double discriminant = (Math.pow(b, 2)) - 4 * a * c;

		if (discriminant > 0) {
			double r1 = (-b + Math.sqrt(discriminant)) / 2 * a;
			double r2 = (-b - Math.sqrt(discriminant)) / 2 * a;
			System.out.println("The equation has two roots " + r1 + " and " + r2);
		} else if (discriminant == 0) {
			double r = (-b + Math.sqrt(discriminant)) / 2 * a;
			System.out.println("The equation has one root " + r);
		} else if (discriminant < 0) {
			System.out.println("The equation has no real roots");
		}

		input.close();
	}
}
