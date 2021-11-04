package com.yedam.java.ch06.arrays;

public class Member implements Comparable<Member> {
	String name;
	Member(String name){
		this.name = name;
	}

	@Override
	public int compareTo(Member o) {
		return name.compareTo(o.name);
	
	}
	
	@Override
	public String toString() {
		return name;
	}

}
