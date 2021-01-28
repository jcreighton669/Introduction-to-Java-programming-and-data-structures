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
public class ComputingLCM {

	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(lcm(25, 50, 125, 35));
	}

	/**
	 * 
	 * @param numbers
	 * @return 
	 */
	public static int lcm(int... numbers) {
		int min;
		int max;
		int x;
		int lcm = 0;
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length - 1; j++) {
				if (numbers[i] > numbers[j]) {
					min = numbers[j];
					max = numbers[i];
				} else {
					min = numbers[i];
					max = numbers[j];
				}
				for (int k = 0; k < numbers.length; k++) {
					x = k * max;
					if (x % min == 0) {
						lcm = x;
					}
				}
			}
		}
		return lcm;
	}
}
