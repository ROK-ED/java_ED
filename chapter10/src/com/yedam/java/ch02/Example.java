package com.yedam.java.ch02;

public class Example {
	
	public static void main(String[] args) {
		//일반 예외 처리
		try {
			Class clazz = Class.forName("java.langs.String2");
		} catch (ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}
		
		//실행 예외 처리
		String data1 = null;
		String data2 = null;
		try {
		data1 = args[0];
		data2 = args[1];
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
//			return;  //메인 메소드 안에서 return 을하면 프로그램을 종료하는는 효과를 낸다
		}
		System.out.println("실행");
		
		
		try {
		int value1 = Integer.parseInt(data1);
		int value2 = Integer.parseInt(data2);
		
		int result = value1 + value2;
		System.out.println(result);
		} catch (NumberFormatException e) {
			System.out.println("숫자로 변환할수 없습니다.");
//			return;   //종료가 된다고 해도 finally는 무조건 실행된다////////////////////
		} finally {
			System.out.println("다시 실행하세요.");
		}
		System.out.println();
		
		//다중 catch
		try {
			data1 = args[0];
			data2 = args[1];
			
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			
			int result = value1 + value2;
			System.out.println(result);
				
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
		} catch (NumberFormatException e) {
			System.out.println("숫자로 변환할수 없습니다.");
		} finally {
			System.out.println("다시 실행하세요.");
		}
		System.out.println();
		
		//catch 블록의 순서
		try {
			//data1 = args[0];
			//data2 = args[1];
			
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			
			int result = value1 + value2;
			System.out.println(result);
		}  catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
		} catch(Exception e) {
			System.out.println("실행에 문제가 있습니다.");
//			System.out.println(e);
		} finally {
			System.out.println("다시 실행하세요.");
		}
		System.out.println();
		//예외처리 떠넘기기
		try {
			findClass();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();   //printStackTrace() 오류가난 이력 보여줌 대신 내부코드 유출 가능성있음
			
		}
							
	}

	public static void findClass() throws ClassNotFoundException {
		Class clazz = Class.forName("java.lang.String2");
	}
	
}
