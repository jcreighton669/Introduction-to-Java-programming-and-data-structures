/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter_Listings;

/**
 *
 * @author Justin
 */
public class ComputerArea {
    public static void main(String[] args) {
        double radius;  // Declare radius
        double area;  // Declare area
        
        // Assign a radius
        radius = 20;  // radius is now 20
        
        // Computer area
        area = radius * radius * 3.14159;
        
        // Display results
        System.out.println("The area of the circle of radius " + radius + " is " + area);
    }
}
