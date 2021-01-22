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
public class DisplayTheFirstDaysOfEachMonth {

	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter year: (e.g., 2012): ");
		int year = input.nextInt();
		System.out.print("Enter first day of the year: ");
		int day = input.nextInt();

		String output;
		for (int month = 1; month <= 12; month++) {
			output = "";
			switch (month) {
				case 1:
					output += "January ";
					break;
				case 2:
					output += "February ";
					break;
				case 3:
					output += "March ";
					break;
				case 4:
					output += "April ";
					break;
				case 5:
					output += "May ";
					break;
				case 6:
					output += "June ";
					break;
				case 7:
					output += "July ";
					break;
				case 8:
					output += "August ";
					break;
				case 9:
					output += "September ";
					break;
				case 10:
					output += "October ";
					break;
				case 11:
					output += "November ";
					break;
				case 12:
					output += "December ";
					break;
			}
			output += "1, " + year + " is ";

			day %= 7;
			switch (day) {
				case 0:
					System.out.println(output + "Sunday");
					break;
				case 1:
					System.out.println(output + "Monday");
					break;
				case 2:
					System.out.println(output + "Tuesday");
					break;
				case 3:
					System.out.println(output + "Wednesday");
					break;
				case 4:
					System.out.println(output + "Thursday");
					break;
				case 5:
					System.out.println(output + "Friday");
					break;
				case 6:
					System.out.println(output + "Saturday");
					break;
			}

			switch (month) {
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					day += 31;
					break;
				case 4:
				case 6:
				case 9:
				case 11:
					day += 30;
					break;
				default:
					if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
						day += 29;
					} else {
						day += 28;
					}
					break;
			}
		}
		input.close();
	}
}
