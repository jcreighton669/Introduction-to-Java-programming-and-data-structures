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
public class FindFutureDates {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter today's day: ");
		int day = input.nextInt();

		System.out.print("Enter the number of days elapsed since today: ");
		int daysPast = input.nextInt();

		System.out.println("Today is " + day(day % 7) + " and the future day is " + day((day + daysPast) % 7));

		input.close();
	}

	public static String day(int num) {
		String day = "";
		switch (num) {
			case 0:
				day = "Sunday";
				break;
			case 1:
				day = "Monday";
				break;
			case 2:
				day = "Tuesday";
				break;
			case 3:
				day = "Wednesday";
				break;
			case 4:
				day = "Thursday";
				break;
			case 5:
				day = "Friday";
				break;
			case 6:
				day = "Saturday";
				break;
		}
		return day;
	}
}
