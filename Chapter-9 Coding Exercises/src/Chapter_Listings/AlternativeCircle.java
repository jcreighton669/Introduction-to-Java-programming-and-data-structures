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
public class AlternativeCircle {

	/**
	 * Main method
	 */
	public static void main(String[] args) {
		// Create a circle with radius 1
		AltCircle circle1 = new AltCircle();
		System.out.println("The area of the circle of radius " + circle1.radius + " is " + circle1.getArea());

		// Create a circle with radius 25
		AltCircle circle2 = new AltCircle(25);
		System.out.println("The area of the circle of radius " + circle2.radius + " is " + circle2.getArea());

		// Create a circle with radius 125
		AltCircle circle3 = new AltCircle(125);
		System.out.println("The area of the circle of radius " + circle3.radius + " is " + circle3.getArea());

		// Modify circle radius
		circle2.radius = 100;
		System.out.println("The area of the circle of radius " + circle2.radius + " is " + circle2.getArea());
	}
}

class AltCircle {

	double radius;

	/**
	 * Construct a circle with radius 1
	 */
	public AltCircle() {
		radius = 1;
	}

	/**
	 * Construct a circle with a specified radius
	 *
	 * @param radius
	 */
	public AltCircle(double newRadius) {
		radius = newRadius;
	}

	/**
	 * Return the area of the circle
	 */
	double getArea() {
		return radius * radius * Math.PI;
	}

	/**
	 * Return the perimeter of this circle
	 */
	double getPerimeter() {
		return 2 * radius * Math.PI;
	}

	/**
	 * Set a new newRadius for this circle
	 */
	public void setRadius(double newRadius) {
		this.radius = newRadius;
	}

}
