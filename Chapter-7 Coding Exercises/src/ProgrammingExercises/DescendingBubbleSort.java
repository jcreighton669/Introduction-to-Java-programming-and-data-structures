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
public class DescendingBubbleSort {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] numbers = new double[10];

		System.out.print("Enter ten numbers: ");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextDouble();
		}

		reversedBubbleSort(numbers);

		for (double e : numbers) {
			System.out.print(e + " ");
		}
		System.out.println();
	}

	/**
	 * reversedBubbleSort
	 *
	 * @param list
	 */
	public static void reversedBubbleSort(double[] list) {
		double temp;
		boolean swapped;

		do {
			swapped = false;
			for (int i = 0; i < list.length - 1; i++) {
				if (list[i] < list[i + 1]) {
					temp = list[i];
					list[i] = list[i + 1];
					list[i + 1] = temp;
					swapped = true;
				}
			}
		} while (swapped);
	}
}
