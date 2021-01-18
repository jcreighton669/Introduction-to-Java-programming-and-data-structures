/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgrammingExercises;

import java.util.Scanner;

/**
 *
 * @author Justin
 */
public class RandomPoint {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int xMax = 50;
		int yMax = 150;

		int x = (int) (Math.random() * xMax);
		int y = (int) (Math.random() * yMax);

		System.out.println("(" + x + ", " + y + ")");
	}
}
