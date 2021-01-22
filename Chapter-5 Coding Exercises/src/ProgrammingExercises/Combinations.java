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
public class Combinations {

	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		int count = 0;

		for (int i = 1; i < 7; i++) {
			for (int j = i + 1; j <= 7; j++) {
				System.out.println(i + " " + j);
				count++;
			}
		}

		System.out.println("The total number of all combinations is " + count);
	}
}
