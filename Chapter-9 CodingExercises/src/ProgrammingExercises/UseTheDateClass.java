/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgrammingExercises;

import java.util.Date;

/**
 *
 * @author Justin
 */
public class UseTheDateClass {

	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		Date date = new Date(10000);
		System.out.println(date.toString());

		date = new Date(100000);
		System.out.println(date.toString());

		date = new Date(1000000);
		System.out.println(date.toString());

		date = new Date(10000000);
		System.out.println(date.toString());

		date = new Date(100000000);
		System.out.println(date.toString());

		date = new Date(1000000000);
		System.out.println(date.toString());

		date = new Date(10000000000l);
		System.out.println(date.toString());

		date = new Date(100000000000l);
		System.out.println(date.toString());
	}
}
