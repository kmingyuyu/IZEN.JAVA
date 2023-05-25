package main;


import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.regex.Pattern;

import movie_info.*;

public class Browser {

	Scanner scanner = new Scanner(System.in);
	static CGV cgv = CGV.getTotal();
	
	public static void main(String[] args) {

		Browser test = new Browser();
		test.inputInfo();
		test.mainView();
		
		
	}
	
	
	
	
	
	
	
	
	public void inputInfo() {
//  각 영화별로 영화 기본정보 / 상세정보 값 넣어줌
//	DefaultInfo 클래스에 제목 장르 국가 값 넣어줌
//	DetailInfo 클래스에 영화세부정보 예매율 상영시간 개봉날짜 연령 값 넣어줌
		
	Movie_Default_Info defaultInfo1 = new Movie_Default_Info("분노의 질주-라이드 오어 다이" , "액션" , "미국");
	Movie_Detail_Info detailInfo1 = new Movie_Detail_Info(12.5 , 141 , LocalDate.of(2023,05,17) , 15);
	
	Movie_Default_Info defaultInfo2 = new Movie_Default_Info("남은 인생 10년" , "로맨스,멜로" , "일본");
	Movie_Detail_Info detailInfo2 = new Movie_Detail_Info(5.6 , 124 , LocalDate.of(2023,05,24) , 12);
	
	Movie_Default_Info defaultInfo3 = new Movie_Default_Info("범죄도시3" , "범죄,액션" , "한국");
	Movie_Detail_Info detailInfo3 = new Movie_Detail_Info(40.5 , 105 , LocalDate.of(2023,05,31) , 15);
	
	 inputCalender(detailInfo3);
	
	
	
	}
	
	public void inputCalender(Movie_Detail_Info detailInfo) {
		
		LocalDate n = LocalDate.now();
		LocalTime t = LocalTime.of(00, 00);
		LocalDateTime nt =  LocalDateTime.of(n,t);
		String pattern = "yyyy-MM-dd HH:mm:ss";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
		
		if(detailInfo.getOpeningdate().isBefore(n)){
				LocalDateTime[] movieSchedule = {
//						당일날 예매시간표
						nt.plusHours(10).plusMinutes(30),
						nt.plusHours(18).plusMinutes(20),
//						당일+1 날 예매 시간표
						nt.plusDays(1).plusHours(9).plusMinutes(0),
						nt.plusDays(1).plusHours(13).plusMinutes(0),
						nt.plusDays(1).plusHours(16).plusMinutes(0),
						nt.plusDays(1).plusHours(19).plusMinutes(30)};		
				
				detailInfo.setMovieSchedule(movieSchedule);
		}
	
	}
	
	
	
	int mainView() {
		int menu = 0;
		while(true) {
			switch (menu) {
			case 0:
				menu = adminBrowser();
				break;
			case 1:
				menu = memberBrowser();
				break;
			case 2:
				menu = join();
				break;
			case 3:
				menu = login();
				break;
			case 4:
				menu = adminBrowser();
				break;
			case 5:
				menu = -1;
				break;
				}
			}
		}
			
	
	public int adminBrowser () {
		while (true) {
			System.out.println("--------------------------------------------------");
			System.out.println("------------안녕하세요 cgv 인천점 입니다!---------------");
			System.out.println("--------------------------------------------------");
			System.out.println("-----------------서비스를 선택해주세요------------------");
			System.out.println("---------------|1> 회원가입|2> 로그인|----------------");
			System.out.println("-----------|3> 상영중인 영화|4> 상영예정 영화|-----------");
			System.out.println("-------------------|5> 나가기|----------------------");
			
			String menu = scanner.next();
			
			switch (menu) {
			case "1": {
				return 2;
			}
			case "2": {
				return 3;
			}
			case "3": {
			}
			case "4": {
			}
			case "5": {
				System.out.println("이용해 주셔서 감사합니다");
				return 5;
			}
			default : {
				System.out.println("잘못 입력하셨습니다");
			}
			
		}
		}
	}
	
	public int memberBrowser () {
		while (true) {
			System.out.println("--------------------------------------------------");
			System.out.println("------------안녕하세요 cgv 인천점 입니다!---------------");
			System.out.println("--------------------------------------------------");
			System.out.println("-----------------서비스를 선택해주세요------------------");
			System.out.println("--------------|1> 회원정보|2> 예매내역|----------------");
			System.out.println("-----------|3> 상영중인 영화|4> 영화 예매하기|-----------");
			System.out.println("-------------------|5> 나가기|----------------------");
			
			String menu = scanner.next();
			
			switch (menu) {
			case "1": {
				return 1;
			}
			case "2": {
			}
			case "3": {
			}
			case "4": {
			}
			case "5": {
				System.out.println("이용해 주셔서 감사합니다");
				return 5;
			}
			default : {
				System.out.println("잘못 입력하셨습니다");
			}
			
		}
		}
	}
	
