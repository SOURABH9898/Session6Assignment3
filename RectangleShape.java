package com.acadglid.java.core.session6.assignment3;

public class RectangleShape implements Shape{
	private int length;
	private int breadth;
public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getBreadth() {
		return breadth;
	}
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
public void draw(){
	if(!(this.length == 0 || this.breadth == 0))
		System.out.println("Rectangle is drawn");
	else
		System.out.println("The sides are not added");
	
}

public double getArea(){
	
	return (double)this.length*this.breadth;
}
}
