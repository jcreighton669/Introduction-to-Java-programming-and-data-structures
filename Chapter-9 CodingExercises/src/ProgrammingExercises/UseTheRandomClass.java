/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgrammingExercises;

import java.util.Random;

/**
 *
 * @author Justin
 */
public class UseTheRandomClass {

	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		Random rand = new Random(1000);

		for (int i = 0; i < 100; i++) {
			System.out.println(rand.nextInt(100));
		}
	}
}
