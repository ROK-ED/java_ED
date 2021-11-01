package question;

public class Question {
	/*
	 문제1) DaoExample 클래스의 main() 메소드에서 dbWork() 메소드를 호출할 때 OracleDao와 MysqlDao 객체를 매개값으로 주고 호출하였다. 
	   		 dbWork() 메소드는 두 객체를 모두 매개값으로 받기 위해 DataAccessObject 타입의 매개 변수를 가지고 있다. 
	   		 실행 결과를 보고 DataAccessObject 인터페이스와 OracleDao, MySqlDao 구현 클래스를 각각 작성해보자. 
	   		 - 실행코드
	   		 public class DaoExample {
   			public static void dbWork(DataAccessObject dao) {
       			dao.select();
       			dao.insert();
       			dao.update();
       			dao.delete();
   		}
   			public static void main(String[] args) {
       			dbWork(new OracleDao());
       			dbWork(new MySqlDao());

   				}

			}

	   		 - 실행결과
	   		 Oracle DB에서 검색
	   		 Oracle DB에 삽입
	   		 Oracle DB를 수정
	   		 Oracle DB에서 삭제
	   		 MySql DB에서 검색
	   		 MySql DB에 삽입
	   		 Mysql DB를 수정
	   		 MySql DB에서 삭제
	 문제2) 인터페이스 AdderInterface의 코드는 다음과 같다. 
	 	   AdderInterface를 상속받은 클래스 MyAdder를 작성하여, 다음 main() 을 실행할 때 아래 실행 결과와 같이 출력되도록 하라.
	 	   - interface AdderInterface {
				int add(int x, int y);
				int add(int n);
			}
			
			- 실행코드
			public static void main(String[] args) {
				MyAdder adder = new MyAdder();
				System.out.println(adder.add(5,10));
				System.out.println(adder.add(10));
			}
			
			- 실행결과 
				15
				55
	 문제3) 다음은 도형을 묘사하는 인터페이스 Shape이다. 
	 	   다음 main() 메소드와 실행 결과를 참고하여, 
	 	   인터페이스 Shape을 구현한 클래스 Circle를 작성하고 전체 프로그램을 완성하라.
	 	   - interface Shape {
				final double PI = 3.14;
				void draw();
				double getArea();
				default public void redraw() {
					System.out.println("--- 다시 그립니다 ---");
					draw();
				}
			}
		   
		   - 실행코드
		   public static void main(String[] args) {
				Shape coin = new Circle(10);
				coin.redraw();
				System.out.println("코인의 면적은 " + coin.getArea());
			}
			
			- 실행결과
			--- 다시 그립니다 ---
			반지름10 코인의 면적은 314.0
			
	  문제4) 다음 Stack 인터페이스를 상속받아 실수를 저장하는 StringStack 클래스를 구현하라.
	  		그리고 다음 실행 사례와 같이 작동하도록 StackApp 클래스에 main() 메소드를 작성하라.
	  		- interface Stack {
  				int length(); // 현재 스택에 저장된 개수 리턴
  				int capacity(); // 스택의 전체 저장 가능한 개수 리턴
  				String pop(); // 스택의 톱(top)에 실수 저장
 				boolean push(String val); // 스택의 톱(top)에 저장된 실수 리턴
			}
			
			- 실행결과
			총 스택 저장 공간의 크기 입력 >> 3
			문자열 입력 >> hello
			문자열 입력 >> sunny
			문자열 입력 >> smile
			문자열 입력 >> happy
			스택이 꽉 차서 푸시 불가!
			문자열 입력 >> 그만
			스택에 저장된 모든 문자열 팝 : smile sunny hello 
			
	   
	   		 
	   		 
	 	   
	 */

}
