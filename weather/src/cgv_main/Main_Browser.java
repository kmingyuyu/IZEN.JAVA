package cgv_main;

import java.security.KeyStore.Entry;
import java.time.*;
import java.util.*;

import admin.adminBrowser;
import movie_info.*;
import member.*
;public class Main_Browser {

	Scanner scanner = new Scanner(System.in);
	static CGV cgv = CGV.getTotal();
	public String[][] seat = new String[5][9];
	
	
	public static void main(String[] args) {
		Map<Integer, Movie_Default_Info> movieList_default = cgv.getMovieList_Default();
		adminBrowser start = new adminBrowser();
		inputInfo();
		
		Collection<Movie_Default_Info> values = movieList_default.values();
		System.out.println(values);
		
		movieList_default.forEach((key, value) -> {	
			System.out.println(key + " : " + value);	
		});	
		
		
		
		}
		
	

	

	public void reference(){
		char row = 'A';

		for(int i=1; i<5; i++){
			System.out.print("\n"+row+"열  ");row++;
			for(int j=1; j<9; j++){
				String seat = (this.seat[i][j].equals("___"))?"◻︎":"◼︎";
				System.out.print((j)+seat+"  ");
			}
		}
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
	
	inputCalender(detailInfo1);
	inputCalender(detailInfo2);
	inputCalender(detailInfo3);
	 
	
	defaultInfo1.put_MovieList(defaultInfo1.getTitle(), detailInfo1);
	defaultInfo1.put_MovieList(defaultInfo2.getTitle(), detailInfo1);
	defaultInfo1.put_MovieList(defaultInfo3.getTitle(), detailInfo1);
	
	cgv.put_MovieList(1, defaultInfo1);
	cgv.put_MovieList(2, defaultInfo2);
	cgv.put_MovieList(3, defaultInfo3);
	
	
	}
	
	
	
	public static void inputCalender(Movie_Detail_Info detailInfo) {
		
		LocalDate n = LocalDate.now();
		LocalTime t = LocalTime.of(00, 00);
		LocalDateTime nt =  LocalDateTime.of(n,t);
		
		if(detailInfo.getOpeningdate().isBefore(n)){
				LocalDateTime[] movieSchedule = {
//						당일날 예매시간표
						nt.plusHours(10).plusMinutes(30),
						nt.plusHours(18).plusMinutes(20),
//						당일+1 날 예매 시간표
						nt.plusDays(1).plusHours(9).plusMinutes(0),
						nt.plusDays(1).plusHours(13).plusMinutes(0),
						nt.plusDays(1).plusHours(16).plusMinutes(0),
						nt.plusDays(1).plusHours(19).plusMinutes(30)};		
				
				detailInfo.setMovieSchedule(movieSchedule);
		}
	
	}
}
