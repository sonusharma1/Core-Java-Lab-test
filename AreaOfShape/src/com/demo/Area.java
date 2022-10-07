package com.demo;

public class Area extends Shape {

	@Override
	public double rectangleArea(double length, double breadth) {
		return length * breadth;
	}

	@Override
	public double squareArea(double side) {
		return side * side;
	}

	@Override
	public double circleArea(double radius) {
		return 3.14 * radius * radius;
	}
}
