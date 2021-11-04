package com.yedam.java.ch06.arrays;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		//Arrays 클래스 : 배열 복사, 항목정렬, 항목검색
		
		//배열복사 : Arrays.copyOf / Arrays.copyOfRange
		
		char[] arr1 = {'J','A','V','A'};
		
		//방법1
		char[] arr2 = new char[arr1.length];
		System.arraycopy(arr1, 0, arr2, 0, arr1.length);
		for(char ch : arr2) {
			System.out.print(ch);
		}
		System.out.println();
		
		//방법2
		char[] arr3 = Arrays.copyOf(arr1, arr1.length);
		System.out.println(Arrays.toString(arr3));
		
		//방법3
		char[] arr4 = Arrays.copyOfRange(arr1, 1, 3);
		System.out.println(Arrays.toString(arr4));
		
		System.out.println();
		
		//배열 항목 비교
		// - equals : 1차 항목의 값만 비교 
		// - deepEquals : 1차 항목이 서로 다른 배열을 참조할 경우 중첩된 배열의 항목까지 비교
		
		int[][] original = {{1,2},{3,4,5}};
		
		//얕은 복사 후 비교
		System.out.println("=== 얕은 복제 후 비교 ===");
		int[][] cloned1 = Arrays.copyOf(original, original.length);
		System.out.println("배열 번지 비교 : "+ original.equals(cloned1));
		System.out.println("1차 배열 항목값 비교 : " + Arrays.equals(original, cloned1));
		System.out.println("중첩 배열 항목값 비교 : " + Arrays.deepEquals(original, cloned1));
		
		System.out.println();
		
		//깊은 복사 후 비교
		System.out.println("=== 깊은 복제 후 비교 ===");
		int[][] cloned2 = Arrays.copyOf(original, original.length);
		cloned2[0] = Arrays.copyOf(original[0], original[0].length);
		cloned2[1] = Arrays.copyOf(original[1], original[1].length);
		System.out.println("배열 번지 비교 : "+ original.equals(cloned2));
		System.out.println("1차 배열 항목값 비교 : " + Arrays.equals(original, cloned2));
		System.out.println("중첩 배열 항목값 비교 : " + Arrays.deepEquals(original, cloned2));
		
		System.out.println();
		
/*	
		배열 항목 정렬
		- 기본 타입 또는 String 타입일 경우엔 자동으로 오름차순 정령
		- 사용자의 정의 클래스 타입일 경우에는 클래스가 Comparable() 구현하고 있어야 정렬이 된다.
*/		
		
		int[] scores = { 99, 97, 98 };
		Arrays.sort(scores);
		for(int score : scores) {
			System.out.println(score);
		}
		
		String[] names = {"홍길동","박동수","김민수"};
		Arrays.sort(names);
		for(String name : names) {
			System.out.println(name);
		}
		
		Member m1 = new Member("홍길동");
		Member m2 = new Member("박동수");
		Member m3 = new Member("김미수");
		
		Member[] members = {m1, m2, m3};
		Arrays.sort(members);
		for(Member member : members) {
			System.out.println(member);
		}
		
		System.out.println();
		
		// 배열 항목 검색 : 배열 항목에서 특정 값이 위치한 인덱스를 얻는 것
		// Arrays.sort() 정렬 후 Arrays.binarySearch() 항목 찾음
		
		int[] scores1 = { 99, 97, 98 };
		Arrays.sort(scores1);
		int index = Arrays.binarySearch(scores1, 99);
		System.out.println("찾은 인덱스 : "+index);
		
		String[] names1 = {"홍길동","박동수","김민수"};
		Arrays.sort(names1);
		index = Arrays.binarySearch(names1, "홍길동");
		System.out.println("찾은 인덱스 : "+index);
		
		Member m4 = new Member("홍길동");
		Member m5 = new Member("박동수");
		Member m6 = new Member("김미수");
		Member[] memberList = {m4,m5,m6};
		Arrays.sort(memberList);
		index = Arrays.binarySearch(memberList, m6);  //여기선 이름 넣으면 안됨
		System.out.println("찾은 인덱스 : "+index);
		
		
		
	}

}
