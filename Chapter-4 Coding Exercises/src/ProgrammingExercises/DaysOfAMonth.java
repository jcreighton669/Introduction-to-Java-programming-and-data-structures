/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgrammingExercises;

import java.util.Scanner;

/**
 *
 * @author Justin
 */
public class DaysOfAMonth {

	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int days = 0;

		System.out.print("Enter a year: ");
		int year = input.nextInt();

		System.out.print("Enter a month: ");
		String month = input.next();

		boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

		switch (month) {
			case "Jan":
			case "Mar":
			case "May":
			case "Jul":
			case "Aug":
			case "Oct":
			case "Dec":
				days = 31;
				break;
			case "Apr":
			case "Jun":
			case "Sep":
			case "Nov":
				days = 30;
				break;
			case "Feb":
				if (isLeapYear) {
					days = 29;
				} else {
					days = 28;
				}
				break;
		}
		if (days == 0) {
			System.out.println(month + " is not a correct month name");
		} else {
			System.out.println(month + " " + year + " has " + days + " days");
		}
	}
}
