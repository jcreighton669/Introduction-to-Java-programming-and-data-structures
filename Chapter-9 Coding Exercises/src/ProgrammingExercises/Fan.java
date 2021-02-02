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
public class Fan {

	final int SLOW = 1;
	final int MEDIUM = 2;
	final int HIGH = 3;

	private int speed = SLOW;
	private boolean on = false;
	private double radius = 5;
	private String color = "blue";

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public boolean isOn() {
		return on;
	}

	public void setOn(boolean on) {
		this.on = on;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Fan() {
	}

	@Override
	public String toString() {
		if (on) {
			return "Fan{" + "speed=" + speed + ", color=" + color + ", radius=" + radius + '}';
		} else {
			return "The fan is off";
		}
	}

	public static void main(String[] args) {
		Fan fan1 = new Fan();
		fan1.speed = 3;
		fan1.radius = 10;
		fan1.color = "yellow";
		fan1.on = true;
		System.out.println(fan1.toString());

		Fan fan2 = new Fan();
		fan2.speed = 2;
		System.out.println(fan2.toString());
	}
}
