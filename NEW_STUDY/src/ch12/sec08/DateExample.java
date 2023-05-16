package ch12.sec08;

import java.util.*;
import java.text.*;

public class DateExample {

	public static void main(String[] args) {
		Date now = new Date() ; //현재 날짜 생성
		String strNow1 = now.toString(); // String 타입으로 변환
		System.out.println(now);
		System.out.println(strNow1);
		
		
		// 날짜 모양 포멧
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		String strNow2 = sdf.format(now);
		System.out.println(strNow2);
		
		
		sdf = new SimpleDateFormat("오늘은 E요일");
	    System.out.println(sdf.format(now));
	    
	    sdf = new SimpleDateFormat("오늘은 D번째 날");
	    System.out.println(sdf.format(now));
	    
	    sdf = new SimpleDateFormat("이달의 d번째 날");
	    System.out.println(sdf.format(now));
		
		

	}

}
