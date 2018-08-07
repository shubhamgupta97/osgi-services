package com.osgi.circle;

import com.osgi.shape.Shape;

public class Circle implements Shape{

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Circle";
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Circle drawn");
	}
	
}
