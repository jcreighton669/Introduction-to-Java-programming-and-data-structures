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
public class CountSingleDigits {

	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		int zeros = 0;
		int ones = 0;
		int twos = 0;
		int threes = 0;
		int fours = 0;
		int fives = 0;
		int sixes = 0;
		int sevens = 0;
		int eights = 0;
		int nines = 0;

		for (int i = 0; i < 200; i++) {
			int num = (int) (Math.random() * 10);
			switch (num) {
				case 0:
					zeros++;
					break;
				case 1:
					ones++;
					break;
				case 2:
					twos++;
					break;
				case 3:
					threes++;
					break;
				case 4:
					fours++;
					break;
				case 5:
					fives++;
					break;
				case 6:
					sixes++;
					break;
				case 7:
					sevens++;
					break;
				case 8:
					eights++;
					break;
				case 9:
					nines++;
					break;
			}
		}
		int[] counts = {zeros, ones, twos, threes, fours, fives, sixes, sevens, eights, nines};

		for (int i = 0; i < counts.length; i++) {
			System.out.println(i + ": " + counts[i]);
		}

	}
}
