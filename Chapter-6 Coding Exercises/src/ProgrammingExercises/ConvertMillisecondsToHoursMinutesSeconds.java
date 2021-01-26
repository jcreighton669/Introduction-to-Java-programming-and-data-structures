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
public class ConvertMillisecondsToHoursMinutesSeconds {

	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of milliseconds: ");
		long millis = input.nextLong();

		System.out.println("hours:minuties:seconds: " + convertMillis(millis));

		input.close();
	}

	/**
	 * Display the time elapsed from the number of milliseconds entered
	 *
	 * @param millis
	 * @return
	 */
	public static String convertMillis(long millis) {
		String time = "";
		millis /= 1000;
		String currentMinuteAndSecond = "";
		for (int i = 0; i < 2; i++) {
			currentMinuteAndSecond = ":" + millis % 60 + currentMinuteAndSecond;
			millis /= 60;
		}
		time = millis + currentMinuteAndSecond;
		return time;
	}
}
