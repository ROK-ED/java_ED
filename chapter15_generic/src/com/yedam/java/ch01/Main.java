package com.yedam.java.ch01;

public class Main {

	public static void main(String[] args) {
		//Box box = new Box();
		//box.set("홍길동");
		//String name = (String)box.get();
		Box<String> box1 = new Box<String>();
		box1.set("홍길동");
		String name = box1.get();
		
		//box.set(new Apple());
		//Apple apple = (Apple)box.get();
		Box<Apple> box2 = new Box<Apple>();
		box2.set(new Apple());
		Apple apple = box2.get();

		Printer<Powder> powderPrinter = new Printer<Powder>();
		powderPrinter.setMaterial(new Powder());
		Powder powder = powderPrinter.getMaterial();
		System.out.println(powder);
		
		Printer<Plastic> plasticPrinter = new Printer<Plastic>();
		plasticPrinter.setMaterial(new Plastic());
		Plastic plastic = plasticPrinter.getMaterial();
		System.out.println(plastic);
	}

}
