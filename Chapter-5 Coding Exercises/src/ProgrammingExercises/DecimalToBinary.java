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
public class DecimalToBinary {

	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String binary = "";

		System.out.print("Enter an integer: ");
		int decimal = input.nextInt();

		for (int i = decimal; i > 0; i /= 2) {
			binary = (i % 2) + binary;
		}

		System.out.println("The binary equivalent to " + decimal + " is " + binary);
		if (binary.equals(Integer.toBinaryString(decimal))) {
			System.out.println(Integer.toBinaryString(decimal) + ": this is the check sum to confirm code is correct.");

		}
		input.close();
	}
}
