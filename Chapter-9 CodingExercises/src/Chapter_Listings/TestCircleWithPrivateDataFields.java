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
public class TestCircleWithPrivateDataFields {

	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		// Create a circle with radius 5.0
		CircleWithPrivateDataFields myCircle = new CircleWithPrivateDataFields(5.0);
		System.out.println("The area of the circle of radius " + myCircle.getRadius() + " is " + myCircle.getArea());

		// Increase myCircle's radius by 10%
		myCircle.setRadius(myCircle.getRadius() * 1.1);
		System.out.println("The area of the circle of radius " + myCircle.getRadius() + " is " + myCircle.getArea());

		System.out.println("The number of objects created is " + CircleWithPrivateDataFields.getNumberOfObjects());
	}
}
