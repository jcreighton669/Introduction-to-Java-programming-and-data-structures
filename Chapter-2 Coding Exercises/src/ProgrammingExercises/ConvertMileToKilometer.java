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
public class ConvertMileToKilometer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter miles: ");
        double miles = input.nextDouble();
        
        double kilometers = (miles * 1.6) / 1.0;
        System.out.println(miles + " miles is " + kilometers + " kilometers");
        input.close();
    }
}
