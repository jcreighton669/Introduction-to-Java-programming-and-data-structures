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
public class ComputeFutureInvestmentValue {

	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("The amount invested: ");
		double investmentAmount = input.nextDouble();

		System.out.print("Annual interest rate: ");
		double annualInterestRate = input.nextDouble();
		double monthlyInterestRate = annualInterestRate / 1200;

		System.out.println("Years\tFuture Value");
		for (int i = 1; i <= 30; i++) {
			System.out.printf(i + "\t\t$%.2f", futureInvestmentValue(investmentAmount, monthlyInterestRate, i));
			System.out.println();
		}

		input.close();
	}

	/**
	 * Return the investment amount
	 *
	 * @param investmentAmount
	 * @param monthlyInterestRate
	 * @param years
	 * @return
	 */
	public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
		return investmentAmount * Math.pow((1 + monthlyInterestRate), (years * 12));
	}
}
