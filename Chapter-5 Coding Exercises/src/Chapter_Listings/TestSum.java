/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter_Listings;

import java.util.Scanner;

/**
 *
 * @author Justin
 */
public class TestSum {

	public static void main(String[] args) {
		// Initialize sum
		float sum = 0;

		// Add 0.01, 0.02, ..., 0.99, 1 to sum
		for (float i = 0.01f; i <= 1.0f; i += 0.01f) {
			sum += i;
		}

		// Display result
		System.out.println("The sum is " + sum);
	}
}
