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
public class SentinelValue {
    /** Main method */
    public static void main(String[] args) {
        // Create a scanner
        Scanner input = new Scanner(System.in);
        
        // Read an initial data
        System.out.print("Enter an integer (the input ends if it is 0): ");
        int data = input.nextInt();
        
        // Keep reading data until the input is 0
        int sum = 0;
        while (data != 0) {
            sum += data;
            
            // Read the next data
            System.out.print("Enter an integer (the input ends if it is 0): ");
            data = input.nextInt();
        }
        
        System.out.println("The sum is " + sum);
    }
}
