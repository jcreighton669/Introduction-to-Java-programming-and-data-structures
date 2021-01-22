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
public class BitLevelOperations {

	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter an integer: ");
		short number = input.nextShort();
		short temp = number;
		String bits = "";

		for (int i = 0; i < 8; i++) {
			bits = (number % 2) + bits;
			number >>= 1;
		}

		System.out.println("Binary for " + temp + " is " + bits);
		
		input.close();
	}
}
