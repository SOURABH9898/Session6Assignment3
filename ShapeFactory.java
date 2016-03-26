package com.acadglid.java.core.session6.assignment3;

import java.util.Scanner;

public class ShapeFactory {
	static Scanner s=new Scanner(System.in);
	public static Shape getShape(String str){
		Shape shape=null;
		if(str.toLowerCase().equals("circle")){
			shape=new CircleShape();
			
			System.out.println("Enter the radius of circle");
			((CircleShape) shape).setRadius(s.nextInt());
		}
		else if(str.toLowerCase().equals("rectangle")){
			shape= new RectangleShape();
			System.out.println("enter the length of rectangle");
			((RectangleShape)shape).setLength(s.nextInt());
			((RectangleShape)shape).setBreadth(s.nextInt());
		}
		else if(str.toLowerCase().equals("square")){
			shape=new SquareShape();
		}
		else
			System.out.println("Invalid Shape");
		
		return shape;
	}

}
