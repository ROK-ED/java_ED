package com.yedam.java.ch01.object;

public class Member {
	public String id;
	
	public Member(String id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member member = (Member)obj;
			if(id.equals(member.id)) {
				return true;
			}
		}
	return false;
	}
	
	@Override
	public int hashCode() {
		//String 클래스의 hashCode() 같은 문자열일 경우 동일한 해시코드를 리턴하도록 오버라이딩 되어있다.
		return id.hashCode();
	}
}
