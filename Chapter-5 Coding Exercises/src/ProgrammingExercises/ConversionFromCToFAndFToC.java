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
public class ConversionFromCToFAndFToC {

	public static void main(String[] args) {
		System.out.println("Celsius\t\tFahrenheit\t|\tFahrenheit\t\tCelsius");

		double fahrenheit = 0;
		double celsius = 0;
		int j = 20;
		for (int i = 0; i <= 100; i += 2) {

			fahrenheit = i * (9 / 5.0) + 32;
			celsius = (j - 32) * (5 / 9.0);
			System.out.printf(i + "\t\t%.3f\t\t\t\t", fahrenheit);
			System.out.printf(j + "\t\t%.3f", celsius);
			j += 5;
			System.out.println("");
		}
	}
}
