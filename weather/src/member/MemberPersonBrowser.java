package member;

import java.util.*;

import movie_info.*;
import utils.Define;

public class MemberPersonBrowser {
	Scanner scanner = new Scanner(System.in);
	static CGV cgv = CGV.getTotal();
	
	String menu ; // 스캐너 입력객체
	
	
	public int pwCheck() {
		while(true) {
			System.out.println(" * 비밀번호를 입력해주세요 * ");
			System.out.println("   |>EXIT 뒤로가기 ");
			String menu = scanner.next();
			Map<String, Person_Info> personList = cgv.getPersonList();
			for(int i=0; i<personList.size(); i++) {
				Person_Info personInfo = personList.get(cgv.getTemp_ID());
				if(personInfo.getMember_Password().equals(menu)) {
					System.out.println(" * 비밀번호가 확인 되었습니다 * ");
					System.out.println(personInfo.toString());
					return Define.INFOMENU;
				}else if(menu.equals("exit") ||menu.equals("EXIT")) {
					return Define.MEMBER_BROWSER;
				}else {
					System.err.println(" * 비밀번호가 틀렸습니다 * ");
				}
			}
		}
	}
	
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
	}
	
	public int Info_Person() {
		while(true) {
			Map<String, Person_Info> personList = cgv.getPersonList();
			for(int i=0; i<personList.size(); i++) {
				Person_Info personInfo = personList.get(cgv.getTemp_ID());
				System.out.println(personInfo.toString());
				break;
			}
			System.out.println("   |>EXIT 뒤로가기 ");
			menu = scanner.next();
			switch (menu) {
			case "EXIT" , "exit":  return Define.INFOMENU;
			default : System.err.println("* 잘못 입력하셨습니다 *");
			}
		}
		}
		
	
	public int Info_Ticketing() {
		
		
		return Define.ADMIN_BROWSER;
	}
	public int Info_Secession() {
		while(true) {
			System.out.println(" * 회원 탈퇴 하시겠습니까? (Y/N) * ");
			menu = scanner.next();
			switch (menu) {
			case "Y" , "y": PhoneNumber_Check (); 
			case "N" , "n": return Define.INFOMENU;
			default : System.err.println("* 잘못 입력하셨습니다 *");
			}
		}
}
	
	public int PhoneNumber_Check () {
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
						return Define.PW_CHECK;
					
				}else if(!personInfo.getMember_PhoneNumber().equals(menu)){
					System.err.println(" * 가입하신 번호가 없습니다 다시 입력해주세요 * ");
				}
			}
		}
		
	}
	
	
	
	
	
	
	public int logout() {
		while(true) {
			System.out.println(" * 로그아웃 하시겠습니까? (Y/N) * ");
			menu = scanner.next();
			switch (menu) {
			case "Y" , "y":
				cgv.setLogin(false);
				cgv.setTemp_ID(null);
				System.out.println(" * 로그아웃 되었습니다 * ");
				return Define.ADMIN_BROWSER;
			case "N" , "n":  return Define.INFOMENU;
			default : System.err.println("* 잘못 입력하셨습니다 *");
			}
		}
		}
	
	
}
