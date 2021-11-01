package question;

public class Question {
	/*
	 문제1) 원을 표현하는 다음 Circle 클래스가 있다. 
	 	   Circle 클래스를 상속받은 NamedCircle 클래스를 작성하여, 다음 main()을 실행할 때 다음 실행 결과와 같이 출력되도록 하라.
	 	   - class Circle {
				private int radius;
				public Circle(int radius) {
					this.radius = radius;
				}
				public int getRadius() {
				return radius;
				}
			}
			
			- 실행코드
			public static void main(String[] args) {
				NamedCircle w = new NamedCircle(5, "Waffle");
				w.show();
			}
			
			- 실행결과
			Waffle, 반지름 = 5
	
	  문제2) 다음 코드와 실행 결과를 참고하여 추상 클래스 Calculator를 상속받는 Adder와 Subtracter 클래스를 작성하라.
	  		- abstract class Calculator {
				protected int a, b;
				abstract protected int calc();
				protected void input() {
					Scanner scanner = new Scanner(System.in);
					System.out.print("정수 2개를 입력하세요 >> ");
					a = scanner.nextInt();
					b = scanner.nextInt();
				}
				public void run() {
					input();
					int res = calc();
					System.out.println("계산된 값은 " + res);
				}
			}
			
			- 실행결과
			정수 2개를 입력하세요 >> 5 3
			계산된 값은 8
			정수 2개를 입력하세요 >> 3 5
			계산된 값은 -2
		문제3) 다음은 단위를 변환하는 추상 클래스 Converter이다.
			  Converter 클래스를 상속받아 원화를 달러로 변환하는 Won2Dollar 클래스를 작성하라. 
			  main() 메소드와 실행 결과는 다음과 같다.
			  - abstract class Converter {
  					abstract protected double convert(double src); // 추상 메소드
  					abstract protected String getSrcString(); // 추상 메소드
  					abstract protected String getDestString(); // 추상 메소드
  					protected double ratio; // 비율
  					public void run() {
     					Scanner scanner = new Scanner(System.in);
     					System.out.println(getSrcString()+"을 "+getDestString()+"로 바꿉니다.");
     					System.out.print(getSrcString()+"을 입력하세요>> ");
     					double val = scanner.nextDouble();
     					double res = convert(val);
     					System.out.println("변환 결과: "+res+getDestString()+"입니다");
     					scanner.close();
 					 }
					}
				
				- 실행코드
				public static void main(String args[]) {
  					Won2Dollar toDollar = new Won2Dollar(1200); // 1달러는 1200원
  					toDollar.run();
				}
				
				- 실행결과
				원을 달러로 바꿉니다.
				원을 입력하세요>> 24000
				변환 결과: 20.0달러입니다
		문제4) 문제3) 의 Converter 클래스를 상속받아 Km를 mile(마일)로 변환하는 Km2Mile 클래스를 작성하라,
		 	  main() 메소드와 실행 결과는 다음과 같다.
		 	  - 실행코드
		 	  public static void main(String args[]) {
  				Km2Mile toMile = new Km2Mile(1.6); // 1마일은 1.6km
  				toMile.run();
				}
				
			  - 실행결과
			  Km을 mile로 바꿉니다.
			  Km을 입력하세요>> 30
			  변환 결과: 18.75mile입니다
		
		문제5) 2차원 상의 한 점을 표현하는 Point 클래스는 다음과 같다. 
			 다음 main()과 실행 결과를 참고하여 Point를 상속받은 ColorPoint 클래스(main() 포함)를 작성하라.
			 - class Point {
				private int x, y;
				public Point(int x, int y) {
					this.x = x;
					this.y = y;
				}
				public int getX() {
					return x;
				}
				public int getY() {
					return y;
				}
				protected void move(int x, int y) {
					this.x = x;
					his.y = y;
				}
			}
			
			- 실행코드
			public static void main(String[] args) {
				ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
				cp.setPoint(10, 20);
				cp.setColor("GREEN");
				cp.show();
			}
			
			- 실행결과
			GREEN색으로 (10,20)
			
	 */

}
