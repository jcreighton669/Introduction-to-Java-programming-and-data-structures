/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter_Listings;

import java.util.Date;

/**
 *
 * @author Justin
 */
public class Circle extends GeometricObject {

	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public Circle(double radius, String color, boolean filled) {
		this.radius = radius;
		setColor(color);
		setFilled(filled);
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
	 * Return area
	 *
	 * @return
	 */
	public double getArea() {
		return radius * radius * Math.PI;
	}

	/**
	 * Return diameter
	 *
	 * @return
	 */
	public double getDiameter() {
		return 2 * radius;
	}

	/**
	 * Return perimeter
	 *
	 * @return
	 */
	public double getPerimeter() {
		return 2 * radius * Math.PI;
	}

	/**
	 * Print the circle info
	 */
	public void printCircle() {
		System.out.println("The circle is created " + getDateCreated() + " and the radius is " + radius);
	}
}
