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
public class Rectangle extends GeometricObject {

	private double width;
	private double height;

	public Rectangle() {
	}

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public Rectangle(double width, double height, String color, boolean filled) {
		this.width = width;
		this.height = height;
		setColor(color);
		setFilled(filled);
	}
	/**
	 * Return width
	 *
	 * @return
	 */
	public double getWidth() {
		return width;
	}

	/**
	 * Set a new width
	 *
	 * @param width
	 */
	public void setWidth(double width) {
		this.width = width;
	}

	/**
	 * Return height
	 *
	 * @return
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * Set a new height
	 *
	 * @param height
	 */
	public void setHeight(double height) {
		this.height = height;
	}

	/**
	 * Return area
	 *
	 * @return
	 */
	public double getArea() {
		return width * height;
	}

	/**
	 * Return perimeter
	 *
	 * @return
	 */
	public double getPerimeter() {
		return 2 * (width + height);
	}

}
