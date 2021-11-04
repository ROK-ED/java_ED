package com.yedam.java.ch03;

public class Util {
	public static <T extends Number/*타입제한*/> int compare(T t1, T t2) {
		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue();
		
		return Double.compare(v1, v2);
	}
	

}
