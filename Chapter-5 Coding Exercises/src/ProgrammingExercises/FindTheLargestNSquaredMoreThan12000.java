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
public class FindTheLargestNSquaredMoreThan12000 {

	public static void main(String[] args) {
		int n = 0;

		while (Math.pow(n, 2) < 12000) {
			n++;
		}
		n--;
		System.out.println(n + " is the largest number that squares to less than 12000 occurs at " + Math.pow(n, 2));
	}
}
