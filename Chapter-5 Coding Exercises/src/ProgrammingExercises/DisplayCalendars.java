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
public class DisplayCalendars {

	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter year: ");
		int year = input.nextInt();
		System.out.print("Enter first day of the year: ");
		int day = input.nextInt();

		String header;
		System.out.println();
		for (int month = 1; month <= 12; month++) {
			header = "";
			switch (month) {
				case 1:
					header += "January ";
					break;
				case 2:
					header += "February ";
					break;
				case 3:
					header += "March ";
					break;
				case 4:
					header += "April ";
					break;
				case 5:
					header += "May ";
					break;
				case 6:
					header += "June ";
					break;
				case 7:
					header += "July ";
					break;
				case 8:
					header += "August ";
					break;
				case 9:
					header += "September ";
					break;
				case 10:
					header += "October ";
					break;
				case 11:
					header += "November ";
					break;
				case 12:
					header += "December ";
					break;
			}

			header += year + "";

			for (int b = 0; b < 23 - (header.length() / 2); b++) {
				System.out.print(" ");
			}

			System.out.println(
					header + "\n-----------------------------------------------\n "
					+ "Sun    Mon    Tue    Wed    Thu    Fri    Sat");

			day %= 7;
			for (int b = 0; b <= day * 7; b++) {
				System.out.print(" ");
			}

			int lastDay = 0;
			switch (month) {
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					lastDay += 31;
					break;
				case 4:
				case 6:
				case 9:
				case 11:
					lastDay += 30;
					break;
				default:
					if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
						lastDay += 29;
					} else {
						lastDay += 28;
					}
					break;
			}

			for (int d = 1; d <= lastDay; d++) {
				if (d < 10) {
					System.out.print(" ");
				}
				if (day % 7 == 6) {
					System.out.print(d + "\n ");
				} else {
					System.out.print(d + "     ");
					if (d == lastDay) {
						System.out.println();
					}
				}
				day++;

			}
			System.out.println();
		}

		input.close();
	}
}
