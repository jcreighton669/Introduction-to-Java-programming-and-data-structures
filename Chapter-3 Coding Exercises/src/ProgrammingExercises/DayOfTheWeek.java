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
public class DayOfTheWeek {

	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String day = "";

		System.out.print("Enter year (e.g., 2015): ");
		int year = input.nextInt();
		int j = year / 100;
		int k = year % 100;

		System.out.print("Enter the month (1 - 12): ");
		int m = input.nextInt();

		System.out.print("Enter the day of the month (1 - 31): ");
		int q = input.nextInt();

		int h = (q + (26 * (m + 1) / 10) + k + (k / 4) + (j / 4) + (5 * j)) % 7;

		switch (h) {
			case 1:
				day = "Sunday";
				break;
			case 2:
				day = "Monday";
				break;
			case 3:
				day = "Tuesday";
				break;
			case 4:
				day = "Wednesday";
				break;
			case 5:
				day = "Thursday";
				break;
			case 6:
				day = "Friday";
				break;
			case 0:
				day = "Saturday";
				break;
		}

		System.out.println("Day of the week is " + day);
	}
}
