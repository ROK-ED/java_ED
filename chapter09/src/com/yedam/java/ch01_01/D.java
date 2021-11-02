package com.yedam.java.ch01_01;

public class D {
	// 로컬 클래스에서 사용 제한

	// 자바 7 이전
	public void medhod1(final int arg) {
		final int localVariable = 1;

		class Inner {
			public void method() {
				int reslut = arg + localVariable;
			}
		}

	}

	// 자바 8 이후

	public void method2(int arg) {
		int localVariable = 1;
//		arg = 100;                  //final 생략됨
//		localVariable = 100;        //final 생략됨

		class Inner {
			public void method() {
				int reslut = arg + localVariable;
			}
		}

	}
}