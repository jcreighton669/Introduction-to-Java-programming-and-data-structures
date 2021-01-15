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
public class MultiplicationTable {
    /** Main method */
    public static void main(String[] args) {
        // Display the table heading
        System.out.println("        Multiplication Table");
        
        // Display the number title
        System.out.print("   ");
        for (int i = 1; i <= 9; i++) {
            System.out.print("   " + i);
        }
        
        System.out.println("\n---------------------------------------");
        
        // Display table body
        for (int i = 1; i <= 9; i++) {
            System.out.print(i + " | ");
            for (int j = 1; j <= 9; j++) {
                // Display the product and align properly
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
}
