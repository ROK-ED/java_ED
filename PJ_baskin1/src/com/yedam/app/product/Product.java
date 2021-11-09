package com.yedam.app.product;

import java.sql.Date;

public class Product {
	private int productId; 	//제품번호
	private String productName; //제품명
	private int inputValue;	//입고수량
	private int nowValue;	//현재수량
	private Date inputDate;	//입고일
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getInputValue() {
		return inputValue;
	}
	public void setInputValue(int inputValue) {
		this.inputValue = inputValue;
	}
	public int getNowValue() {
		return nowValue;
	}
	public void setNowValue(int nowValue) {
		this.nowValue = nowValue;
	}
	public Date getInputDate() {
		return inputDate;
	}
	public void setInputDate(Date inputDate) {
		this.inputDate = inputDate;
	}
	@Override
	public String toString() {
		return "제품번호 : " + productId
				+ ", 제품명 : " + productName
				+ ", 입고량 : " + inputValue
				+ ", 현재량 : " + nowValue
				+ ", 입고일 : " + inputDate;
	}
	
	
}
