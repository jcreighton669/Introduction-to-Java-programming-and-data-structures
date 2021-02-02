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
public class Rectangle {

	double width = 1;
	double height = 1;

	public Rectangle() {
	}

	public Rectangle(double width, double height) {
		this.height = height;
		this.width = width;
	}

	double getArea() {
		return height * width;
	}

	double getPerimeter() {
		return 2 * height + 2 * width;
	}

	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		Rectangle rect1 = new Rectangle(4, 40);
		Rectangle rect2 = new Rectangle(3.5, 35.9);

		System.out.println("Height: " + rect1.height);
		System.out.println("Width: " + rect1.width);
		System.out.println("Area: " + rect1.getArea());
		System.out.println("Perimeter: " + rect1.getPerimeter());

		System.out.println();

		System.out.println("Height: " + rect2.height);
		System.out.println("Width: " + rect2.width);
		System.out.println("Area: " + rect2.getArea());
		System.out.println("Perimeter: " + rect2.getPerimeter());

	}

}
