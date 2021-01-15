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
public class Increment {
	public static void main(String[] args) {
		int x = 1;
		System.out.println("Before the call, x is " + x);
		increment(x);
		System.out.println("After the call, x is " + x);
	}
	
	public static void increment(int n) {
		n++;
		System.out.println("n inside the method is " + n);
	}
}
