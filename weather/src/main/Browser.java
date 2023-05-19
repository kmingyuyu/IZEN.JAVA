package main;


import java.time.*;

import movie_info.*;

public class Browser {

	public static void main(String[] args) {

//		
//		LocalDateTime now = LocalDateTime.now();
//		LocalTime now1 = LocalTime.now();
//		System.out.println(now);
//		System.out.println(now1);
//		
//		LocalDate n = LocalDate.of(2023,05,15);
//		LocalDate n2 = n.plusDays(1);
//		LocalDate n3 = n.plusDays(2);
//		
//		System.out.println(n);
//		System.out.println(n2);
//		System.out.println(n3);
//		LocalTime t = LocalTime.of(12, 30);
//		System.out.println(t);
		LocalDate n = LocalDate.of(2023,05,19);
		LocalTime t = LocalTime.of(00, 00);
		
		
		LocalDateTime nt =  LocalDateTime.of(n,t);
		System.out.println(nt);
		
		LocalDateTime nt2 = nt.plusDays(1).plusHours(10).plusMinutes(20);
		System.out.println(nt2);
		
		
		
	}
	
	
	
	public void inputInfo() {
//  각 영화별로 영화 기본정보 / 상세정보 값 넣어줌
//	DefaultInfo 클래스에 제목 장르 국가 값 넣어줌
//	DetailInfo 클래스에 영화세부정보 예매율 상영시간 개봉날짜 연령 값 넣어줌
		
	DefaultInfo defaultInfo1 = new DefaultInfo("분노의 질주-라이드 오어 다이" , "액션" , "미국");
	DetailInfo detailInfo1 = new DetailInfo(43.4 , 141 , 20230517 , 15);
	
	DefaultInfo defaultInfo2 = new DefaultInfo("범죄도시" , "범죄,액션" , "한국");
	DetailInfo detailInfo2 = new DetailInfo(15.6 , 105 , 20230531 , 15);
	
	DefaultInfo defaultInfo3 = new DefaultInfo("가디언즈 오브 갤럭시-Volume 3" , "액션" , "미국");
	DetailInfo detailInfo3 = new DetailInfo(14.9 , 150 , 20230503 , 12);
	
	 inputCalender(detailInfo1);
	
	
	
	}
	
	public void inputCalender(DetailInfo detailInfo1) {
		
		LocalDate n = LocalDate.now();
		LocalTime t = LocalTime.of(00, 00);
		LocalDateTime nt =  LocalDateTime.of(n,t);
		
		LocalDateTime[] nt2 = {
//				당일날 예매시간표
				nt.plusHours(10).plusMinutes(0),
				nt.plusHours(12).plusMinutes(30),
				nt.plusHours(15).plusMinutes(00),
				nt.plusHours(18).plusMinutes(20),
//				당일+1 날 예매 시간표
				nt.plusDays(1).plusHours(10).plusMinutes(0),
				nt.plusDays(1).plusHours(13).plusMinutes(0),
				nt.plusDays(1).plusHours(16).plusMinutes(0),
				nt.plusDays(1).plusHours(19).plusMinutes(30),
//				당일+2 날 예매 시간표
				nt.plusDays(2).plusHours(10).plusMinutes(0),
				nt.plusDays(2).plusHours(16).plusMinutes(0),
				nt.plusDays(2).plusHours(20).plusMinutes(40),
				
				
		};
		
		
		LocalDate[] md = {n, n.plusDays(1) ,n.plusDays(2)};		
		
		LocalTime[] mt = { 
				t.plusHours(10).plusMinutes(0) ,
				t.plusHours(12).plusMinutes(30) ,
				t.plusHours(15).plusMinutes(00) ,
				t.plusHours(18).plusMinutes(20)
				};
		
		String[][] arrayTime = {md,mt};
		
		
		DayInfo dayInfo = new DayInfo();
		
		
		
		
	}
	
	
	
	
	
	
	
}
