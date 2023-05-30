package member;

import java.util.*;

import movie_info.*;
import utils.Define;

public class MemberPersonBrowser {
	Scanner scanner = new Scanner(System.in);
	static CGV cgv = CGV.getTotal();
	
	String menu ; // 스캐너 입력객체
	
	public int infoMenu() {
		while(true) {
			System.out.println("-----------------서비스를 선택해주세요------------------");
			System.out.println("--------|1> 회원 정보|2> 예매내역|3> 회원탈퇴|-----------");
			System.out.println("-------------------|3> 나가기|----------------------");
			menu = scanner.next();
			switch (menu) {
			case "1":  return Define.INFO_PERSON;
			case "2":  return Define.INFO_TICKETING;
			case "3":  return Define.INFO_SECESSION;
			case "4":  return Define.MEMBER_BROWSER;
			default : System.err.println("* 잘못 입력하셨습니다 *");			
			}
		}
			
			
//		for(Person_Info info : personList) {
//			
//			System.out.println("ID :" + info.getMember_ID());
//			System.out.println("성함 :" + info.getMember_Name());
//			System.out.println("주민번호(앞자리) :" + info.getMember_RRN());
//			System.out.println("P/N :" + info.getMember_PhoneNumber());
//		}
		
	}
	
	public int Info_Person() {
		
		
		return Define.ADMIN_BROWSER;
	}
	public int Info_Ticketing() {
		
		
		return Define.ADMIN_BROWSER;
	}
	public int Info_Secession() {
		
		
		return Define.ADMIN_BROWSER;
	}
	
	
	public int logout() {
			
			
			return Define.ADMIN_BROWSER;
		}
}
