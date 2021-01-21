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
public class CountOccurrenceOfNumbers {
	/**
	 * 
	 * @param args 
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] nums = new int[100];
		int[] counts = new int[nums.length];

		System.out.print("Enter the integers between 1 and 50: ");
		for (int i = 0; i < nums.length; i++) {
			int num = input.nextInt();
			while (num != 0) {
				nums[i] = num;
			}
		}
		
		compareIntegers(nums);
		
		input.close();
	}
	
	public static void compareIntegers(int[] array) {
		for (int i = 0; i < array.length; i++) {
			
		}
	}
}
