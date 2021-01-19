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
public class PrintATable {

	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("\ta\t\tb\t\tMiddle Point");
		double midPointX = (0 + 2) / 2.0;
		double midPointY = (0 + 1) / 2.0;
		System.out.println("\t(0, 0)\t\t(2, 1)\t\t(" + midPointX + ", " + midPointY + ")");
		
		midPointX = (1 + 4) / 2.0;
		midPointY = (4 + 2) / 2.0;
		System.out.println("\t(1, 4)\t\t(4, 2)\t\t(" + midPointX + ", " + midPointY + ")");
		
		midPointX = (2 + 6) / 2.0;
		midPointY = (7 + 3) / 2.0;
		System.out.println("\t(2, 7)\t\t(6, 3)\t\t(" + midPointX + ", " + midPointY + ")");
		
		midPointX = (3 + 10) / 2.0;
		midPointY = (9 + 5) / 2.0;
		System.out.println("\t(3, 9)\t\t(10, 5)\t\t(" + midPointX + ", " + midPointY + ")");
		
		midPointX = (4 + 12) / 2.0;
		midPointY = (11 + 7) / 2.0;
		System.out.println("\t(4, 11)\t\t(12, 7)\t\t(" + midPointX + ", " + midPointY + ")");
	}
}
