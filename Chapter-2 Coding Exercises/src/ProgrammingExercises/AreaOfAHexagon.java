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
public class AreaOfAHexagon {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the length of the side: ");
		double length = input.nextDouble();

		double area = ((3 * (Math.sqrt(3))) / 2) * Math.pow(length, 2);

		System.out.println("The area of the hexagon is " + area);

		input.close();
	}
}
