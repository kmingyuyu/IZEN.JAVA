package admin;

import java.time.*;
import java.util.*;
import java.util.Map.Entry;

import movie_info.*;
import utils.Define;

public class MovieBrowser {
	Map<Movie_Default_Info , Movie_Detail_Info> movieList = cgv.getMovieList();
	Scanner scanner = new Scanner(System.in);
	static CGV cgv = CGV.getTotal();
	
	
	LocalDate n = LocalDate.now(); 
	int num = 0; 
	String menu ; // 스캐너 입력객체

	
	public int movieMenu() {
		System.out.println("-----------------서비스를 선택해주세요------------------");
		System.out.println("------------|1> 현재 상영중 |2> 개봉 예정작|------------");
		System.out.println("-------------------|3> 나가기|----------------------");
		while (true) {
			menu = scanner.next();
			switch (menu) {
			case "1":  return Define.PLAYING_MOVIE;
			case "2":  return Define.OPENING_MOVIE;
			case "3": 
				if(cgv.isLogin() == true) {
					return Define.MEMBER_BROWSER;
				}
				else {
					return Define.ADMIN_BROWSER;
				}
			default : System.err.println(" * 잘못 입력하셨습니다 다시 입력해주세요 * ");			
				}
			}	
	}
	
	public void menuChoice() {
		for(Entry<Movie_Default_Info, Movie_Detail_Info> default_Movie : movieList.entrySet()) {
			if(menu.equals("1")) {
				num +=1;
				if(default_Movie.getValue().getOpeningdate().isBefore(n)) {moiveList(default_Movie , num);}
			}
			if(menu.equals("2")) {
				num +=1;
				if(default_Movie.getValue().getOpeningdate().isAfter(n)) {moiveList(default_Movie , num);}	
			}
			}
		num = 0;
	}
			
		
			
			


	
	public int playing_Movie() {
			System.out.println("----------------------현재 상영중---------------------");
			menuChoice();
			System.out.println("\t|1> 예매하기\t|2> 나가기");
			while(true) {
				menu = scanner.next();
				switch (menu) {
				case "1": 
					if(cgv.isLogin() == true) { MovieChoice();}
					else {
						System.out.println("예매는 로그인시 가능합니다 로그인 하시겠습니까?");
						System.out.println("\t|1> 로그인\t|2> 나가기");
						menu = scanner.next();
						switch (menu) {
						case "1":  System.out.println("로그인 창으로 이동합니다"); return Define.LOGIN;
						case "2":  return Define.MOVIEMENU;
						default : System.err.println("* 잘못 입력하셨습니다 다시 입력해주세요 *");
						}
					}
				case "2":  return Define.MOVIEMENU;
				default : System.err.println("* 잘못 입력하셨습니다 다시 입력해주세요 *");
				}
			}
	}
	
	
	public int MovieChoice() {
		System.out.println("\t* 예매하실 영화번호를 입력해주세요 *");
		while(true) {
			num = scanner.nextInt();
			if(movieList.size() >= num) {
				System.out.println(" * 예매 페이지로 이동합니다 * ");
				return Define.TICKET_TIMECHOICE;
			}
			else {
				System.err.println(" * 없는 영화번호 입니다 다시 입력해주세요 * ");
			}
		}
	}
	
	
	
	
	public int opening_Movie() {
		System.out.println("----------------------개봉 예정작---------------------");
		menuChoice();
		System.out.println("\t|1> 나가기");
		while(true) {
			menu = scanner.next();
			switch (menu) {
			case "1": return Define.MOVIEMENU;
			default : System.err.println("* 잘못 입력하셨습니다 다시 입력해주세요 *");			
				}
		}
	}


 	public void moiveList(Entry<Movie_Default_Info, Movie_Detail_Info> default_Movie , int num) {
 			System.out.println("< " + num + " >" + "\t[ " + default_Movie.getKey().getTitle() + " ] " + "("+ default_Movie.getValue().getAgeGroup() + " 세)");
 	 		System.out.println("  개봉날짜: " + default_Movie.getValue().getOpeningdate() + " | 예매율: " + default_Movie.getValue().getReservationRate() + " % " );
 	 		System.out.println("  장르: " + default_Movie.getKey().getGenre() + " | " + "국가: " + default_Movie.getKey().getCountry());
 	 		System.out.println("  상영시간: " + default_Movie.getValue().getRunningTime() + "분");
 	 		System.out.println("--------------------------------------------------");
 	

 			}
 	
}