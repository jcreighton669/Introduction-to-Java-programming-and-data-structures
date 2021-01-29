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
public class CircleWithStaticMembers {

	/**
	 * The radius of the circle
	 */
	double radius;

	/**
	 * The number of objects created
	 */
	static int numberOfObjects = 0;

	/**
	 * Construct a circle with radius 1
	 */
	public CircleWithStaticMembers() {
		radius = 1;
		numberOfObjects++;
	}

	/**
	 * Construct a circle with a specified radius
	 *
	 * @param newRadius
	 */
	public CircleWithStaticMembers(double newRadius) {
		this.radius = newRadius;
	}

	/**
	 * Return numberOfObjects
	 *
	 * @return
	 */
	static int getNumberOfObjects() {
		return numberOfObjects;
	}

	/**
	 * Return the area of this circle
	 */
	double getArea() {
		return radius * radius * Math.PI;
	}
}
