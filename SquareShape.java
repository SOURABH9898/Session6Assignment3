package com.acadglid.java.core.session6.assignment3;

public class SquareShape implements Shape {
	
	private int side;

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}
	public void draw(){
		System.out.println("Square is drawn");
	}
	
	public double getArea(){
		return (double)Math.pow(this.side, 2);
	}

}
