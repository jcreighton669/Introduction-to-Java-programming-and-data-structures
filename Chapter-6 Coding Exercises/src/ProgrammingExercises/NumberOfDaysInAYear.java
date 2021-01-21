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
public class NumberOfDaysInAYear {

	public static void main(String[] args) {
		System.out.println("Year\t# of Days");
		for (int year = 2014; year < 2034; year++) {
			System.out.println(year + "\t  " + numberOfDaysInAYear(year));
		}
	}

	public static int numberOfDaysInAYear(int year) {
		boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
		if (isLeapYear) {
			return 366;
		} else {
			return 365;
		}

	}
}
