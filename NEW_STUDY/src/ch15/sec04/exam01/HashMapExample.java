package ch15.sec04.exam01;

import java.util.*;


public class HashMapExample {

	public static void main(String[] args) {
//		Map( key의 타입 , 저장할 값의 타입) 을 명시
		Map<String, Integer> map = new HashMap<>();
		
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95);
		System.out.println(map.size()); //map의 은 같은 key값이 같은 객체는 중복저장하지 않는다.
		
//		키로 값을 얻기
		String key = "홍길동";
		int value = map.get(key);
		System.out.println(value);
		
		map.remove("홍길동"); //remove = key 값으로 데이터 삭제
		
//		전체 데이터 출력하는 방법1
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();

		while(keyIterator.hasNext()) {
			String k = keyIterator.next();
			int v = map.get(k);
			System.out.println(k + ":" + v);
			
			System.out.println();
			
			
		}
		
	}

}
