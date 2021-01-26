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
public class GenerateRandomCharacters {

	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		final int NUMBER_OF_CHARS = 100;
		final int NUMBER_PER_LINE = 10;

		for (int i = 1; i <= NUMBER_OF_CHARS; i++) {
			if (i % NUMBER_PER_LINE == 0) {
				System.out.println(getRandomUpperCaseLetter());
			} else {
				System.out.print(getRandomUpperCaseLetter() + " ");
			}
		}

		for (int i = 1; i <= NUMBER_OF_CHARS; i++) {
			if (i % NUMBER_PER_LINE == 0) {
				System.out.println(getRandomDigitCharacter());
			} else {
				System.out.print(getRandomDigitCharacter() + " ");
			}
		}

	}

	/**
	 * Generate a random character between ch1 and ch2
	 *
	 * @param ch1
	 * @param ch2
	 * @return
	 */
	public static char getRandomCharacter(char ch1, char ch2) {
		return (char) (ch1 + Math.random() * (ch2 - ch1 + 1));
	}

	/**
	 * Generate random uppercase letter
	 *
	 * @return
	 */
	public static char getRandomUpperCaseLetter() {
		return getRandomCharacter('A', 'Z');
	}

	/**
	 * Generate a random digit character
	 *
	 * @return
	 */
	public static char getRandomDigitCharacter() {
		return getRandomCharacter('0', '9');
	}
}
