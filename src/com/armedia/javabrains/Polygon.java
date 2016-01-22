package com.armedia.javabrains;

import java.util.List;

public class Polygon implements Shape {
	private List<Point> points;

	/**
	 * @return the points
	 */
	public List<Point> getPoints() {
		return points;
	}

	/**
	 * @param points the points to set
	 */
	public void setPoints(List<Point> points) {
		this.points = points;
	}
	
	public void draw() {
		System.out.println("Polygon");
		for (Point p : points) {
			System.out.println("\t" + p);
		}
	}
}
