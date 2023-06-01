package admin;

import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

import movie_info.*;
import utils.Define;

public class AdminPersonBrowser {
	Scanner scanner = new Scanner(System.in);
	static CGV cgv = CGV.getTotal();
	
	
	String menu;
	int num = 0;
	Person_Info person = new Person_Info();
	public int join() {
		System.out.println("----------------------회원가입----------------------");
		System.out.println("|1> 이미 회원이십니까? ( 로그인 창으로 이동 )");
		System.out.println("|2> 메인 화면으로 이동");
			System.out.println("아니라면 아무키나 입력해주세요.");
			String j_Check = scanner.next();
			if(j_Check.equals("1")) {return Define.LOGIN ;}
			if(j_Check.equals("2")) {return Define.ADMIN_BROWSER ;}
			System.out.println("--------------환영합니다! 정보를 입력해주세요-------------");
			id();
			pw();
			name();
			rrn();
			phoneNum();
			System.out.println(" 회원가입 하시겠습니까? ( Y / N ");
			while(true) {
				menu = scanner.next();
				switch (menu) {
				case "y" , "Y":
					cgv.put_personList(person.getMember_ID(), person);
					cgv.setLogin(true);
					cgv.setTemp_ID(person.getMember_ID());
					System.out.println(person.getMember_Name() + " 님 환영합니다!" +" 회원가입이 완료되었습니다");
					return Define.MEMBER_BROWSER;
				case "n" , "N":
					System.out.println(" *메인화면 으로 이동합니다 *");
					return Define.ADMIN_BROWSER;
				default : System.err.println(" * 잘못 입력하셨습니다 다시 입력해주세요 *");			
					}
			}
			}
			
		
//		아이디
		public void id() {
			System.out.println("사용하실 아이디를 입력 해주세요. (영소문자 6자리 이상 12이내)");
			while(true) {
				menu = scanner.next();
				Map<String, Person_Info> personList = cgv.getPersonList();
				if(personList.containsKey(menu)) {
					   System.err.println(" * 이미 가입된 아이디 입니다 다시 입력해주세요 *");
					}
				else if(!Pattern.matches("^[a-z]{6,12}$" , menu)) {
					System.err.println("양식에 맞지 않습니다. 다시 입력해주세요");
					System.err.println("* 영소문자 6자리 이상 12이내 *");
				} 
				else {
					System.out.println("사용하실수 있는 ID 입니다.");
					person.setMember_ID(menu);
					break;
				}	
			}
		}
			
//		비밀번호
		public void pw() {
			System.out.println("사용하실 비밀번호를 입력 해주세요. (영소문자 숫자포함 8자리 이상 14자리 이내)");
			while(true) {
				menu = scanner.next();
				if(!Pattern.matches("^[a-z0-9]{8,14}$" , menu)) {
					System.err.println("양식에 맞지 않습니다. 다시 입력해주세요");
					System.err.println("* 영소문자 숫자포함 8자리 이상 14자리 이내 *");
				} else {
					System.out.println("사용하실수 있는 비밀번호 입니다.");
					person.setMember_Password(menu);
					break;
				}
			}
			System.out.println("비밀번호를 한번더 입력해주세요.");
			while(true) {
				menu = scanner.next();
				if(!person.getMember_Password().equals(menu)) {
					System.err.println("비밀번호가 서로 맞지 않습니다. 다시 입력해주세요");
				}else {
					System.out.println("비밀번호 확인 되었습니다.");
				break;
				}
				
			}
		}
			
//		이름
		public void name() {
			System.out.println("이름을 입력해주세요. ( 한글 )");
			while(true) {
				menu = scanner.next();
				if(!Pattern.matches("^[가-힣]*$" , menu)) {
					System.err.println("양식에 맞지 않습니다. 다시 입력해주세요");
					System.err.println("* 한글이름 입력해주세요. *");
				}else {
					person.setMember_ID(menu);
					break;
				}
			}
		}
			
//			생년월일			
			public void rrn() {
				System.out.println("생년월일을 입력해주세요. ( 6자리 )");
				while(true) {
					menu = scanner.next();
					if(!Pattern.matches("^[0-9]{6}$" , menu)) {
						System.err.println("양식에 맞지 않습니다. 다시 입력해주세요");
						System.err.println("* 주민번호 앞 6자리 입력해주세요. *");
					}else {
						person.setMember_RRN(menu);
						break;
					}
				}
			}
			
//			핸드폰번호
			public void phoneNum() {
				System.out.println("핸드폰 번호를 입력해주세요. ( '-' 제외 )");
				while(true) {
					menu = scanner.next();
					 if(!Pattern.matches("^[\\d]{11}+$" , menu)) {
							  System.err.println("양식에 맞지 않습니다. 다시 입력해주세요");
							  System.err.println("* 핸드폰 번호를 입력해주세요. '-' 제외 *");
					}else {
						person.setMember_PhoneNumber(menu);
						break;
					}
				}
				
				int r_Num = ((int) (Math.random()*9999)+1111);
				String num = Integer.toString(r_Num);
				System.out.println(" 인증번호가 전송되었습니다. 인증번호를 입력해주세요");
				System.out.println("인증번호 : " + num);
			
				while(true) {
					menu = scanner.next();
					if(num.equals(menu)) {
						System.out.println("인증완료 되었습니다 감사합니다");
						break;
					}else {
						System.err.println(" * 인증번호가 맞지 않습니다. 다시 입력해주세요 *");
					}			
				}
			}

		
	
	public int login() {
		System.out.println("----------------------로그인----------------------");
		System.out.println("|1> 회원이 아니십니까? ( 회원가입 창으로 이동 )");
		System.out.println("|2> 메인 화면으로 이동");
		System.out.println(" 아니라면 아무키나 입력해주세요. ");
		menu = scanner.next();
		switch (menu) {
		case "1":
			return Define.JOIN;
		case "2": 
			return Define.ADMIN_BROWSER;
		}
		
		while(true) {
			System.out.println(" 아이디를 입력해주세요");
			String id_Check = scanner.next();
			System.out.println(" 비밀번호를 입력해주세요");
			String password_Check = scanner.next();
			System.out.println("로그인 하시곗습니까? ( Y / N )");
			menu = scanner.next();
			switch (menu) {
			case "Y" , "y":
				Map<String, Person_Info> personList = cgv.getPersonList();
				Person_Info personInfo = personList.get(id_Check);
				if(!personList.containsKey(id_Check)) {
					System.err.println(" * 없는 아이디 입니다 다시 입력해주세요 *");
					break;
				}
				else if(!personInfo.getMember_Password().equals(password_Check)) {
					System.err.println(" * 비밀번호가 틀립니다 다시 입력해주세요 *");
					break;
				}
				cgv.setLogin(true);
				cgv.setTemp_ID(id_Check);
				System.out.println(" * 로그인 되었습니다. * ");
				return Define.MEMBER_BROWSER;
			case "N" , "n": 
				System.out.println("* 메인화면 으로 이동합니다 *");
				return Define.ADMIN_BROWSER;
			default : System.err.println(" * 잘못 입력하셨습니다 다시 입력해주세요 * ");
			}
		}
	}
		
	
	
}
