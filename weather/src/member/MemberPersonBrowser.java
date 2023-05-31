package member;

import java.util.*;
import java.util.regex.Pattern;

import movie_info.*;
import utils.Define;

public class MemberPersonBrowser {
	Scanner scanner = new Scanner(System.in);
	static CGV cgv = CGV.getTotal();
	
	String menu ; // 스캐너 입력객체
	
	
	public int pwCheck() {
		System.out.println("----------------------회원 관리창---------------------");
		System.out.println("\t* 비밀번호를 입력해주세요 |> N 뒤로가기 * ");
		while(true) {
			String menu = scanner.next();
			Map<String, Person_Info> personList = cgv.getPersonList();
			for(int i=0; i<personList.size(); i++) {
				Person_Info personInfo = personList.get(cgv.getTemp_ID());
				if(personInfo.getMember_Password().equals(menu)) {
					System.out.println(" * 비밀번호가 확인 되었습니다 * ");
					return Define.INFOMENU;
				}else if(menu.equals("n") || menu.equals("N")) {
					return Define.MEMBER_BROWSER;
				}else {
					System.err.println(" * 비밀번호가 틀렸습니다 다시 입력해주세요 * ");
				}
			}
		}
	}
	
	public int infoMenu() {
		System.out.println("-----------------서비스를 선택해주세요------------------");
		System.out.println("--------|1> 회원 정보|2> 예매내역|3> 회원탈퇴|-----------");
		System.out.println("-------------------|4> 나가기|----------------------");
		while(true) {
			menu = scanner.next();
			switch (menu) {
			case "1":  return Define.INFO_PERSON;
			case "2":  return Define.INFO_TICKETING;
			case "3":  return Define.INFO_SECESSION;
			case "4":  return Define.MEMBER_BROWSER;
			default : System.err.println("* 잘못 입력하셨습니다 다시 입력해주세요 *");			
			}
		}
	}
	
	public int Info_Person() {
		System.out.println("----------------------회원 정보---------------------");
		Map<String, Person_Info> personList = cgv.getPersonList();
		for(int i=0; i<personList.size();) {
			Person_Info personInfo = personList.get(cgv.getTemp_ID());
			System.out.println(personInfo.toString());
			break;
			}
		System.out.println("--------------------------------------------------");
		System.out.println(" 뒤로 가시겠습니까? ( Y )  ");
		while(true) {
			menu = scanner.next();
			switch (menu) {
			case "Y" , "y": 
				System.out.println("* 회원관리 창으로 이동합니다 *");
				return Define.INFOMENU;
			default : System.err.println(" * 잘못 입력하셨습니다 다시 입력해주세요 * ");
			}
			}
		}
		
	
	public int Info_Ticketing() {
		
		
		return Define.ADMIN_BROWSER;
	}
	
	
	public int Info_Secession() {
		System.out.println(" * 회원 탈퇴를 진행합니다 *  ");
		System.out.println(" 가입하신 핸드폰 번호를 입력해주세요");
		while(true) {
			for(int i=0; i<10; i++) {
				menu = scanner.next();
				Map<String, Person_Info> personList = cgv.getPersonList();
				Person_Info personInfo = personList.get(cgv.getTemp_ID());
				if(personInfo.getMember_PhoneNumber().equals(menu)) {
					System.out.println(" * 확인 되셨습니다 * ");
					break;
				}else if(i == 5) {
					System.err.println(" * 5번 이상 틀리셨습니다 비밀번호 확인 창으로 이동합니다 * ");
					return Define.PW_CHECK;
				}else{
					System.err.println(" * 가입하신 번호가 없습니다 다시 입력해주세요 * ");
					}	
			}
			
			int r_Num = ((int) (Math.random()*9999)+1111);
			String num = Integer.toString(r_Num); 
			System.out.println(" 인증번호가 전송되었습니다. 인증번호를 입력해주세요");
			System.out.println("인증번호 : " + num);
			
			for(int y=0; y<10; y++) {
				String r_Num_Input = scanner.next();
				if(num.equals(r_Num_Input)) {
					System.out.println(" * 인증번호 확인 되었습니다 감사합니다 * ");
					break;
				}
				else if(y == 5) {
					System.err.println(" * 5번 이상 틀리셨습니다 비밀번호 확인 창으로 이동합니다 * ");
					return Define.PW_CHECK;
				}
				else{
					System.err.println(" * 인증번호가 틀립니다 다시 입력해주세요 * ");
					}	
			}
			System.out.println("\n 회원 탈퇴 하시겠습니까? ( Y / N )");
			while(true) {
				menu = scanner.next();
				switch (menu) {
				case "y" , "Y":
					Map<String, Person_Info> personList = cgv.getPersonList();
					personList.remove(cgv.getTemp_ID());
					cgv.setLogin(false);
					cgv.setTemp_ID(null);
					System.out.println(" * 탈퇴가 완료 되었습니다 이용해주셔서 감사합니다 * ");
					return Define.ADMIN_BROWSER;
				case "n" , "N":
					System.out.println("* 회원관리 창으로 이동합니다 *");
					return Define.INFOMENU;
				default : System.err.println("* 잘못 입력하셨습니다 다시 입력해주세요 *");			
				}
			}
		}
	}
	
	
	public int logout() {
		System.out.println(" 로그아웃 하시겠습니까? ( Y / N )  ");
		while(true) {
			menu = scanner.next();
			switch (menu) {
			case "Y" , "y":
				cgv.setLogin(false);
				cgv.setTemp_ID(null);
				System.out.println(" * 로그아웃 되었습니다 * ");
				return Define.ADMIN_BROWSER;
			case "N" , "n": 
				System.out.println("* 메인화면 으로 이동합니다 *");
				return Define.MEMBER_BROWSER;
			default : System.err.println(" * 잘못 입력하셨습니다 다시 입력해주세요 * ");
			}
		}
		}
	
	
}
