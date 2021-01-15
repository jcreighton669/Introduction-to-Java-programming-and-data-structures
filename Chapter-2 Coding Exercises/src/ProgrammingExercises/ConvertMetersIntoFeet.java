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
public class ConvertMetersIntoFeet {
    public static void main(String[] args) {
        final double FOOT_CONVERSION = 3.2786;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a value for meter: ");
        double meter = input.nextDouble();
        
        double feet = meter * FOOT_CONVERSION;
        
        System.out.println(meter + " meters is " + feet + "feet");
        input.close();
    }
}
