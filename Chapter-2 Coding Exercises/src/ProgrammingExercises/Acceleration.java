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
public class Acceleration {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter initial velocity, ending velocity, and the time elapsed: ");
		double v0 = input.nextDouble();
		double v1 = input.nextDouble();
		double t = input.nextDouble();

		double acceleration = (v1 - v0) / t;

		System.out.println("The average acceleration is " + acceleration);

		input.close();
	}
}
