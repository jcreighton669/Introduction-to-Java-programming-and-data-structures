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
public class DisplayIntegerReversed {

	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		reverse(3456);
	}

	/**
	 * Print the reversed value of the users input
	 *
	 * @param number
	 */
	public static void reverse(int number) {
		int temp = 0;
		int reverse = 0;
		String num = "";
		while (number != 0) {
			temp = number % 10;
			num += String.valueOf(temp);
			number /= 10;
		}
		reverse = Integer.parseInt(num);
		System.out.println(reverse);
	}
}
