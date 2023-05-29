package admin;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

import movie_info.*;
import utils.Define;

public class AdminPersonBrowser {
	Scanner scanner = new Scanner(System.in);
	static CGV cgv = CGV.getTotal();
	ArrayList<Person_Info> personList= cgv.getPersonList();
	
	String temp_ID ;
	String temp_PW ;
	
	public int join() {
		while(true) {
			String member_ID , member_Password , member_Name , member_RRN , member_PhoneNumber; // 회원 정보 저장할 객체
			System.out.println("----------------------회원가입----------------------");
			System.out.println("|1> 이미 회원이십니까? ( 로그인 창으로 이동 )");
			System.out.println("|2> 메인 화면으로 이동");
			System.out.println("아니라면 아무키나 입력해주세요.");
			String j_Check = scanner.next();
			if(j_Check.equals("1")) {return Define.LOGIN ;}
			if(j_Check.equals("2")) {return Define.ADMIN_BROWSER ;}
			System.out.println("--------------환영합니다! 정보를 입력해주세요-------------");
			
//			아이디
			System.out.println("사용하실 아이디를 입력 해주세요. (영소문자 6자리 이상 12이내)");
			member_ID = scanner.next();
			while(true) {
				if(personList.contains(member_ID)) {
					System.err.println("가입된 아이디 입니다. 다시 입력해주세요");
					member_ID = scanner.next();
				}
				else if(!Pattern.matches("^[a-z]{6,12}$" , member_ID)) {
					System.err.println("양식에 맞지 않습니다. 다시 입력해주세요");
					System.err.println("* 영소문자 6자리 이상 12이내 *");
					member_ID = scanner.next();
					} else {
						System.out.println("사용하실수 있는 ID 입니다.");
						break;
					}	
				
			};
//			비밀번호
			System.out.println("사용하실 비밀번호를 입력 해주세요. (영소문자 숫자포함 8자리 이상 14자리 이내)");
			member_Password = scanner.next();
			while(true) {
				if(!Pattern.matches("^[a-z0-9]{8,14}$" , member_Password)) {
					System.err.println("양식에 맞지 않습니다. 다시 입력해주세요");
					System.err.println("* 영소문자 숫자포함 8자리 이상 14자리 이내 *");
					member_Password = scanner.next();
					} else {
						System.out.println("사용하실수 있는 비밀번호 입니다.");
						break;
					}
				
			}
//			비밀번호 확인
					System.out.println("비밀번호를 한번더 입력해주세요.");
			String member_Password_Check = scanner.next();
			while(true) {
				if(!member_Password.equals(member_Password_Check)) {
					System.err.println("비밀번호가 서로 맞지 않습니다. 다시 입력해주세요");
					member_Password_Check = scanner.next();
				}else {
					System.out.println("비밀번호 확인 되었습니다.");
					break;
				}
			}
//			이름
			System.out.println("이름을 입력해주세요. ( 한글 )");
			member_Name = scanner.next();
			while(true) {
				if(!Pattern.matches("^[가-힣]*$" , member_Name)) {
					System.err.println("양식에 맞지 않습니다. 다시 입력해주세요");
					System.err.println("* 한글이름 입력해주세요. *");
					member_Name = scanner.next();
				}else {
					break;
				}
			}
//			주민번호
			System.out.println("주민번호 앞자리를 입력해주세요. ( 6자리 )");
			member_RRN = scanner.next();
			while(true) {
				
				if(!Pattern.matches("^[0-9]{6}$" , member_RRN)) {
					System.err.println("양식에 맞지 않습니다. 다시 입력해주세요");
					System.err.println("* 주민번호 앞 6자리 입력해주세요. *");
					member_RRN = scanner.next();
				}else {
					break;
				}
			}
//			핸드폰 번호
			System.out.println("핸드폰 번호를 입력해주세요. ( '-' 제외 )");
			member_PhoneNumber = scanner.next();
			while(true) {
				boolean check = personList.contains(member_PhoneNumber);
				if(check == true) {
					System.err.println("가입된 번호 입니다. 다시 입력해주세요");
					member_PhoneNumber = scanner.next();
				}else if(!Pattern.matches("^[\\d]{11}+$" , member_PhoneNumber)) {
						  System.err.println("양식에 맞지 않습니다. 다시 입력해주세요");
						  System.err.println("* 핸드폰 번호를 입력해주세요. '-' 제외 *");
						  member_PhoneNumber = scanner.next();
				}else {
					break;
				}
			}
//			인증번호
			int r_Num = ((int) (Math.random()*9999)+1111);
			
			System.out.println("인증 번호가 전송 되었습니다. 인증번호를 입력해주세요");
			System.out.println("인증번호 : " + r_Num);
			int r_Num_Input = scanner.nextInt();
			while(true) {
				if(r_Num != r_Num_Input) {
					System.err.println("인증번호가 맞지 않습니다. 다시 입력해주세요");
					r_Num_Input = scanner.nextInt();
				}else {
					System.out.println("인증완료 되었습니다 감사합니다");
					break;
				}			
			}
			System.out.println("양식 작성이 완료 되었습니다!");
			System.out.println("회원가입 하시곗습니까? ( y/n )");
			String join_Check = scanner.next();
			while(true) {
				if(!(join_Check.equals("n")||join_Check.equals("N")||join_Check.equals("y")||join_Check.equals("Y"))){
					System.err.println("* y/n 으로 입력해주세요 *");
					join_Check = scanner.next();
				}else if(join_Check.equals("n")||join_Check.equals("N")) {
					System.err.println("초기화면으로 이동합니다");
					return Define.ADMIN_BROWSER;
				}else {
					break;
				}
			}
		
//			회원가입 동의입력 받으면 회원정보 값을 넣어줌
			Person_Info person_Info = new Person_Info
						(member_ID , member_Password , member_Name , member_RRN , member_PhoneNumber);
//			싱글톤 CGV에 회원정보 넣어줌
			cgv.addPersonList(person_Info);
					
			System.out.println(person_Info.getMember_Name() + " 님 환영합니다!" +" 회원가입이 완료되었습니다");
			return Define.MEMBER_BROWSER;
			}
		}
	
