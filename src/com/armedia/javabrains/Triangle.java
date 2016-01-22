package com.armedia.javabrains;

public class Triangle implements Shape {
	
	private String type;
	private int height;
	
	private Point pointA, pointB, pointC;
	
	public Triangle(String type) {
		this.type = type;
	}
	
	public Triangle(int height) {
		this.height = height;
	}
	
	public Triangle(String type, int height) {
		this.type = type;
		this.height = height;
	}
	
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @return the height
	 */
	public int getHeight() {
		return height;
	}
	/**
	 * @return the a
	 */
	public Point getPointA() {
		return pointA;
	}

	/**
	 * @param a the a to set
	 */
	public void setPointA(Point a) {
		pointA = a;
	}

	/**
	 * @return the b
	 */
	public Point getPointB() {
		return pointB;
	}

	/**
	 * @param b the b to set
	 */
	public void setPointB(Point b) {
		pointB = b;
	}

	/**
	 * @return the c
	 */
	public Point getPointC() {
		return pointC;
	}

	/**
	 * @param c the c to set
	 */
	public void setPointC(Point c) {
		pointC = c;
	}

	/**
	 * @param type the type to set
	 */
	/*
	public void setType(String type) {
		this.type = type;
	}
	*/

	public void draw() {
		System.out.println(getType() + " Triangle drawn of height " + getHeight());
		System.out.println("\tPoint A = " + pointA);
		System.out.println("\tPoint B = " + pointB);
		System.out.println("\tPoint C = " + pointC);
	}
	
}
