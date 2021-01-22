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
public class HeadsOrTails {

	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		int headCount = 0;
		int tailsCount = 0;

		for (int i = 0; i < 2000000; i++) {
			int result = (int) (Math.random() * 10) % 2;
			if (result == 0) {
				headCount++;
			} else {
				tailsCount++;
			}
		}

		System.out.print("Heads: " + headCount + "\nTails: " + tailsCount);
	}
}
