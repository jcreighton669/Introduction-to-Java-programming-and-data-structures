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
public class ChanceOfWinningAtCraps {

	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		int count = 0;
		for (int i = 1; i <= 15000; i++) {
			if (playCraps() == 1) {
				count++;
			}
		}
		System.out.println("Number of winning games: " + count);
	}

	/**
	 * Play craps
	 *
	 * @return
	 */
	public static int playCraps() {
		int dice1 = rollDie();
		int dice2 = rollDie();

		printScore(dice1, dice2);

		int point = checkSum(dice1, dice2);
		if (point <= 1) {
			printResult(point);
			return point;
		}

		int sum;
		do {
			dice1 = rollDie();
			dice2 = rollDie();
			sum = dice1 + dice2;
		} while (sum != point && sum != 7);

		printScore(dice1, dice2);

		if (sum == 7) {
			printResult(0);
			point = 0;
		} else {
			printResult(1);
			point = 1;
		}
		return point;
	}

	/**
	 * Simulate 6d die roll
	 *
	 * @return
	 */
	public static int rollDie() {
		return (int) (Math.random() * 6) + 1;
	}

	/**
	 * Method getResult returns the result
	 *
	 * @param dice1
	 * @param dice2
	 * @return
	 */
	public static int checkSum(int dice1, int dice2) {
		// If point is 2, 3, or 12 retrun 0 (you lose)
		// if point is 7 or 11 return 1 (you win)
		int sum = dice1 + dice2;
		switch (sum) {
			case 2:
			case 3:
			case 12:
				return 0;
			case 7:
			case 11:
				return 1;
		}
		return sum;
	}

	/**
	 * Method printResult displays if the player wins or lose
	 *
	 * @param result
	 */
	public static void printResult(int result) {
		if (result == 0) {
			System.out.println("You lose");
		} else {
			System.out.println("You win");
		}
	}

	/**
	 * Method printScore displays the result of the rolled dice
	 *
	 * @param dice1
	 * @param dice2
	 */
	public static void printScore(int dice1, int dice2) {
		System.out.println(
				"You rolled " + dice1 + " + " + dice2 + " = " + (dice1 + dice2));
	}

}
