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
public class CircleWithPrivateDataFields {

	/**
	 * The radius of the circle
	 */
	private double radius = 1;

	/**
	 * The number of objects created
	 */
	private static int numberOfObjects = 0;

	/**
	 * Construct a circle with radius 1
	 */
	public CircleWithPrivateDataFields() {
		numberOfObjects++;
	}

	/**
	 * Construct a circle with a specified radius
	 *
	 * @param newRadius
	 */
	public CircleWithPrivateDataFields(double newRadius) {
		radius = newRadius;
		numberOfObjects++;
	}

	/**
	 * Return radius
	 *
	 * @return
	 */
	public double getRadius() {
		return radius;
	}

	/**
	 * Set a new radius
	 *
	 * @param radius
	 */
	public void setRadius(double radius) {
		this.radius = radius;
	}

	/**
	 * Return numberOfObjects
	 *
	 * @return
	 */
	public static int getNumberOfObjects() {
		return numberOfObjects;
	}

	/**
	 * Return the area of this circle
	 *
	 * @return
	 */
	public double getArea() {
		return radius * radius * Math.PI;
	}
}
