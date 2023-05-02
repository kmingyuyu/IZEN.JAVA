package korail;

import java.util.Scanner;

public class TicketingMainBrowser {
	
	
	private static Scanner scanner = new Scanner(System.in);
	
 public static void main(String[] args) {
	
	 System.out.println("---------------KORAIL-----------------");
	 System.out.println("1.발권하기 | 2. 발권표 조회 | 3. 나가기");
	 System.out.println("--------------------------------------");
	 System.out.println("선택>");
	 int selectNO = scanner.nextInt();
	 
	 switch (selectNO) {
	case 1:
		ticketing();
		break;
	case 2:
		break;
	case 3:
		System.out.println("이용해 주셔서 감사합니다.");
		
		break;
	
	
	}
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
 
 
 public static void ticketing( ) {
	 
	 System.out.println("------------------------------");
	 System.out.println("세부 정보를 입력해주세요");
	 System.out.println("------------------------------");
	 
	 System.out.println("어른 :");
	 int adult = scanner.nextInt();
	 System.out.println("명");
	 
	 System.out.println("어린이 : ");
	 int child = scanner.nextInt();
	 System.out.println("명");
	 
	 System.out.println("장애인원여부");
	 System.out.println("1.있음 | 2.없음");
	 int obstacle = scanner.nextInt();
	 
	 System.out.println("열차를 선택하세요");
	 System.out.println("1.ktx | 2.itx | 3.새마을호");
	 int traintype = scanner.nextInt();
	 
	 System.out.println("좌석을 선택해주세요");
	 seat(obstacle);
	 int seat = scanner.nextInt();
	 
	 System.out.println("출발역을 입력해주세요");
	 startstation(traintype);
	 int startstation = scanner.nextInt();
	 
	 System.out.println("도착역을 입력해주세요.");
	 endstation(startstation);
	 int endstation = scanner.nextInt();
	 
	 System.out.println("출발날짜를 입력해주세요");
	 System.out.println("2023년/ 월 :");
	 int startmonth = scanner.nextInt();
	 System.out.println("2023년/"+ startmonth +  "월 / 일 :");
	 int startday = scanner.nextInt();
	 System.out.println("입력하신 정보가 맞는지 확인해주세요");
	 
	 
	 
 }
 
   public static void seat(int obstacle) {
	   	  if(obstacle == 1) {
	   		System.out.println("1.일반석 | 2.특별석 | 3.장애특별석");
	   	  }else if(obstacle == 2) {
	   		System.out.println("1.일반석 | 2.특별석");
	   	  } 
	   	  
   }
 
   public static void startstation (int traintype) {
	   if(traintype == 1) {System.out.println("1.서울");}
	   if(traintype == 2) {System.out.println("1.용산 | 2.광명");}
	   if(traintype == 3) {System.out.println("1.용산 | 2.광명 | 3.서울");}
   }
   
   public static void endstation (int traintype) {
	   if(traintype == 1) {System.out.println("1.부산");}
	   if(traintype == 2) {System.out.println("1.부산 | 2.강릉 ");}
	   if(traintype == 3) {System.out.println("1.부산 | 2.강릉 | 3.춘천 ");}
   }
   
   public static void retry () {
	   System.out.println("다시 입력해주세요.");
   }
   
 
 
}
