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
public class SortThreeNumbers {

	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		displaySortedNumbers(5.5, 12, 1.2);
	}

	/**
	 * Sort the parameters in decreasing order
	 *
	 * @param num1
	 * @param num2
	 * @param num3
	 */
	public static void displaySortedNumbers(double num1, double num2, double num3) {
		if (num1 > num2 && num1 > num3) {
			if (num2 > num3) {
				System.out.println("Max: " + num1 + "\nMid: " + num2 + "\nMin: " + num3);
			} else {
				System.out.println("Max: " + num1 + "\nMid: " + num3 + "\nMin: " + num2);
			}
		} else if (num2 > num1 && num2 > num3) {
			if (num1 > num3) {
				System.out.println("Max: " + num2 + "\nMid: " + num1 + "\nMin: " + num3);
			} else {
				System.out.println("Max: " + num2 + "\nMid: " + num3 + "\nMin: " + num1);
			}
		} else {
			if (num1 > num2) {
				System.out.println("Max: " + num3 + "\nMid: " + num1 + "\nMin: " + num2);
			} else {
				System.out.println("Max: " + num3 + "\nMid: " + num2 + "\nMin: " + num1);
			}
		}
	}
}
