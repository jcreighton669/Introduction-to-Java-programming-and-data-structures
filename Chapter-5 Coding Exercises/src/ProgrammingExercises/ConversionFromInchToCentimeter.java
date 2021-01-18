/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgrammingExercises;

/**
 *
 * @author Justin
 */
public class ConversionFromInchToCentimeter {

	public static void main(String[] args) {
		System.out.println("Inches\t\tCentimeter");

		double centimeter = 0;

		for (int i = 0; i <= 10; i++) {
			centimeter = i * 2.54;
			System.out.printf(i + "\t\t%.1f", centimeter);
			System.out.println("");
		}
	}
}
