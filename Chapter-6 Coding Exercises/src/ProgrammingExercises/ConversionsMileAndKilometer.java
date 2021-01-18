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
public class ConversionsMileAndKilometer {

	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Miles\t\tKilometers\t|\t\tKilometers\t\tMiles");
		System.out.println("------------------------------------------------------------------------------");
		double m = 1;
		double k = 20;
		for (int i = 0; i < 10; i++) {
			System.out.printf(m + "\t\t%.3f", mileToKilometer(m));
			System.out.print("\t\t|\t\t");
			System.out.printf(k + "\t\t\t%.3f", kilometerToMile(k));
			m++;
			k += 5;
			System.out.println();
		}
	}

	/**
	 * Convert from Mile to Kilometer
	 *
	 * @param mile
	 * @return
	 */
	public static double mileToKilometer(double mile) {
		return mile * 1.609;
	}

	/**
	 * Convert from Kilometer to Mile
	 *
	 * @param kilometer
	 * @return
	 */
	public static double kilometerToMile(double kilometer) {
		return kilometer / 1.609;
	}
}
