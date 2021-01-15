/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgrammingExercises;

/**
 *
 * @author Justin
 */
public class ComputeFutureTuition {
    public static void main(String[] args) {
        double tuition = 10000; // Year 0
        int year = 0;
        while (year < 10) {
            tuition *= 1.06;
            year++;
        }

        double collegeCost = tuition * 4;
        System.out.printf("The cost of four years tuition is $%.2f", collegeCost);
    }
}
