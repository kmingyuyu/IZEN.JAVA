package korail;


import java.util.Scanner;


public class Ticketing {

	private static Scanner scanner = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		
		 System.out.println("----------------------------------------------------");
		 System.out.println("-----------------------KTX 서울-----------------------");
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
		 
		 System.out.println("장애인원 있으시면 명수 입력해주세요");
		 int obstacle = scanner.nextInt();
		 
		 System.out.println("좌석을 선택해주세요");
		 seat(obstacle);
		 int seat = scanner.nextInt();
		 
		 System.out.println("도착역을 입력해주세요.");
		 System.out.println("1.부산 | 2.여수 | 3.강릉 ");
		 int endStation = scanner.nextInt();
		 
		 System.out.println("출발날짜를 입력해주세요");
		 
		 System.out.println("2023년/ 월 :");
		 int startMonth = scanner.nextInt();
		 
		 System.out.println("2023년/ "+ startMonth +  "월 / 일 :");
		 int startDay = scanner.nextInt();
		 
		 System.out.println("2023년/ "+ startMonth +  "월 / " + startDay + " 일 / 시 :");
		 int startTime = scanner.nextInt();
		 
		 TicketingInfo Info = new TicketingInfo //입력받은값 보내기
				 (adult , obstacle ,seat  , endStation , startMonth, startDay , startTime);
		 
		 System.out.println("------------------------------");
		 System.out.println("입력하신 정보가 맞는지 확인해주세요");
		 System.out.println("------------------------------");
		 Info.totalinfo(); // 입력보낸값 불러오기
		 System.out.println("------------------------------");
		 System.out.println("------------------------------");
		 System.out.println("-------결제 하시겠습니까?---------");
		 price pr = new price();
		 
		 System.out.println("결제 금액 : " + pr.getPrice() + " 원" );
		 System.out.println("----   예매가 완료되었습니다!   ----");
		 System.out.println("------------------------------");
	}
	
	  public static void seat(int obstacle) {
	   	  if(obstacle <= 1) {System.out.println("1.일반석 | 2.특별석 | 3.장애특별석");} 
	   	  else if(obstacle == 0) {System.out.println("1.일반석 | 2.특별석");
	   	  } 
  }
	
	
	
	

	
	
}

