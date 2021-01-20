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
public class StudentMajorAndStatus {

	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter two characters: ");
		String chars = input.nextLine();

		String major = "";
		String status = "";

		char majorChar = chars.toUpperCase().charAt(0);
		char statusChar = chars.charAt(1);

		switch (majorChar) {
			case 'I':
				major = "Information Management";
				break;
			case 'C':
				major = "Computer Science";
				break;
			case 'A':
				major = "Accounting";
				break;
			default:
				System.out.println("Invalid major");
				break;
		}

		switch (statusChar) {
			case '1':
				status = "Freshman";
				break;
			case '2':
				status = "Sophomore";
				break;
			case '3':
				status = "Junior";
				break;
			case '4':
				status = "Senior";
				break;
			default:
				System.out.println("Invalid status");
				break;
		}
		if (!"".equals(major) && !"".equals(status)) {
			System.out.println(major + " " + status);
		}
	}
}
