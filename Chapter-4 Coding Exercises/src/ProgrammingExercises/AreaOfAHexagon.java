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
public class AreaOfAHexagon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side: ");
        double side = input.nextDouble();
        
        double area = (6 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 6));
        
        System.out.printf("The area of the hexagon is %.2f ", area);
        
        input.close();
    }
}
