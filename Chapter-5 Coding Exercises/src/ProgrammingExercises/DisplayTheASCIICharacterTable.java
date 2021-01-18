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
public class DisplayTheASCIICharacterTable {

	/**
	 * Main Method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		char start = '!';
		char end = '~';
		final int NUMBERS_PER_LINE = 10;

		int startValue = start;
		int endValue = end;
		int count = 0;

		for (int i = startValue; i < endValue; i++) {
			count++;
			if (count % NUMBERS_PER_LINE == 0) {
				System.out.println(i);
			} else {
				System.out.print(i + " ");
			}

		}
	}
}
