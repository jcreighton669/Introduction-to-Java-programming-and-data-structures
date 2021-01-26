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
public class SieveOfEratosthenes {

	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		final int NUM_LIMIT = 50;
		boolean[] flags = new boolean[NUM_LIMIT];
		for (int i = 0; i < flags.length; i++) {
			flags[i] = true;
		}

		for (int i = 2; i < flags.length; i++) {
			if (flags[i] == true) {
				for (int j = 2; i * j < flags.length; j++) {
					flags[i * j] = false;
				}
			}
		}

		for (int i = 2; i < flags.length; i++) {
			if (flags[i] == true) {
				System.out.println(i);
			}
		}
	}
}
