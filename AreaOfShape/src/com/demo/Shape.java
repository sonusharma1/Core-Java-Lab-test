package com.demo;

public abstract class Shape {

	protected double length, breadth, side, radius;

	public double rectangleArea(double length, double bredth) {

		this.length = length;
		this.breadth = bredth;
		return this.length * this.breadth;
	}

	public double squareArea(double side) {
		this.side = side;
		return this.side * this.side;
	}

	public double circleArea(double radius) {
		this.radius = radius;
		return 3.14 * this.radius * this.radius;
	}
}
