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
public class BMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();
        
        System.out.print("Enter feet: ");
        double feet = input.nextDouble();
        
        System.out.print("Enter inches: ");
        double inches = input.nextDouble();
        
        double height = inches + (12 * feet);
        
        final double KILOGRAMS_PER_POUND = 0.45359237;  // Constant
        final double METERS_PER_INCH = 0.0254;  // Constant
        
        double weightInKilograms = weight * KILOGRAMS_PER_POUND;
        double heightInMeters = height * METERS_PER_INCH;
        double bmi = weightInKilograms / (heightInMeters * heightInMeters);
        
        System.out.println("BMI is " + bmi);
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 25) {
            System.out.println("Normal");
        } else if (bmi < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
        
        input.close();
    }
}
