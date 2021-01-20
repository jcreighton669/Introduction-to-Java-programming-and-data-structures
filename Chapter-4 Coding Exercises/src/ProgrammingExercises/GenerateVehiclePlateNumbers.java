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
public class GenerateVehiclePlateNumbers {

	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		String letters = "";
		String digits = "";

		for (int i = 0; i < 3; i++) {
			int number = 65 + (int) (Math.random() * (91 - 65));
			letters = ((char) (number)) + letters;
		}

		for (int i = 0; i < 4; i++) {
			int number = (int) (Math.random() * 10);
			digits = Integer.toString(number) + digits;
		}

		System.out.println(letters + "-" + digits);
	}
}
