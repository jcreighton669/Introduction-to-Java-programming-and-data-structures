/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercises;

/**
 *
 * @author Justin
 */
public class SummationOfASeries {

	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
}
