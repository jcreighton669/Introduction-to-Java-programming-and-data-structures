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
public class AreaOfARegularPolygon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of sides: ");
        int sides = input.nextInt();
        
        System.out.print("Enter the side: ");
        double length = input.nextDouble();
        
        double area = (sides * Math.pow(length, 2)) / (4 * Math.tan(Math.PI / sides));
        
        System.out.println("The area of the poligon is " + area);
        
        input.close();
    }
}
