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
public class RepeatMultiplications {
    public static void main(String[] args) {
        final int NUMBER_OF_QUESTIONS = 5;  // Number of questions
        int correctCount = 0;  // Count the number of correct answers
        int count = 0;  // Count the number of questions
        long startTime = System.currentTimeMillis();
        String output = " ";  // Output string is initially empty
        Scanner input = new Scanner(System.in);
        
        while (count < NUMBER_OF_QUESTIONS) {
            int number1 = (int)(Math.random() * 12) + 1;
            int number2 = (int)(Math.random() * 12) + 1;
            
            System.out.print("What is " + number1 + " * " + number2 + "? ");
            int answer = input.nextInt();
            
            if (number1 * number2 == answer) {
                System.out.println("You are correct");
                correctCount++;  
            } else {
                System.out.println("Your answer is wrong.\n" + number1 + 
                        " * " + number2 + " should be " + (number1 * number2));
            }
            
            // Increase the question count
            count++;
            
            output += "\n" + number1 + "*" + number2 + "=" + answer + ((number1 * number2 == answer) ? " correct": " wrong");
        }
        
        long endTime = System.currentTimeMillis();
        long testTime = endTime - startTime;
        
        System.out.println("Correct count is " + correctCount + "\nTest time is " + testTime / 1000 + " seconds\n" + output);
        
        input.close();
    }
}
