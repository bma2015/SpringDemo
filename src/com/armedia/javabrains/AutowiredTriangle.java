package com.armedia.javabrains;

public class AutowiredTriangle implements Shape {
	
	private Point pointA, pointB, pointC;
	
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

	public void draw() {
		System.out.println("AutowiredTriangle");
		System.out.println("\tPoint A = " + pointA);
		System.out.println("\tPoint B = " + pointB);
		System.out.println("\tPoint C = " + pointC);
	}

}
