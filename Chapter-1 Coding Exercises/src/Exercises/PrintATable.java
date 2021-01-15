/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercises;

/**
 *
 * @author Justin
 */
public class PrintATable {
    public static void main(String[] args) {
        System.out.println("a\ta^2\ta^3\ta^4");
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                System.out.print((int)Math.pow(i, j) + "\t");
            }
            System.out.println();
        }
    }
    
}
