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
public class ConversionFromSquareMeterToPing {

	public static void main(String[] args) {
		System.out.println("Ping\t\tSquare meter\t|\tSquare meter\t\tPing");

		double squareMeters = 0;
		double pings = 0;
		int j = 30;
		for (int i = 10; i <= 100; i += 5) {

			squareMeters = i * 3.305;
			pings = j / 3.305;
			System.out.printf(i + "\t\t%.3f\t\t\t\t", squareMeters);
			System.out.printf(j + "\t\t%.3f", pings);
			j += 5;
			System.out.println("");
		}
	}
}
