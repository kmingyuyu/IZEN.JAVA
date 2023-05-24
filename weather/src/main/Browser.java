package main;


import java.time.*;


import movie_info.*;

public class Browser {

	public static void main(String[] args) {

		Browser B = new Browser();
		B.inputInfo();
		
					
		
		
		
	}
	
	
	
	public void inputInfo() {
//  각 영화별로 영화 기본정보 / 상세정보 값 넣어줌
//	DefaultInfo 클래스에 제목 장르 국가 값 넣어줌
//	DetailInfo 클래스에 영화세부정보 예매율 상영시간 개봉날짜 연령 값 넣어줌
		
	DefaultInfo defaultInfo1 = new DefaultInfo("분노의 질주-라이드 오어 다이" , "액션" , "미국");
	DetailInfo detailInfo1 = new DetailInfo(12.5 , 141 , LocalDate.of(2023,05,17) , 15);
	
	DefaultInfo defaultInfo2 = new DefaultInfo("남은 인생 10년" , "로맨스,멜로" , "일본");
	DetailInfo detailInfo2 = new DetailInfo(5.6 , 124 , LocalDate.of(2023,05,24) , 12);
	
	DefaultInfo defaultInfo3 = new DefaultInfo("범죄도시3" , "범죄,액션" , "한국");
	DetailInfo detailInfo3 = new DetailInfo(40.5 , 105 , LocalDate.of(2023,05,31) , 15);
	
	 inputCalender(detailInfo1);
	
	
	
	}
	
	public void inputCalender(DetailInfo detailInfo) {
		
		LocalDate n = LocalDate.now();
		LocalTime t = LocalTime.of(00, 00);
		LocalDateTime nt =  LocalDateTime.of(n,t);
		
		if(detailInfo.getOpeningdate().isBefore(n)){
			LocalDateTime[] movieSchedule = {
//					당일날 예매시간표
					nt.plusHours(12).plusMinutes(30),
					nt.plusHours(15).plusMinutes(00),
					nt.plusHours(18).plusMinutes(20),
//					당일+1 날 예매 시간표
					nt.plusDays(1).plusHours(10).plusMinutes(0),
					nt.plusDays(1).plusHours(13).plusMinutes(0),
					nt.plusDays(1).plusHours(16).plusMinutes(0),
					nt.plusDays(1).plusHours(19).plusMinutes(30),
//					당일+2 날 예매 시간표
					nt.plusDays(2).plusHours(10).plusMinutes(0),
					nt.plusDays(2).plusHours(16).plusMinutes(0),
					nt.plusDays(2).plusHours(20).plusMinutes(40)};
			
			
			
			
		}else{
			System.out.print(detailInfo.getOpeningdate() + "\n" + 
		                     detailInfo.getOpeningdate().compareTo(n) +"-DAY" +" 대개봉!");
		}; 
		
		
		
		
		
		
		
	
	
		
	
	
	
	
	
	}
}
	

