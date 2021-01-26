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
public class PointPosition {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // Create a Scanner

		//	Prompt the user to enter the three points for p0, p1, and p2
		System.out.print("Enter three points for p0, p1, and p2: ");
		double x0 = input.nextDouble();
		double y0 = input.nextDouble();
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();

		// Displays whether p2 is on the left of the line from  
		// p0 to p1, right, the same line, or on the line segment.
		System.out.print("(" + x2 + ", " + y2 + ") is on the ");
		if (onTheLineSegment(x0, y0, x1, y1, x2, y2)) {
			System.out.print("line segment ");
		} else if (leftOfTheLine(x0, y0, x1, y1, x2, y2)) {
			System.out.print("left side of the line ");
		} else if (onTheSameLine(x0, y0, x1, y1, x2, y2)) {
			System.out.print("same line ");
		} else {
			System.out.print("right side of the line");
		}
		System.out.println("from " + "(" + x0 + ", " + y0 + ") to (" + x1 + ", " + y1 + ")");

		input.close();
	}

	/**
	 * Return true if point (x2, y2) is on the left side of the directed line from (x0, y0) to (x1, y1)
	 *
	 * @param x0
	 * @param y0
	 * @param x1
	 * @param y1
	 * @param x2
	 * @param y2
	 * @return
	 */
	public static boolean leftOfTheLine(double x0, double y0, double x1, double y1, double x2, double y2) {
		return pointPosition(x0, y0, x1, y1, x2, y2) > 0;
	}

	/**
	 * Return true if point (x2, y2) is on the same line from (x0, y0) to (x1, y1)
	 *
	 * @param x0
	 * @param y0
	 * @param x1
	 * @param y1
	 * @param x2
	 * @param y2
	 * @return
	 */
	public static boolean onTheSameLine(double x0, double y0, double x1, double y1, double x2, double y2) {
		return pointPosition(x0, y0, x1, y1, x2, y2) == 0;
	}

	/**
	 * Return true if point (x2, y2) is on the line segment from (x0, y0) to (x1, y1)
	 *
	 * @param x0
	 * @param y0
	 * @param y2
	 * @param x1
	 * @param y1
	 * @param x2
	 * @return
	 */
	public static boolean onTheLineSegment(double x0, double y0, double x1, double y1, double x2, double y2) {
		return (pointPosition(x0, y0, x1, y1, x2, y2) == 0
				&& (x2 > x0) && (y2 > y0) && (x2 < x1) && (y2 < y1));
	}

	/**
	 * Method pointPosition returns the position of p2 to p0 and p1
	 *
	 * @param x0
	 * @param y0
	 * @param x2
	 * @param y1
	 * @param x1
	 * @param y2
	 * @return
	 */
	public static double pointPosition(double x0, double y0, double x1, double y1, double x2, double y2) {
		return (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
	}
}
