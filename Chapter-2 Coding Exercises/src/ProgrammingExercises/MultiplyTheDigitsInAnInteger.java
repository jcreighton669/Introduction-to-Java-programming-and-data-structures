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
public class MultiplyTheDigitsInAnInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number between 0 and 1000: ");
        int number = input.nextInt();
        int originalNumber = number;
        int product = 1;
        
        if (number >= 0 && number <= 1000) {
            while (number != 0) {
                int temp = number % 10;
                product *= temp;
                number /= 10;
            }            
            System.out.println("The multiplication of all digits in " + originalNumber + " is " + product);
        } else {
            System.out.println("The number is outside of the range.");
        }
        input.close();
    }
}
