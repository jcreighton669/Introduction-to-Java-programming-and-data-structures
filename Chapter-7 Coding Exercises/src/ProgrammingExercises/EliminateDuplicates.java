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
public class EliminateDuplicates {

	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] numbers = new int[10];

		System.out.print("Enter ten number: ");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextInt();
		}

		int[] distinctNumbers = eliminateDuplicates(numbers);

		System.out.print("The distinct numbers are:");
		for (int e : distinctNumbers) {
			if (e > 0) {
				System.out.print(" " + e);
			}
		}
		System.out.println();
	}

	/**
	 * Returns a new array with duplicate values eliminated
	 *
	 * @param list
	 * @return
	 */
	public static int[] eliminateDuplicates(int[] list) {
		int[] distinctList = new int[list.length];
		int i = 0;	// index distinctList
		for (int e : list) {
			if (linearSearch(distinctList, e) == -1) {
				distinctList[i] = e;
				i++;
			}
		}
		return distinctList;
	}

	/**
	 * The method for finding a key in the list
	 *
	 * @param list
	 * @param key
	 * @return
	 */
	public static int linearSearch(int[] list, int key) {
		for (int i = 0; i < list.length; i++) {
			if (key == list[i]) {
				return i;
			}
		}
		return -1;
	}
}
