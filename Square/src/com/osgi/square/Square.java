package com.osgi.square;

import com.osgi.shape.Shape;

public class Square implements Shape{

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Square";
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Square drawn");
	}
	
}
