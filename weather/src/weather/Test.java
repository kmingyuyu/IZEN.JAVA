package weather;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		int year = 2023;
		int month = 10;
		int START_DAY_OF_WEEK = 0;
		int END_DAY = 0;
		
		Calendar sDay = Calendar.getInstance(); // 시작일
		Calendar eDay = Calendar.getInstance(); // 끝일
		
		sDay.set(year, month-1, 1); 
		eDay.set(year, month, 1);
		
		eDay.add(Calendar.DATE, -1);
		// 첫번째 요일이 무슨 요일인지
		START_DAY_OF_WEEK = sDay.get(Calendar.DAY_OF_WEEK);
		// eDay에 지정된 날짜
		END_DAY = eDay.get(Calendar.DATE);
		
		System.out.println("      " + year + "년 " + month + "월");
		System.out.println(" SU MO TU WE TH FR SA");
		
		for(int i=1; i < START_DAY_OF_WEEK; i++) {
			System.out.print("  ");
		}
		for(int i=1, n= START_DAY_OF_WEEK; i <= END_DAY; i++, n++) {
			System.out.print((i < 10)? "  "+ i : " " + i);
			if(n%7 == 0) System.out.println();
		}

	}

}
