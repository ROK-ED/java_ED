package com.java.yedam.ch0604;

public class Calculator {
	//계산기
	//전원을 켠다.
	//리턴타입 메소드이름 () {}
	//              (매개변수) 매개변수는 있어도 되고 없어도됨
	void powerOn() {
//	리턴타입x     매개변수x
		System.out.println("전원을 켭니다.");
	}
	//전원을 끈다.
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	//더하기
	int plus(int x, int y) {
//  void가 아닌 리턴타입을 넣으면 리턴값을 넣어야된다.
		int result = x + y;
		return result;
//      리턴문 뒤에는 식이 들어올수 없다		
	}
	//나누기
	double divide(int x, int y) {
//		double result =(double) x / (double) y;
		//              int값을 넣을땐 강제로 타입 변경해야됨
//		return result;
		return (double) x / (double) y;
	}
	
	//평균
	double avg(int x, int y ) {
		//int sum = x + y;
		
		int sum = plus(x,y);  //클래스 내부 호출
		double avg = (double) sum / 2;
		return avg;
	}
	
	void execute() {
		double result = avg(7,10);
		println("result : "+ result);
	} 
	void println(String massage) {
		System.out.println(massage);
	} //선 호출, 후 선언 가능
	
	
	//정사각형의 넓이 메소드명 동일
	double areaRectangel(double width ) {
		return width*width;
	}
		
	//직사각형의 넓이 메소드명 동일
	double areaRectangel(double width, double height) {
		return width * height;
	}
	
	
	
	

}
