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
public class Craps {

	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		int point = rollTwoDice();

		int result = getResult(point);

		if (isNaturalOrCraps(result)) {
			printResult(result);
		} else {
			rollTillWinOrLose(result);
		}
	}

	/**
	 * Generate random die roll
	 *
	 * @return
	 */
	public static int rollDie() {
		return (int) (Math.random() * 6) + 1;
	}

	/**
	 * Method printRoll prints the sum of the two dice
	 *
	 * @return
	 */
	public static int rollTwoDice() {
		int dice1 = rollDie();
		int dice2 = rollDie();
		int sum = dice1 + dice2;
		System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + sum);
		return sum;
	}

	/**
	 * Method getResult returns the result
	 *
	 * @param point
	 * @return
	 */
	public static int getResult(int point) {
		// If point is 2, 3, or 12 retrun 0, If point is 7 or 11 return 1
		switch (point) {
			case 2:
			case 3:
			case 12:
				point = 0;
				break;
			case 7:
			case 11:
				point = 1;
				break;
		}
		return point;
	}

	/**
	 * Method printResult displays if the player wins or lose
	 *
	 * @param result
	 */
	public static void printResult(int result) {
		if (result == 0) {
			System.out.println("You lose");
		} else if (result == 1) {
			System.out.println("You win");
		}
	}

	/**
	 * Method naturalOrCraps returns true if you won lost.False otherwise
	 *
	 * @param result
	 * @return
	 */
	public static boolean isNaturalOrCraps(int result) {
		return result == 0 || result == 1;
	}

	/**
	 * Method rollTillWinOrLose repeats rolling two dice until either a 7 or the same point value is rolled.then prints the result
	 *
	 * @param point
	 */
	public static void rollTillWinOrLose(int point) {
		int result;

		do {
			result = rollTwoDice();
		} while (result != point && result != 7);

		// If 7 is rolled, you lose. Otherwise, you win.
		if (result == 7) {
			printResult(0);
		} else {
			printResult(1);
		}
	}
}
