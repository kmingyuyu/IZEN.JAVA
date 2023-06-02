package admin;

import java.time.*;
import java.util.*;
import movie_info.*;
import utils.Define;
import member.Ticketing;

public class MovieBrowser {
	Scanner scanner = new Scanner(System.in);
	static CGV cgv = CGV.getTotal();

	LocalDate n = LocalDate.now();
	int num = 0; // 입력객체
	String menu; // 스캐너 입력객체
	
//	무비차트 
	public int movieMenu() {
		System.out.println("-----------------서비스를 선택해주세요------------------");
		System.out.println("------------|1> 현재 상영중 |2> 개봉 예정작|------------");
		System.out.println("-------------------|3> 나가기|----------------------");
		while (true) {
			menu = scanner.next();
			switch (menu) {
			case "1":return Define.PLAYING_MOVIE;
			case "2":return Define.OPENING_MOVIE;
			case "3":
				if (cgv.isLogin() == true) {
					return Define.MEMBER_BROWSER;
					}else {
						return Define.ADMIN_BROWSER;
						}
			default:
				System.err.println(" * 잘못 입력하셨습니다 다시 입력해주세요 * ");
			}
		}
	}
//  1번2번 고를시 영화목록
	public void menuChoice() {
		int num2 = 0;
		
		if (menu.equals("1")) {
			ArrayList<Movie_Default_Info> movie_Default = cgv.getMovieList();
			for (Movie_Default_Info def : movie_Default) {
				ArrayList<Movie_Detail_Info> movie_Detail = def.getMovie_Detail();
				for (int i=0; i<movie_Detail.size(); i++) {
					Movie_Detail_Info det = movie_Detail.get(i);
					num2 += 1;
					moiveList(def, det, num2);
				}
			}
		}
		
		if (menu.equals("2")) {
			ArrayList<Movie_Default_Info> movie_Default = cgv.getCommingsoonList();
			for (Movie_Default_Info def : movie_Default) {
				ArrayList<Movie_Detail_Info> movie_Detail = def.getMovie_Detail();
				for (int i=0; i<movie_Detail.size(); i++) {
					Movie_Detail_Info det = movie_Detail.get(i);
					num2 += 1;
					moiveList(def, det, num2);
			
				}
			}
		}
		num2 = 0;
	}
	
//  현재상영중
	public int playing_Movie() {
		System.out.println("----------------------현재 상영중---------------------");
		menuChoice();
		System.out.println("\t|1> 예매하기\t|2> 나가기");
		while (true) {
			menu = scanner.next();
			switch (menu) {
			case "1":
				if (cgv.isLogin() == true) {
					return MovieChoice();
				} else {
					System.out.println("예매는 로그인시 가능합니다 로그인 하시겠습니까?");
					System.out.println("\t|1> 로그인\t|2> 나가기");
					menu = scanner.next();
					switch (menu) {
					case "1":
						System.out.println("로그인 창으로 이동합니다");
						return Define.LOGIN;
					case "2":
						return Define.MOVIEMENU;
					default:
						System.err.println("* 잘못 입력하셨습니다 다시 입력해주세요 *");
					}
				}
			case "2":
				return Define.MOVIEMENU;
			default:
				System.err.println("* 잘못 입력하셨습니다 다시 입력해주세요 *");
			}
		}
	}
	
//  예매영화고르기
	public int MovieChoice() {
		System.out.println("\t* 예매하실 영화번호를 입력해주세요 *");
		while (true) {
			num = scanner.nextInt();
			ArrayList<Movie_Default_Info> movie_Default = cgv.getMovieList();
			if (movie_Default.size() >= num) {
				System.out.println(" * 예매 페이지로 이동합니다 * ");

				Ticketing ticketingClass = new Ticketing();
				Person_Ticket_Info ticketing = new Person_Ticket_Info();
				ticketing.addMovieList(movie_Default.get(num - 1));

				return ticketingClass.ticketing(ticketing);
			} else {
				System.err.println(" * 없는 영화번호 입니다 다시 입력해주세요 * ");
			}
		}
	}

//	개봉예정작
	public int opening_Movie() {
		System.out.println("----------------------개봉 예정작---------------------");
		menuChoice();
		System.out.println("\t|1> 나가기");
		while (true) {
			menu = scanner.next();
			switch (menu) {
			case "1":
				return Define.MOVIEMENU;
			default:
				System.err.println("* 잘못 입력하셨습니다 다시 입력해주세요 *");
			}
		}
	}
	
//	영화목록 출력 : 개봉 / 상영중 메소드에 따로 안넣고 메소드 한곳에서 불러오기
	public void moiveList(Movie_Default_Info def, Movie_Detail_Info det, int num2) {
		System.out.println("< " + num2 + " >" + "\t[ " + def.getTitle() + " ] " + "(" + det.getAgeGroup() + " 세)");
		System.out.println("  개봉날짜: " + det.getOpeningdate() + " | 예매율: " + det.getReservationRate() + " % ");
		System.out.println("  장르: " + def.getGenre() + " | " + "국가: " + def.getCountry());
		System.out.println("  상영시간: " + det.getRunningTime() + "분");
		System.out.println("--------------------------------------------------");

	}

}