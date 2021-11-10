package com.app.data.acct;

public class Acct {
	private String acctId;
	private String acctPw;
	
	public String getAcctId() {
		return acctId;
	}
	public void setAcctId(String acctId) {
		this.acctId = acctId;
	}
	public String getAcctPw() {
		return acctPw;
	}
	public void setAcctPw(String acctPw) {
		this.acctPw = acctPw;
	}
	@Override
	public String toString() {
		return "ID : " + acctId + "  PW : "+ acctPw.length()+"자리";
	}
	
	

}
