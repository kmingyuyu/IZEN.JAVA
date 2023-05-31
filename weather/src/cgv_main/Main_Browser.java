package cgv_main;

import java.time.*;
import java.util.*;
import java.util.Map.Entry;

import admin.adminBrowser;
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
		Map<Integer, Movie_Default_Info> movieList_default = cgv.getMovieList_Default();
		adminBrowser start = new adminBrowser();
		inputInfo();
		
		Main_Browser d = new Main_Browser();
		d.Info_Secession();

//		전체값 가져오는법
//			for(Entry<Integer, Movie_Default_Info> default_Movie : movieList_default.entrySet()) {
//				System.out.println(default_Movie.getValue());
//			Map<String, Movie_Detail_Info> movieList_detail = default_Movie.getValue().getMovieList_Detail();
//			for(Entry<String, Movie_Detail_Info> detail_Movie : movieList_detail.entrySet()) {
//				System.out.println(detail_Movie.getValue());
//				LocalDateTime[] t = detail_Movie.getValue().getMovieSchedule();
//					for(LocalDateTime date : t) {
//					System.out.println(date);
//				}
//			}
//			
//			
//		}
		Person_Info person_Info = new Person_Info
				("sky" , "5" , "2" , "3" , "4");
		Person_Info person_Info2 = new Person_Info
				("sky2" , "10" , "2" , "3" , "4");
//	싱글톤 CGV에 회원정보 넣어줌
	cgv.put_personList("sky", person_Info);
	cgv.put_personList("sky2", person_Info2);
	String menu ="5";
	
	
		
		
		}
	public int Info_Secession() {
		while(true) {
			System.out.println(" * 회원 탈퇴 하시겠습니까? (Y/N) * ");
			menu = scanner.next();
			switch (menu) {
			case "Y" , "y": PN_Check (); 
			case "N" , "n": return Define.INFOMENU;
			default : System.err.println("* 잘못 입력하셨습니다 *");
			}
		}
}
	
	public int PN_Check () {
		while(true) {
			System.out.println(" * 가입 하신 핸드폰 번호를 입력해주세요 * ");
			menu = scanner.next();
			Map<String, Person_Info> personList = cgv.getPersonList();
			for(int i=0; i<=5; i++) {
				Person_Info personInfo = personList.get(cgv.getTemp_ID());
				if(personInfo.getMember_PhoneNumber().equals(menu)) {
					System.out.println(" * 확인 되셨습니다 * ");
					break;
				}	else if(i == 5) {
						System.err.println(" * 5번 이상 틀리셨습니다 * ");
						System.err.println(" * 비밀번호 확인 창으로 이동합니다 * ");
						break;
					
				}else if(!personInfo.getMember_PhoneNumber().equals(menu)){
					System.err.println(" * 가입하신 번호가 없습니다 다시 입력해주세요 * ");
				}
			}
		}
		
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
	defaultInfo1.put_MovieList(defaultInfo2.getTitle(), detailInfo2);
	defaultInfo1.put_MovieList(defaultInfo3.getTitle(), detailInfo3);
	
	cgv.put_MovieList(1, defaultInfo1);
	cgv.put_MovieList(2, defaultInfo2);
	cgv.put_MovieList(3, defaultInfo3);
	
	
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
