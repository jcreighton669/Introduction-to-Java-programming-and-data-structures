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
public class WindChillTemperature {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the temperature in Fahrenheit between -58\u00B0F and 41\u00B0F: ");
		double temperature = input.nextDouble();

		System.out.print("Enter the wind chill(>= 2) in miles per hour: ");
		double windSpeed = input.nextDouble();

		double windChill = 35.74 + (0.6215 * temperature) - (35.75 * (Math.pow(windSpeed, 0.16))) + (0.4275 * temperature * Math.pow(windSpeed, 0.16));
		System.out.println("The windchill index is " + windChill);

		input.close();
	}
}
