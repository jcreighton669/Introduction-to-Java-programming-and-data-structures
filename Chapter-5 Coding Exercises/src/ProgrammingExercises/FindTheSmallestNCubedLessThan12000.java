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
public class FindTheSmallestNCubedLessThan12000 {

	public static void main(String[] args) {
		int n = 0;

		while (Math.pow(n, 3) < 12000) {
			n++;
		}
		System.out.println(n + " is the smallest number that cubes to more than 12000 at " + Math.pow(n, 3));
	}
}
