package ch05.sec05;

public class SubStringExample {

	public static void main(String[] args) {
		
		String ssn= "880815-1234567";
//		                      substring(시작index , 끝index 직전)
		String firstnum = ssn.substring(0,6);
		System.out.println(firstnum);
//		                       substring(시작인덱스) :시작인덱스 부터 문자열 끝까지
		String secondnum = ssn.substring(7);
		System.out.println(secondnum);
		

	}

}
