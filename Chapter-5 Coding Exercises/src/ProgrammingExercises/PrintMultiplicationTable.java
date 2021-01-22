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
public class PrintMultiplicationTable {

	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		int num = 1;
		while (num < 10) {
			for (int i = 1; i < 10; i++) {
				System.out.print(num + "*" + i + "= " + (num * i) + "\t");
			}
			System.out.println();
			num++;
		}

	}
}
