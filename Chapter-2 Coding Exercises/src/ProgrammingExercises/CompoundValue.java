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
public class CompoundValue {

	/**
	 * Main Method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final double MONTHLY_INTEREST_RATE = 0.003125;

		System.out.print("Enter the monthly saving amount: ");
		double monthlyInvestment = input.nextInt();

		double firstMonth = monthlyInvestment * (1 + MONTHLY_INTEREST_RATE);
		System.out.println("After the first month, the account value is " + firstMonth);

		double secondMonth = (firstMonth + monthlyInvestment) * (1 + MONTHLY_INTEREST_RATE);
		System.out.println("After the second month, the account value is " + secondMonth);

		double thirdMonth = (secondMonth + monthlyInvestment) * (1 + MONTHLY_INTEREST_RATE);
		System.out.println("After the second month, the account value is " + thirdMonth);

		double fourthMonth = (thirdMonth + monthlyInvestment) * (1 + MONTHLY_INTEREST_RATE);
		System.out.println("After the second month, the account value is " + fourthMonth);

		double fifthMonth = (fourthMonth + monthlyInvestment) * (1 + MONTHLY_INTEREST_RATE);
		System.out.println("After the second month, the account value is " + fifthMonth);

		double sixthMonth = (fifthMonth + monthlyInvestment) * (1 + MONTHLY_INTEREST_RATE);
		System.out.println("After the second month, the account value is " + sixthMonth);
		
		input.close();
	}
}
