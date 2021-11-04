package com.yedam.java.ch02;

public class Method {
	public static <T,V> double makeRetangle(Point<T,V> p1,Point<T,V> p2 ) {
		double left = ((Number)p1.getX()).doubleValue();
		double right = ((Number)p2.getX()).doubleValue();
		double top = ((Number)p1.getY()).doubleValue();
		double bottom = ((Number)p2.getY()).doubleValue();
		
		double width = right - left;
		double height = bottom -top;
		
		return width * height;
	}

}
