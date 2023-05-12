package ch12.sec03.exam02;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class BytesToStringExample {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String data = "자바";
		
		
		
//		인코딩 utf-8 을 제일 많이 쓴다.
		byte[] arr1 = data.getBytes("EUC-KR"); // 문자열 -> btye배열로 변경(utf-8로 인코딩)
		System.out.println("arr1 : " + Arrays.toString(arr1));
		
//		디코딩 (사람이 알아볼수 있는 언어로 변경) 
		String str1 = new String(arr1, "EUC-KR"); // byte 배열을 문자열로 변경
		System.out.println("str1 : " + str1);
		
		
		

	}

}
