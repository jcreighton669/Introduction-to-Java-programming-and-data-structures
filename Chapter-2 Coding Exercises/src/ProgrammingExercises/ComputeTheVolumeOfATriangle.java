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
public class ComputeTheVolumeOfATriangle {

	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter length of the sides and height of the Equilateral triangle: ");
		double length = input.nextDouble();

		double area = (Math.sqrt(3) / 4) * Math.pow(length, 2);

		double volume = area * length;

		System.out.println("The area is " + area);
		System.out.println("The volume of the Triangular prism is " + volume);
		input.close();
	}
}
