package com.yedam.java.ch03.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		//Map 컬렉션 생성 < 클래스 , 클래스 >안에는 클래스만 가능
		Map<String, Integer> map = new HashMap<>();
		
		//객체 저장
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 100);
		System.out.println("총 Entry 수 : "+ map.size());
		
		//객체 찾기
		System.out.println("\t홍길동 : "+map.get("홍길동"));
		System.out.println();
		
		//객체를 하나씩 처리
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("\t"+key+" : "+ value);
		}
		System.out.println();
		for(String key : keySet) {
			Integer value = map.get(key);
			System.out.println("\t"+key+" : "+ value);
		}
		System.out.println();
		
		//객체 삭제
		map.remove("홍길동");
		System.out.println("총 Entry 수 : "+ map.size());
		
		//객체를 하나씩 처리 2
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> enteryIterator = entrySet.iterator();
		while(enteryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = enteryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t"+key+" : "+ value);
		}
		
		System.out.println();
		
		for(Map.Entry<String, Integer> entry : entrySet) {
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t"+key+" : "+ value);
		}
		System.out.println();
		
		//객체 전체 삭제
		map.clear();
		System.out.println("총 Entry 수 : "+ map.size());
		System.out.println();
		
		/*************************************************/
		
		Map<Student, Integer> scores = new HashMap<Student , Integer>();
		
		scores.put(new Student(1,"홍길동"), Integer.valueOf(95));
		scores.put(new Student(1,"홍길동"), 95); //동일
		
		System.out.println("총 Entry 수 : "+ scores.size());
		
		

	}

}
