package cgv_main;

import java.time.*;
import java.util.*;
import java.util.Map.Entry;

import admin.*;
import movie_info.*;
import utils.Define;
import member.*
;public class Main_Browser {
	Scanner scanner = new Scanner(System.in);
	static CGV cgv = CGV.getTotal();
	public String[][] seat = new String[5][9];
	String menu ; // 스캐너 입력객체
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		adminBrowser start = new adminBrowser();
		inputInfo();
		MovieBrowser movie = new MovieBrowser();
		AdminPersonBrowser d = new AdminPersonBrowser();
		MemberPersonBrowser t = new MemberPersonBrowser();
		MemberBrowser dd = new MemberBrowser();
		
//	싱글톤 CGV에 회원정보 넣어줌
		
		dd.memberMainView();
	ArrayList<Movie_Default_Info> movie_Default = cgv.getMovieList();
	cgv.addmovieTemp(movie_Default.get(1));
	Person_Info person =new Person_Info();
	person.setMember_ID("skyjangkin");
	person.setMember_Password("");
	person.setMember_PhoneNumber("01071280150");
	
	Map<String, Person_Info> personList = cgv.getPersonList();
	cgv.put_personList(person.getMember_ID(), person);
	
//	String id = "skyjangkin";

	
	
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
	
	inputCalender(detailInfo1);
	inputCalender(detailInfo2);
	inputCalender(detailInfo3);
	
	defaultInfo1.addmovie_Detail(detailInfo1);
	defaultInfo2.addmovie_Detail(detailInfo2);
	defaultInfo3.addmovie_Detail(detailInfo3);
	
	 
	cgv.addmovieList(defaultInfo1);
	cgv.addmovieList(defaultInfo2);
	cgv.addmovieList(defaultInfo3);
	
	}
	
	
	
	public static void inputCalender(Movie_Detail_Info detailInfo) {
		
		LocalDate n = LocalDate.now();
		LocalTime t = LocalTime.of(00, 00);
		LocalDateTime nt =  LocalDateTime.of(n,t);
		
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
