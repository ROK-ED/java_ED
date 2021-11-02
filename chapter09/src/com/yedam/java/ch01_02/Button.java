package com.yedam.java.ch01_02;

public class Button {
	OnClickListner listerner;
	
	void setOnClickListner(OnClickListner listerner) {
		this.listerner = listerner;
	}
	
	void touch() {
		listerner.onClick();
	}
	
	static interface OnClickListner{
		void onClick();
		
	}

}
