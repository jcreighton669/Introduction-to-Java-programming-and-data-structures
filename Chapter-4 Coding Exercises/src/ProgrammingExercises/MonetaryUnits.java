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
public class MonetaryUnits {

	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter an amount in double for example 11.56: ");
		String money = input.nextLine();

		int dollars = Integer.parseInt(money.substring(0, money.indexOf(".")));
		int cents = Integer.parseInt(money.substring(money.indexOf(".") + 1));

		System.out.println("Your amount " + money + " consists of " + dollars + " dollars and " + cents + " cents");

		input.close();
	}
}
