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
public class DisplayLeapYears {

	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		final int NUMBERS_PER_LINE = 10;
		int count = 0;
		for (int year = 2014; year < 2114; year++) {
			boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

			if (isLeapYear) {
				count++;
				if (count % NUMBERS_PER_LINE == 0) {
					System.out.println(year);
				} else {
					System.out.print(year + "\t");
				}
			}
		}

	}
}
