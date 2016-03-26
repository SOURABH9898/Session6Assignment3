package com.acadglid.java.core.session6.assignment3;

public class CircleShape implements Shape{
	private int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	public void draw(){
		System.out.println("Circle is drawn");
	}
	
	public double getArea(){
		return (double)3.14*Math.pow(radius, 2);
	}
}
