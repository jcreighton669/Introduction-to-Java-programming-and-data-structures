/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgrammingExercises;

import java.util.Scanner;
/**
 *
 * @author Justin
 */
public class PalindromeInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a three-digit integer: ");
        int number = input.nextInt();
        int temp = number;
        String reverse = "";
        
        while (temp != 0) {
            reverse += String.valueOf(temp % 10);
            temp /= 10;
        }
        
        if (reverse.equals(String.valueOf(number))) {
            System.out.println(number + " is a palindrome");
        } else {
            System.out.println(number + " is not a palindrome");
        }
    }
}
