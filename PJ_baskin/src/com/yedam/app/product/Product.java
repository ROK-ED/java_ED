package com.yedam.app.product;

import java.sql.Date;

public class Product {
	private int productId;
	private String productName;
	private int inputValue;
	private int nowValue;
	
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
	private Date inputDate;

	@Override
	public String toString() {
		   return "제품번호 : " + productId
		         + ", 제품명 " + productName
		         + ", 입고량 : " +inputValue
		         + ", 현재랑 : " + nowValue
		         + ", 입고일 : " + inputDate;
		   }
}
