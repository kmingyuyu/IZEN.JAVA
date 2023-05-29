package admin;

import java.util.*;
import utils.Define;
import member.*;

public class adminBrowser {
	Scanner scanner = new Scanner(System.in);
	AdminPersonBrowser personBrowser = new AdminPersonBrowser();
	MovieBrowser movieBrowser = new MovieBrowser();
	MemberBrowser memberBrowser = new MemberBrowser();
	
	
	public String mainView() {
		int remote = Define.ADMIN_BROWSER;
		while(true) {
			switch (remote) {
			case -1: // 나가기시 종료
				break;
			case 0: remote = adminView(); //기본 비회원 메인화면
				break;
			case 1: remote = personBrowser.join(); // 1>회원가입 화면
				break;
			case 2: remote = personBrowser.login(); // 2>로그인 화면
				break;
			case 3: remote = movieBrowser.movieMenu(); // 3>무비차트 화면				
				break;
			case 31: 	remote = movieBrowser.playing_Movie();	// 3>무비차트 -> 1>현재상영중 화면
				break;
			case 32:	remote = movieBrowser.opening_Movie();	// 3>무비차트 -> 2>개봉예정 화면
				break;
			case 100: memberBrowser.memberMainView(); // 로그인시 회원뷰로 이동
				break;
				}
			}
		}
		
			
	public int adminView () {
		while (true) {
			System.out.println("--------------------------------------------------");
			System.out.println("------------안녕하세요 cgv 인천점 입니다!---------------");
			System.out.println("--------------------------------------------------");
			System.out.println("-----------------서비스를 선택해주세요------------------");
			System.out.println("--------|1> 회원가입|2> 로그인|3> 무비 차트|-------------");
			System.out.println("-------------------|4> 나가기|----------------------");
			String menu = scanner.next();
			switch (menu) {
			case "1":  return Define.JOIN;
			case "2":  return Define.LOGIN;
			case "3":  return Define.MOVIEMENU;   
			case "4": System.out.println("이용해 주셔서 감사합니다"); return Define.EXIT;
			default : System.err.println("잘못 입력하셨습니다");			
				}
			}
		}
	
	
	}