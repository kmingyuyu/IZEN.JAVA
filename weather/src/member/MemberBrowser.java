package member;

import utils.Define;
import java.util.*;
import admin.*;

public class MemberBrowser  {
	Scanner scanner = new Scanner(System.in);
	
	public String memberMainView() {
		adminBrowser adminbrowser = new adminBrowser();
		MemberPersonBrowser personBrowser = new MemberPersonBrowser();
		MovieBrowser movieBrowser = new MovieBrowser();
		Ticketing ticketing = new Ticketing();
		
		int remote = Define.MEMBER_BROWSER;
		while(true) {
			switch (remote) {
			case -1: // 나가기시 종료
				break;
			case 100: remote = memberView(); // 회원 메인화면
				break;
			case 101: remote = personBrowser.infoMenu(); // 1>회원관리 메뉴 화면
				break;
			case 110: remote = personBrowser.pwCheck(); // 1>회원관리메뉴 전 비밀먼호확인 메뉴 화면
				break;
			case 111: remote = personBrowser.Info_Person(); // 1>회원관리 메뉴 -> 회원정보 화면
				break;
			case 112: remote = personBrowser.Info_Ticketing(); // 1>회원관리 메뉴 -> 예매내역 화면
				break;
			case 113: remote = personBrowser.Info_Secession(); // 1>회원관리 메뉴 -> 예매내역 화면
				break;
			case 102: remote = personBrowser.logout(); // 2>로그아웃 화면
				break;
			case 3: remote = movieBrowser.movieMenu(); // 3>무비차트 화면				
				break;
			case 31: remote = movieBrowser.playing_Movie();	// 3>무비차트 -> 1>현재상영중 화면
				break;
			case 32: remote = movieBrowser.opening_Movie();	// 3>무비차트 -> 2>개봉예정 화면
				break;
			case 141: remote = ticketing.movieTimeChoice();	//  예매 1.날짜 화면
				break;
			case 0: adminbrowser.mainView();	//  회원탈퇴/로그아웃시 비회원화면 으로 이동
				break;
				}
			}
	}
	
	public int memberView() {
		System.out.println("--------------------------------------------------");
		System.out.println("------------안녕하세요 cgv 인천점 입니다!---------------");
		System.out.println("--------------------------------------------------");
		System.out.println("-----------------서비스를 선택해주세요------------------");
		System.out.println("----------|1> 회원관리|2> 로그아웃|3> 무비차트-----------");
		System.out.println("-------------------|4> 나가기|----------------------");
		while (true) {
			String menu = scanner.next();
			switch (menu) {
			case "1":  return Define.PW_CHECK;
			case "2":  return Define.LOGOUT;
			case "3":  return Define.MOVIEMENU;   
			case "4": System.out.println("이용해 주셔서 감사합니다"); return Define.EXIT;
			default : System.err.println("* 잘못 입력하셨습니다 다시 입력해주세요 * ");			
				}
			}
	}

}
