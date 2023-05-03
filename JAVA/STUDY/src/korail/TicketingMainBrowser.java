package korail;

import java.util.Scanner;

public class TicketingMainBrowser {
	
	
	private static Scanner scanner = new Scanner(System.in);
	
 public static void main(String[] args) {
	 
//	 코레일 내일로 발권
	 System.out.println("-----------------------KORAIL-----------------------");
	 System.out.println("------자유여행LET'S KORAIL TRAIN. 국내여행패스. 내일로-----");
	 System.out.println("----------------------------------------------------"); 
	 System.out.println(" 1.내일로 패스 등록 | 2.패스권 조회 | 3. 발권하기 | 4. 발권 조회");
	 System.out.println("----------------------------------------------------"); 
	 System.out.println("선택>");
	 int selectNO = scanner.nextInt();
	 
	 switch (selectNO) {
	case 1:
		railopass();
		break;
	case 2:
		break;
	case 3:
		ticketing();
		break;
	case 4:
		System.out.println("이용해 주셔서 감사합니다.");
		break;
	case 5:
		System.out.println("이용해 주셔서 감사합니다.");
		break;
		
	
	}
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
 
 public static void railopass() {
	 System.out.println("-------------------");
	 System.out.println("<내일로 패스 등록>");
	 System.out.println("세부 정보를 입력해주세요");
	 System.out.println("-------------------");
	 System.out.println("1. 7일권 | 2. 3일권 ");
	 int passDay = scanner.nextInt();
	 System.out.println("인원수 :");
	 int headCount = scanner.nextInt();
	 System.out.println("명");
	 
	 System.out.println("장애인원여부");
	 System.out.println(" o | x ");
	 char obstacle = scanner.next().charAt(0);
	 
	 System.out.println("출발역을 입력해주세요");
	 System.out.println("1.서울 | 2.용산 | 3.광명");
	 int startStation = scanner.nextInt();
	 
	 System.out.println("출발날짜를 입력해주세요");
	 System.out.println("2023년/ 월 :");
	 int startMonth = scanner.nextInt();
	 System.out.println("2023년/ "+ startMonth +  "월 / 일 :");
	 int startDay = scanner.nextInt();
	 RailoRegistration registration = new RailoRegistration
			 (passDay , headCount , obstacle , startStation , startMonth , startDay);
	 System.out.println("------------------------------");
	 System.out.println("입력하신 정보가 맞는지 확인해주세요");
	 registration.totalRailo();
	 System.out.println("------------------------------");
	 System.out.println("결제 하시겠습니까?");
	 System.out.println("결제 금액 : " + registration.price() );
	 System.out.println("------------------------------");
	 System.out.println("결제가 완료 되었습니다. 패스권 생성 완료!");
	 
 }
 
 
 
 
 
 
 
 
 
 
 

public static void ticketing( ) {
	
	RailoRegistration railoRegistration = new RailoRegistration();
	 
	 System.out.println("-------------------");
	 System.out.println("<발권하기>");
	 System.out.println("세부 정보를 입력해주세요");
	 System.out.println("-------------------");
	 
	 
	 System.out.println("패스권 번호를 입력해주세요");
	 int passId = scanner.nextInt();
	 
	 System.out.println("열차를 선택하세요");
	 System.out.println("1.ktx | 2.itx | 3.새마을호");
	 int trainType = scanner.nextInt();
	 
	 System.out.println("좌석을 선택해주세요");
	 seat(railoRegistration.obstacle);
	 int seat = scanner.nextInt();
	 
	 System.out.println("도착역을 입력해주세요.");
	 endstation(trainType);
	 int endStation = scanner.nextInt();
	 
	 System.out.println("출발날짜를 입력해주세요");
	 System.out.println("2023년/ 월 :");
	 int startMonth = scanner.nextInt();
	 System.out.println("2023년/ "+ startMonth +  "월 / 일 :");
	 int startDay = scanner.nextInt();
	 
	 Ticketinginfo ticketinginfo = new Ticketinginfo
			 (passId, trainType , seat, endStation , startMonth, startDay );
	 
	 System.out.println("------------------------------");
	 System.out.println("입력하신 정보가 맞는지 확인해주세요");
	 System.out.println("------------------------------");
	 Ticketinginfo.totalinfo();
	 System.out.println("------------------------------");
	 
 }
 
   public static void seat(char obstacle) {
	   	  if(obstacle == 'o') {
	   		System.out.println("1.일반석 | 2.특별석 | 3.장애특별석");
	   	  }else if(obstacle == 'x') {
	   		System.out.println("1.일반석 | 2.특별석");
	   	  } 
   }
 
   
   public static void endstation (int trainType) {
	   if(trainType == 1) {System.out.println("1.부산");}
	   if(trainType == 2) {System.out.println("1.부산 | 2.강릉 ");}
	   if(trainType == 3) {System.out.println("1.부산 | 2.강릉 | 3.춘천 ");}
   }
   
   
 
 
}
