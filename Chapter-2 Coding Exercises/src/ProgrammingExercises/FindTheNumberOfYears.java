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
public class FindTheNumberOfYears {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of minutes: ");
        int minutes = input.nextInt();
        int startingMinutes = minutes;
        
        int days = minutes / 1440;
        int years = days / 365;
        days %= 365;
                
        System.out.println(startingMinutes + " minutes is approximately " + years + " years and " + days + " days");
        
        input.close();
        
    }
}