	public int join() {
		while(true) {
			
			
			System.out.println("|1> 이미 회원이십니까? ( 로그인 창으로 이동 )");
			System.out.println("|2> 메인 화면으로 이동");
			System.out.println("아니라면 아무키나 입력해주세요.");
			String j_Check = scanner.next();
			if(j_Check.equals("1")) {
				return 3;
			}else if(j_Check.equals("2")) {
				return 0;
			}
			System.out.println("----------------------회원가입----------------------");
			System.out.println("--------------환영합니다! 정보를 입력해주세요-------------");
			System.out.println("사용하실 아이디를 입력 해주세요. (영소문자 6자리 이상 12이내)");
			String member_ID = scanner.next();
			while(true) {
				if(!Pattern.matches("^[a-z]{6,12}$" , member_ID)) {
					System.out.println("양식에 맞지 않습니다. 다시 입력해주세요");
					System.out.println("* 영소문자 6자리 이상 12이내 *");
					member_ID = scanner.next();
				}else {
					System.out.println("사용하실수 있는 ID 입니다.");
					break;
				}
			};
			System.out.println("사용하실 비밀번호를 입력 해주세요. (영소문자 숫자포함 8자리 이상 14자리 이내)");
			String member_Password = scanner.next();
			while(true) {
				if(!Pattern.matches("^[a-z0-9]{8,14}$" , member_Password)) {
					System.out.println("양식에 맞지 않습니다. 다시 입력해주세요");
					System.out.println("* 영소문자 숫자포함 8자리 이상 14자리 이내 *");
					member_Password = scanner.next();
				}else {
					System.out.println("사용하실수 있는 비밀번호 입니다.");
					break;
				}
			}
					System.out.println("비밀번호를 한번더 입력해주세요.");
			String member_Password_Check = scanner.next();
			while(true) {
				if(!member_Password.equals(member_Password_Check)) {
					System.out.println("비밀번호가 서로 맞지 않습니다. 다시 입력해주세요");
					member_Password_Check = scanner.next();
				}else {
					System.out.println("비밀번호 확인 되었습니다.");
					break;
				}
			}
			System.out.println("이름을 입력해주세요. ( 한글 )");
			String member_Name = scanner.next();
			while(true) {
				if(!Pattern.matches("^[가-힣]*$" , member_Name)) {
					System.out.println("양식에 맞지 않습니다. 다시 입력해주세요");
					System.out.println("* 한글이름 입력해주세요. *");
					member_Name = scanner.next();
				}else {
					break;
				}
			}
			System.out.println("주민번호 앞자리를 입력해주세요. ( 6자리 )");
			String member_RRN = scanner.next();
			while(true) {
				if(!Pattern.matches("^[0-9]{6}$" , member_RRN)) {
					System.out.println("양식에 맞지 않습니다. 다시 입력해주세요");
					System.out.println("* 주민번호 앞 6자리 입력해주세요. *");
					member_RRN = scanner.next();
				}else {
					break;
				}
			}
			System.out.println("핸드폰 번호를 입력해주세요. ( '-' 제외 )");
			String member_PhoneNumber = scanner.next();
			while(true) {
				if(!Pattern.matches("^[\\d]{11}+$" , member_PhoneNumber)) {
					System.out.println("양식에 맞지 않습니다. 다시 입력해주세요");
					System.out.println("* 핸드폰 번호를 입력해주세요. '-' 제외 *");
					member_PhoneNumber = scanner.next();
				}else {
					break;
				}			
			}
			
			int r_Num = ((int) (Math.random()*9999)+1111);
			
			System.out.println("인증 번호가 전송 되었습니다. 인증번호를 입력해주세요");
			System.out.println("인증번호 : " + r_Num);
			int r_Num_Input = scanner.nextInt();
			while(true) {
				if(r_Num != r_Num_Input) {
					System.out.println("인증번호가 맞지 않습니다. 다시 입력해주세요");
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
				if(!(join_Check.equals("n")||join_Check.equals("N")||join_Check.equals("y")||join_Check.equals("Y")))	{
					System.out.println("* y/n 으로 입력해주세요 *");
					join_Check = scanner.next();
				}else if(join_Check.equals("n")||join_Check.equals("N")) {
					System.out.println("초기화면으로 이동합니다");
					return 0;
				}
				else if(join_Check.equals("y")||join_Check.equals("Y")) {
//					회원가입 동의입력 받으면 person_Info 인스턴스 생성 값을 넣어줌
					Person_Info person_Info = new Person_Info
							(member_ID , member_Password , member_Name , member_RRN , member_PhoneNumber);
//					싱글톤 CGV에 회원정보 넣어줌
					cgv.addPersonList(person_Info);
					
					System.out.println(member_Name + " 님 환영합니다!" +" 회원가입이 완료되었습니다");
					return 1;
				}		
			}
	
	
}
}
	public int login() {
		System.out.println("|1> 회원이 아니십니까? ( 회원가입 창으로 이동 )");
		System.out.println("|2> 메인 화면으로 이동");
		System.out.println("아니라면 아무키나 입력해주세요.");
		String j_Check = scanner.next();
		if(j_Check.equals("1")) {
			return 2;
		}else if(j_Check.equals("2")) {
			return 0;
		}
		System.out.println("----------------------로그인----------------------");
		System.out.println("아이디를 입력해주세요");
		String id_Check = scanner.next();
		System.out.println("비밀번호를 입력해주세요");
		String password_Check = scanner.next();
		System.out.println("로그인 하시곗습니까? ( y/n )");
		ArrayList<Person_Info> personList= cgv.getPersonList();
		for(Person_Info person : personList) {
			if(person.getMember_ID() != id_Check) {
				System.out.println("없는 아이디 입니다 다시 입력해주세요");
				for(int i=0; i<10; i++) {
					id_Check = scanner.next();
					if(i == 5) {
						System.out.println("5회이상 틀렸습니다");						
					}else if (i == 10) {
						System.out.println("10회이상 틀렸습니다 메인 화면으로 이동합니다");
						return 0;
					}
					
				}
				
			}
			
		}
		return 0;
	}
	}