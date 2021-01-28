/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgrammingExercises;

import java.util.GregorianCalendar;

/**
 *
 * @author Justin
 */
public class UseTheGregorianCalendarClass {

	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		GregorianCalendar calendar = new GregorianCalendar();
		System.out.println("Current year: " + calendar.get(calendar.YEAR));
		System.out.println("Current month: " + calendar.get(calendar.MONTH));
		System.out.println("Current day: " + calendar.get(calendar.DAY_OF_MONTH));

		calendar.setTimeInMillis(1234567898765L);
		System.out.println("Current year: " + calendar.get(calendar.YEAR));
		System.out.println("Current month: " + calendar.get(calendar.MONTH));
		System.out.println("Current day: " + calendar.get(calendar.DAY_OF_MONTH));
	}
}
