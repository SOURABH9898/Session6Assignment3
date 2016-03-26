package com.acadglid.java.core.session6.assignment3;

import java.util.Scanner;

public class TestShape {

	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		
		
		System.out.println("enter the shape to draw,\nCircle\tRectangle\tSquare");
		StringBuilder strb=new StringBuilder();
		strb.append(s.next());
		Shape shape=ShapeFactory.getShape(strb.toString());
		
		shape.draw();
		System.out.println("The area  of " + strb.toString()+" is: "+shape.getArea());

	}

}
