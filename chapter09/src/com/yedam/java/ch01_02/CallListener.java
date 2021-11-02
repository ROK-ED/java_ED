package com.yedam.java.ch01_02;

//import com.yedam.java.ch01_02.Button.OnClickListner;
//
//public class CallListener implements OnClickListner {
	
public class CallListener implements Button.OnClickListner {

	@Override
	public void onClick() {
		System.out.println("전화를 겁니다.");
		

	}

}
