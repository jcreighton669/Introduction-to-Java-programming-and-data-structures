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
public class TestPassByValue {

	/**
	 * Main method
	 */
	public static void main(String[] args) {
		// Declare and initialize variables
		int num1 = 1;
		int num2 = 2;

		System.out.println("Before invoking the swap method, num1 is " + num1 + " and num2 is " + num2);

		// Invoke the swap method to attempt to swap two variables
		swap(num1, num2);

		System.out.println("Before invoking the swap method, num1 is " + num1 + " and num2 is " + num2);
	}

	public static void swap(int n1, int n2) {

	}
}
