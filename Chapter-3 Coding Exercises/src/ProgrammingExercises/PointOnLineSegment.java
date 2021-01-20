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
public class PointOnLineSegment {

	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter three points for p0, p1, p2: ");
		double x0 = input.nextDouble();
		double y0 = input.nextDouble();
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();

		double location = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
		if (location == 0) {
			if ((x2 >= x0 && x2 <= x1) && (y2 >= y0 && y2 <= y1)) {
				System.out.println("(" + x2 + ", " + y2 + ") is on the line segment from "
						+ "(" + x0 + ", " + y0 + ") to (" + x1 + ", " + y1 + ")");
			} else {
				System.out.println("(" + x2 + ", " + y2 + ") is not on the line segment from "
						+ "(" + x0 + ", " + y0 + ") to (" + x1 + ", " + y1 + ")");
			}

		} else {
			System.out.println("(" + x2 + ", " + y2 + ") is not on the line segment from "
					+ "(" + x0 + ", " + y0 + ") to (" + x1 + ", " + y1 + ")");

		}
		
		input.close();
	}
}
