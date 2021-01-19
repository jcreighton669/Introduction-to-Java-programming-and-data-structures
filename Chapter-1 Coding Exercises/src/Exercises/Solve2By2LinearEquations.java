/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercises;

/**
 *
 * @author Justin
 */
public class Solve2By2LinearEquations {

	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		double a = 3.4;
		double b = 50.2;
		double c = 44.5;
		double d = 2.1;
		double e = .55;
		double f = 5.9;
		double x = 0;
		double y = 0;
		
		if ((a * d) - (b * c) != 0) {
			x = ((e * d) - (b * f)) / ((a * d) - (b * c));
			y = ((a * f) - (e * c)) / ((a * d) - (b * c));
		}
		System.out.println("x: " + x);
		System.out.println("y: " + y);
		
	}
}
