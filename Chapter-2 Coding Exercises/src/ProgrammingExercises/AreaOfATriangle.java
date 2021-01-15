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
public class AreaOfATriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the coordinates of three points separated by spaces like x1 y1 x2 y2 x3 y3: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        
        double side1 = distanceOfTwoPoints(x1, y1, x2, y2);
        double side2 = distanceOfTwoPoints(x2, y2, x3, y3);
        double side3 = distanceOfTwoPoints(x3, y3, x1, y3);
        
        double s = (side1 + side2 + side3) / 2;
        
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        
        System.out.println("The area of the triangle is " + area);
        
    }
    
    public static double distanceOfTwoPoints(double x1, double y1, double x2, double y2) {
        double distance = Math.sqrt((Math.pow((x2 - x1), 2)) + (Math.pow((y2 - y1), 2)));
        return Math.abs(distance);
    }
}
