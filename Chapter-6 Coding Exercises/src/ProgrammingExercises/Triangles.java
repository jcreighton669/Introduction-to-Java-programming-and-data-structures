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
public class Triangles {

	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the side lengths: ");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();

		if (area(side1, side2, side3) == -1) {
			System.out.println("Invalid triangle sides");
		} else {
			System.out.println("The area of a triangle with these sides is " + area(side1, side2, side3));
		}
		input.close();
	}

	/**
	 * Return true if the sum of every two sides is greater than the third side.
	 *
	 * @param side1
	 * @param side2
	 * @param side3
	 * @return
	 */
	public static boolean isValid(double side1, double side2, double side3) {
		return side1 + side2 > side3 && side2 + side3 > side1 && side1 + side3 > side2;
	}

	/**
	 * Return the area of the triangle
	 *
	 * @param side1
	 * @param side2
	 * @param side3
	 * @return
	 */
	public static double area(double side1, double side2, double side3) {
		if (isValid(side1, side2, side3)) {
			double s = (side1 + side2 + side3) / 2;

			double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

			return area;
		} else {
			return -1;
		}
	}
}
