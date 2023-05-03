package KorailSecond;

import java.util.Scanner;

import korail.Ticketinginfo;

public class Ticketing {

	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("----------------------------------------------------");
		 System.out.println("-----------------------KORAIL-----------------------");
		 System.out.println("----------------------------------------------------");
		 System.out.println("              1.발권하기 | 2.발권표 조회 ");
		 System.out.println("----------------------------------------------------"); 
		 System.out.println("선택>");
		 int selectNO = scanner.nextInt();
		 
		 switch (selectNO) {
		case 1:
			ticketing( );
			break;
		case 2:
			break;
		case 3:
			
			break;
		}
		 
		 
		 
		 
		 
	}
	public static void ticketing( ) {
		
		
		
		System.out.println("-------------------");
		 System.out.println("<발권하기>");
		 System.out.println("세부 정보를 입력해주세요");
		 System.out.println("-------------------");
		 
		 System.out.println("인원을 입력해주세요");
		 int adult = scanner.nextInt();
		 
		 System.out.println("장애인원여부");
		 System.out.println(" o | x ");
		 char obstacle = scanner.next().charAt(0);
		 
		 System.out.println("열차를 선택하세요");
		 System.out.println("1.ktx | 2.itx | 3.새마을호");
		 int trainType = scanner.nextInt();
		 
		 System.out.println("좌석을 선택해주세요");
		 seat(obstacle);
		 int seat = scanner.nextInt();
		 
		 System.out.println("출발역을 입력해주세요.");
		 startStation(trainType);
		 int startStation = scanner.nextInt();
		 
		 System.out.println("도착역을 입력해주세요.");
		 endstation(trainType);
		 int endStation = scanner.nextInt();
		 
		 System.out.println("출발날짜를 입력해주세요");
		 System.out.println("2023년/ 월 :");
		 int startMonth = scanner.nextInt();
		 System.out.println("2023년/ "+ startMonth +  "월 / 일 :");
		 int startDay = scanner.nextInt();
		 
		 TicketingInfo Info = new TicketingInfo //입력받은값 보내기
				 (adult , obstacle , trainType ,seat , startStation , endStation , startMonth, startDay);
		 
		 System.out.println("------------------------------");
		 System.out.println("입력하신 정보가 맞는지 확인해주세요");
		 System.out.println("------------------------------");
		 TicketingInfo.totalinfo(); // 입력보낸값 불러오기
		 System.out.println("------------------------------");
		 System.out.println("------------------------------");
		 System.out.println("--------예매하시겠습니까?----------");
		 System.out.println("----   예매가 완료되었습니다!   ----");
		 System.out.println("------------------------------");
	}
	
	
	
	
	
	 public static void seat(char obstacle) {
	   	  if(obstacle == 'o') {
	   		System.out.println("1.일반석 | 2.특별석 | 3.장애특별석");
	   	  }else if(obstacle == 'x') {
	   		System.out.println("1.일반석 | 2.특별석");
	   	  } 
  }
	 public static void startStation (int trainType) {
		   if(trainType == 1) {System.out.println("1.서울");}
		   if(trainType == 2) {System.out.println("1.서울 | 2.용산 ");}
		   if(trainType == 3) {System.out.println("1.서울 | 2.용산 | 3.광명 ");}
	   }
	 public static void endstation (int trainType) {
		 if(trainType == 1) {System.out.println("1.부산");}
		 if(trainType == 2) {System.out.println("1.부산 | 2.강릉 ");}
		 if(trainType == 3) {System.out.println("1.부산 | 2.강릉 | 3.춘천 ");}
	 }

	
	
}