	public int login() {
		String j_Check ;
		System.out.println("----------------------로그인----------------------");
		System.out.println("|1> 회원이 아니십니까? ( 회원가입 창으로 이동 )");
		System.out.println("|2> 메인 화면으로 이동");
		System.out.println("아니라면 아무키나 입력해주세요.");
		j_Check = scanner.next();
		if(j_Check.equals("1")) { return Define.JOIN;} 
		if(j_Check.equals("2")) { return Define.ADMIN_BROWSER;}
		
		System.out.println("아이디를 입력해주세요");
		String id_Check = scanner.next();
		System.out.println("비밀번호를 입력해주세요");
		String password_Check = scanner.next();
		System.out.println("로그인 하시곗습니까? ( y/n )");
		j_Check = scanner.next();
		while(true) {
			if(!(j_Check.equals("n")||j_Check.equals("N")||j_Check.equals("y")||j_Check.equals("Y"))){
				System.err.println("* y/n 으로 입력해주세요 *");
				j_Check = scanner.next();
			}else if(j_Check.equals("n")||j_Check.equals("N")) {
				System.err.println("메인화면으로 이동합니다");
				return Define.ADMIN_BROWSER;				
			}
			else if(!(personList.contains(id_Check) || personList.contains(password_Check))){
				System.err.println("가입된 아이디 입니다 다시 입력해주세요");
				return Define.LOGIN;
			}
		else {
				break;
			}
		}
		cgv.setLogin(true);
		cgv.setTemp_ID(id_Check);
		System.out.println("로그인 되었습니다");
		return Define.MEMBER_BROWSER;
		}
	
	
}
