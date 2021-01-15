/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercises;

/**
 *
 * @author Justin
 */
public class AreaAndPerimeterOfACircle {
    public static void main(String[] args) {
        double radius = 6.5;
        double pi = 3.14159;
        double perimeter = 2 * pi * radius;
        double area = pi * Math.pow(radius, 2);
        
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Area: " + area);
    }
}
