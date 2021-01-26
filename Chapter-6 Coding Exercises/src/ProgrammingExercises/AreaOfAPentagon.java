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
public class AreaOfAPentagon {

	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the side: ");
		double side = input.nextDouble();

		System.out.println("The area of the pentagon is " + area(side));
		
		input.close();
	}

	/**
	 * Get the area of regular pentagon
	 *
	 * @param side
	 * @return
	 */
	public static double area(double side) {
		double area = (5 * side * side) / (4 * (Math.tan(Math.PI / 5)));

		return area;
	}
}
