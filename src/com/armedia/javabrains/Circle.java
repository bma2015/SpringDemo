package com.armedia.javabrains;

public class Circle implements Shape {
	
	private int radius;
	private Point center;
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	/**
	 * @return the radius
	 */
	public int getRadius() {
		return radius;
	}

	/**
	 * @return the center
	 */
	public Point getCenter() {
		return center;
	}

	/**
	 * @param center the center to set
	 */
	public void setCenter(Point center) {
		this.center = center;
	}

	public void draw() {
		System.out.println("Circle drawn of radius " + getRadius());
	}
}
