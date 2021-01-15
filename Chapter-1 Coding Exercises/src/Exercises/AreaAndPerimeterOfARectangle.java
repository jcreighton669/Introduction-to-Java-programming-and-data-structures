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
public class AreaAndPerimeterOfARectangle {
    public static void main(String[] args) {
        double width = 5.3;
        double height = 8.6;
        double area = width * height;
        double perimeter = 2 * (height + width);
        
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }
}
