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
public class LockerPuzzle {

	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		boolean[] lockers = new boolean[100];
		int open = 0;

		for (int i = 0; i < 100; i++) {
			for (int j = i; j < 100; j++) {
				if (lockers[i] == false) {
					lockers[i] = true;
					open++;
				} else {
					lockers[i] = false;
					open--;
				}
			}
		}

		System.out.println("Open lockers: " + open);
	}
}
