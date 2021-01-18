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
public class ConversionFromCToF {

	public static void main(String[] args) {
		System.out.println("Celsius\t\tFahrenheit");

		double fahrenheit = 0;

		for (int i = 0; i <= 100; i += 2) {
			fahrenheit = i * (9 / 5.0) + 32;
			System.out.printf(i + "\t\t%.1f", fahrenheit);
			System.out.println("");
		}
	}
}
