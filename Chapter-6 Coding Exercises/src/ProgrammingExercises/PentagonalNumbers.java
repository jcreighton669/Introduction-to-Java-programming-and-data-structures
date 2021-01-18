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
public class PentagonalNumbers {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			System.out.print(getPentagonalNumber(i) + " ");
		}
	}

	public static int getPentagonalNumber(int n) {
		return (n * (3 * n - 1)) / 2;
	}
}
