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
public class ConversionsPoundsAndKilograms {

	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Kilograms\t\tPounds\t|\t\tPounds\t\tKilograms");
		System.out.println("------------------------------------------------------------------------------");
		double p = 1;
		double k = 20;
		for (int i = 0; i < 100; i++) {
			System.out.printf((int) p + "\t\t%.1f", poundToKilogram(p));
			System.out.print("\t\t|\t\t");
			System.out.printf((int) k + "\t\t\t%.2f", kilogramToPound(k));
			p += 2;
			k += 5;
			System.out.println();
		}
	}

	/**
	 * Return conversion from imperial to metric
	 *
	 * @param pound
	 * @return
	 */
	public static double poundToKilogram(double pound) {
		return pound * 2.20462262;
	}

	/**
	 * Return conversion from metric to imperial
	 *
	 * @param kilogram
	 * @return
	 */
	public static double kilogramToPound(double kilogram) {
		return kilogram * 0.45359237;
	}
}
