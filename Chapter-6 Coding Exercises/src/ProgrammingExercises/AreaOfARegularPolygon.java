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
public class AreaOfARegularPolygon {

	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of sides: ");
		int n = input.nextInt();

		System.out.print("Enter the side: ");
		double side = input.nextDouble();

		System.out.println("The area of the polygon is " + area(n, side));

		input.close();
	}

	/**
	 * Calculate the area of a regular shape
	 *
	 * @param n
	 * @param side
	 * @return
	 */
	public static double area(int n, double side) {
		double numerator = n * side * side;
		double denominator = 4 * Math.tan(Math.PI / side);
		double area = numerator / denominator;

		return area;
	}
}
