/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter_Listings;

/**
 *
 * @author Justin
 */
public class RandomCharacter {

	/**
	 * Generate a random character between ch1 and ch2
	 * @param ch1
	 * @param ch2
	 * @return 
	 */
	public static char getRandomCharacter(char ch1, char ch2) {
		return (char) (ch1 + Math.random() * (ch2 - ch1 + 1));
	}

	/**
	 * Generate random lowercase letter
	 * @return 
	 */
	public static char getRandomLowerCaseLetter() {
		return getRandomCharacter('a', 'z');
	}

	/**
	 * Generate random uppercase letter
	 * @return 
	 */
	public static char getRandomUpperCaseLetter() {
		return getRandomCharacter('A', 'Z');
	}

	/**
	 * Generate a random digit character
	 * @return 
	 */
	public static char getRandomDigitCharacter() {
		return getRandomCharacter('0', '9');
	}

	/**
	 * Generate a random character
	 * @return 
	 */
	public static char getRandomCharacter() {
		return getRandomCharacter('\u0000', '\uFFFF');
	}
}
