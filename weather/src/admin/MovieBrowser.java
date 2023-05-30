package admin;

import java.time.LocalDate;
import java.util.*;
import movie_info.*;
import utils.Define;

public class MovieBrowser {
	Scanner scanner = new Scanner(System.in);
	static CGV cgv = CGV.getTotal();
	
	LocalDate n = LocalDate.now();
	String menu ; // 스캐너 입력객체
	int num = 0; 
	
	Map<Integer, Movie_Default_Info> movieList_default = cgv.getMovieList_Default();
	Movie_Default_Info m = movieList_default.get("sky");

	
	public int movieMenu() {
		while (true) {
			System.out.println("-----------------서비스를 선택해주세요------------------");
			System.out.println("------------|1> 현재 상영중 |2> 개봉 예정작|------------");
			System.out.println("-------------------|3> 나가기|----------------------");
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
			default : System.err.println("* 잘못 입력하셨습니다 *");			
				}
			}	
	}
	
	public void menuChoice() {
		for(Movie_Default_Info Defalut : defaultList) {
			ArrayList<Movie_Detail_Info> movieDetail = Defalut.getMovie_DetaillList();
			for(int i=0 ; i<movieDetail.size(); i++  ) {
				Movie_Detail_Info detail = movieDetail.get(i);
				if(n.isAfter(detail.getOpeningdate())) {
					if(menu.equals("1")) {
						num+=1;
						moiveList(Defalut , detail , num);
					}
				}
				 if(n.isBefore(detail.getOpeningdate())) {
					 if(menu.equals("2")) {
						 num+=1;
						 moiveList(Defalut , detail , num);
					 }
				}
					}
				}
		num = 0;
			}
	
	
	public int playing_Movie() {
		while(true) {
			System.out.println("----------------------현재 상영중---------------------");
			menuChoice();
			System.out.println("\t|1> 예매하기\t|2> 나가기");
			menu = scanner.next();
			switch (menu) {
			case "1": 
				if(cgv.isLogin() == true) { return MovieChoice();}
				else {
					System.out.println("예매는 로그인시 가능합니다 로그인 하시겠습니까?");
					System.out.println("\t|1> 로그인\t|2> 나가기");
					menu = scanner.next();
					switch (menu) {
					case "1":  System.out.println("로그인 창으로 이동합니다"); return Define.LOGIN;
					case "2":  return Define.MOVIEMENU;
					default : System.err.println("* 잘못 입력하셨습니다 *");
					}
				}
			case "2":  return Define.MOVIEMENU;
			default : System.err.println("* 잘못 입력하셨습니다 *");
			}
			
		}
	}
	public int MovieChoice() {
		System.out.println("\t* 예매하실 영화번호를 입력해주세요 *");	
		num = scanner.nextInt();
		while(true) {
			ArrayList<Movie_Default_Info> defaultList= cgv.getMovieList();
			if(defaultList.size() >= num) {
				cgv.putTemp_Movie(cgv.getTemp_ID(), num-1);
				System.out.println("예매 창으로 이동합니다"); return Define.TICKET_TIMECHOICE;
			}
			else {
				System.err.println("* 잘못 입력하셨습니다 *");	
			}
		}
	}
	
	
	
	
	public int opening_Movie() {
		while(true) {
			System.out.println("----------------------개봉 예정작---------------------");
			menuChoice();
			System.out.println("\t|1> 나가기");
			menu = scanner.next();
			switch (menu) {
			case "1":  return Define.MOVIEMENU;
			default : System.err.println("* 잘못 입력하셨습니다 *");			
				}
		}
	}


 	public void moiveList(Movie_Default_Info Defalut , Movie_Detail_Info detail , int num) {
 			System.out.println("< " + num + " >" + "\t[ " + Defalut .getTitle() + " ] " + "("+ detail.getAgeGroup() + " 세)");
 			System.out.println(" 개봉날짜: " + detail.getOpeningdate() + " | 예매율: " + detail.getReservationRate() + " % " );
 			System.out.println(" 장르: " + Defalut.getGenre() + " | " + "국가: " + Defalut.getCountry());
 			System.out.println(" 상영시간: " + detail.getRunningTime() + "분");
 			System.out.println("--------------------------------------------------");
 	}
 	

}