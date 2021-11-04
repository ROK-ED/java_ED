package com.yedam.java.ch02;

import com.yedam.java.ch01.Box;

public class Main {

	public static void main(String[] args) {
		//싱글 타입 파라미터 : class<T>, interface<T>
		//멀티 타입 파라미터 : class<K, V, ...> , interface<K, V, ...>
		Product<Tv, String> product1 = new Product<Tv, String>();
		product1.setKind(new Tv());
		product1.setModel("스마트Tv");
		Tv tv = product1.getKind();
		String tvModel = product1.getModel();
		
		Product<Car,String> product2 = new Product<>(); //<> 안의 값은 한쪽에만 쓰면 다른 한쪽엔 자동으로 들어감 
		product2.setKind(new Car());
		product2.setModel("디젤");
		Car car = product2.getKind();
		String carModel = product2.getModel();
		
		//제네릭 메소드 : <T, R> R method(T t)
		Box<Integer> box1 = UtilBox./*<Integer>*/boxing(100); //추측이 가능해 생략가능
		int intValue = box1.get();
		
		Box<String> box2 = UtilBox.boxing("홍길동");
		String strValue = box2.get();
		
		
		Pair<Integer,String> p1 = new Pair<>(1,"사과");
		Pair<Integer,String> p2 = new Pair<>(1,"사과");
		boolean result1 = UtilPair.compare(p1, p2);
		if(result1) {
			System.out.println("논리적으로 동등한 객체입니다.");
		} else {
			System.out.println("논리적으로 동등하지 않은 객체입니다.");
		}
		
		Pair<String,String> p3 = new Pair<>("user1","홍길동");
		Pair<String,String> p4 = new Pair<>("user2","홍길동");
		boolean result2 = UtilPair.compare(p3, p4);
		if(result2) {
			System.out.println("논리적으로 동등한 객체입니다.");
		} else {
			System.out.println("논리적으로 동등하지 않은 객체입니다.");
		}
		
		Point<Integer, Double> p5 = new Point<Integer, Double>(0,0.0);
		Point<Integer, Double> p6 = new Point<Integer, Double>(10,10.0);
		
		double result3 = Method.makeRetangle(p5, p6);
		System.out.println("두 점으로 만들어진 사각형의 넓이는 "+result3 + "입니다.");
	}

}
