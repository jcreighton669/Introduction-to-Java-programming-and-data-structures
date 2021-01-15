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
public class AreaOfAPentagon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the length from the center to a vertex: ");
        double lengthToVertex = input.nextDouble();
        
        double side = 2 * lengthToVertex * Math.sin(Math.PI / 5);
        
        double area = (5 * side * side) / (4 * Math.tan(Math.PI/5));
        
        System.out.printf("The area of the pentagon is %4.2f", area);
        
        input.close();
    }
}
