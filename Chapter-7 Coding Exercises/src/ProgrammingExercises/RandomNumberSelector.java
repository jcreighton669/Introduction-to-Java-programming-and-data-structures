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
public class RandomNumberSelector {

	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(getRandom(2, 5, 6, 5, 4, 3, 23, 43, 2, 0));
	}

	/**
	 * Return a random number from the list of numbers entered
	 *
	 * @param numbers
	 * @return
	 */
	public static int getRandom(int... numbers) {
		if (numbers.length == 0) {
			System.out.println("No argument passed.");
			return -1;
		} else {
			int num = numbers[(int) (Math.random() * numbers.length)];

			return num;
		}
	}
}
