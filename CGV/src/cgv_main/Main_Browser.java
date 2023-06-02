package cgv_main;

import java.time.*;
import admin.*;
import movie_info.*;

;public class Main_Browser {
	static CGV cgv = CGV.getTotal();
	
//	문제점 1. 영화별로 시간을 다르게 안넣어줌
//	문제점 2. 영화 좌석 선택후 예매시 같은 좌석선택 못하게 하지못함
//	문제점 3. while 문 너무많이 넣음 , 코드가 복잡하다.. 
	
	
	public static void main(String[] args) throws Exception {
		AdminBrowser start = new AdminBrowser();
		inputInfo();
		start.mainView();
	} 
	
	public static void inputInfo() {
//  각 영화별로 영화 기본정보 / 상세정보 값 넣어줌
//	DefaultInfo 클래스에 제목 장르 국가 값 넣어줌
//	DetailInfo 클래스에 영화세부정보 예매율 상영시간 개봉날짜 연령 값 넣어줌
		
	Movie_Default_Info defaultInfo1 = new Movie_Default_Info("분노의 질주-라이드 오어 다이" , "액션" , "미국");
	Movie_Detail_Info detailInfo1 = new Movie_Detail_Info(12.5 , 141 , LocalDate.of(2023,05,17) , 15);
	
	Movie_Default_Info defaultInfo2 = new Movie_Default_Info("남은 인생 10년" , "로맨스,멜로" , "일본");
	Movie_Detail_Info detailInfo2 = new Movie_Detail_Info(5.6 , 124 , LocalDate.of(2023,05,24) , 12);
	
	Movie_Default_Info defaultInfo3 = new Movie_Default_Info("범죄도시3" , "범죄,액션" , "한국");
	Movie_Detail_Info detailInfo3 = new Movie_Detail_Info(40.5 , 105 , LocalDate.of(2023,05,31) , 15);
	
	Movie_Default_Info defaultInfo4 = new Movie_Default_Info("트랜스포머-비스트의 서막" , "액션,SF" , "미국");
	Movie_Detail_Info detailInfo4 = new Movie_Detail_Info(3.0 , 127 , LocalDate.of(2023,06,06) , 12);
	
	Movie_Default_Info defaultInfo5 = new Movie_Default_Info("플래시" , "액션" , "미국");
	Movie_Detail_Info detailInfo5 = new Movie_Detail_Info(4.6 , 144 , LocalDate.of(2023,06,14) , 12);
	
	inputCalender(detailInfo1);
	inputCalender(detailInfo2);
	inputCalender(detailInfo3);
	inputCalender(detailInfo4);
	inputCalender(detailInfo5);
	
	defaultInfo1.addmovie_Detail(detailInfo1);
	defaultInfo2.addmovie_Detail(detailInfo2);
	defaultInfo3.addmovie_Detail(detailInfo3);
	defaultInfo4.addmovie_Detail(detailInfo4);
	defaultInfo5.addmovie_Detail(detailInfo5);
	
	openingCheck(defaultInfo1 , detailInfo1);
	openingCheck(defaultInfo2 , detailInfo2);
	openingCheck(defaultInfo3 , detailInfo3);
	openingCheck(defaultInfo4 , detailInfo4);
	openingCheck(defaultInfo5 , detailInfo5);
	
	}
	
// 상영작인지 개봉예정작인지 현재시간으로 비교후 따로 넣어주는 메소드
	public static void openingCheck(Movie_Default_Info defaultInfo  , Movie_Detail_Info detailInfo) {
		LocalDate n = LocalDate.now();
		if(n.isAfter(detailInfo.getOpeningdate())) {
			cgv.addmovieList(defaultInfo);
		}else {
			cgv.addcommingsoonList(defaultInfo);
		}
	}
	
//	영화 시간표 넣는 메소드
	public static void inputCalender(Movie_Detail_Info detailInfo) {
		
		LocalDate n = LocalDate.now();
		LocalTime t = LocalTime.of(00, 00);
		LocalDateTime nt =  LocalDateTime.of(n,t);
		
		
		LocalDateTime[] movieSchedule = {
//		당일날 예매시간표
		nt.plusHours(10).plusMinutes(30),
		nt.plusHours(18).plusMinutes(20),
//		당일+1 날 예매 시간표
		nt.plusDays(1).plusHours(9).plusMinutes(0),
		nt.plusDays(1).plusHours(13).plusMinutes(0),
		nt.plusDays(1).plusHours(16).plusMinutes(0),
		nt.plusDays(1).plusHours(19).plusMinutes(30)};		
		
	
				
		detailInfo.setMovieSchedule(movieSchedule);
	
	}
}
