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
public class Dec2Hex {
    /** Main method */
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter a decimal integer
        System.out.print("Enter a decimal number: ");
        int decimal = input.nextInt();
        
        // Convert decimal to hex
        String hex = "";
        while (decimal != 0) {
            int hexValue = decimal % 16;
            
            // COnvert a decimal value to a hex digit
            char hexDigit = (0 <= hexValue && hexValue <= 9) ? (char)(hexValue + '0'): (char)(hexValue - 10 + 'A');
            
            hex = hexDigit + hex;
            decimal /= 16;
        }
        System.out.println("The hex number is " + hex);
        
    }
}
