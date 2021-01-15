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
public class PopulationProjection {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of years: ");
        int years = input.nextInt();
        
        double secondsPerYear = 31536000;
        double population = 312032486;
        double births;
        double deaths;
        double immigrants;
        
        births = (secondsPerYear / 7) * years;
        deaths = (secondsPerYear / 13) * years;
        immigrants = (secondsPerYear / 45) * years;
        
        population = population + births + immigrants - deaths;
        
        System.out.println("The population in 5 years is " + (int)population);
        
        input.close();
    }    
}