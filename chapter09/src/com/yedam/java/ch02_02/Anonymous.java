package com.yedam.java.ch02_02;

public class Anonymous {
	private int field;
	
	public void method(int arg1, int arg2) {
		int var1 = 0;
		int var2 = 0;
		
		field = 10;
		
//		arg1 = 20;
//		arg2 = 20;
		
		Calculatable calc = new Calculatable() {
			//이 안을 중첩클래스라고 봐야함 안에 수들은 전부 final 성격을 띄어야함
			@Override
			public int sum() {
				int result = field + arg1 + arg2 + var1 + var2;
				return 0;
			}
		};
		
		System.out.println(calc.sum());
	}

}
