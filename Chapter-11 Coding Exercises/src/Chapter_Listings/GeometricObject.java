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
public class GeometricObject {

	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;

	/**
	 * Construct a default geometric object
	 *
	 * @param dateCreated
	 */
	public GeometricObject(Date dateCreated) {
		dateCreated = new java.util.Date();
	}

	/**
	 * COnstruct a geometric object with the specified color and filled value
	 *
	 * @param color
	 * @param filled
	 */
	public GeometricObject(String color, boolean filled) {
		dateCreated = new java.util.Date();
		this.filled = filled;
		this.color = color;
	}

	/**
	 * Return color
	 *
	 * @return
	 */
	public String getColor() {
		return color;
	}

	/**
	 * Set a new color
	 *
	 * @param color
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * Return filled. Since filled is boolean, its getter method is named isFilled
	 */
	public boolean isFilled() {
		return filled;
	}

	/**
	 * Set a new filled
	 *
	 * @param filled
	 */
	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	/**
	 * Get dateCreated
	 *
	 * @return
	 */
	public java.util.Date getDateCreated() {
		return dateCreated;
	}

	/**
	 * Return a string representation of this object
	 *
	 * @return
	 */
	@Override
	public String toString() {
		return "Created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
	}

}
