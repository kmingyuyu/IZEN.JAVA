package seat;

import java.util.Scanner;
import movie_info.Person_Ticket_Info;

public class Default_Seat {
	Scanner scanner = new Scanner(System.in);
	private String strColumn;
	private int rowNum;
	private char inputColumn;
	
	
	public void screen() {
		int [][] seats = new int[8][8];
		System.out.println("\n────────────────────────────────────SCREEN────────────────────────────────────\n");
		for (int i = 0; i < seats.length; i++) {
			System.out.print("\t[ "+(i+1)+" ]");
		}
		System.out.println(" [행] ");
		
		for (int i = 0; i < seats.length; i++) {
			System.out.println();
			for (int j = 0; j < seats[i].length; j++) {
				
				if(seats[i][j] == 0) {
					System.out.print("\t[ □ ]");
				}else {
					System.out.print("\t[ ■ ] ");
				}
			}
			System.out.println(" [ "+ (char)(i+65) +" ] 열");
		}
		System.out.println("\n───────────────────────────────────────────────────────────────────────────────");
		
		
	}
	public void seat1 (Person_Ticket_Info ticketing) {
		System.out.println(ticketing.getCenema() + " 관 선택하셨습니다 ");
		System.out.println(" * 예약하실 좌석의 열을 입력해주세요 (대문자로 입력해주세요) *");
		while(true) {
			strColumn = scanner.next();	
			inputColumn = strColumn.trim().charAt(0);
			if((inputColumn < 65 || inputColumn > 73)) {
				System.err.println(" * 잘못 입력하셨습니다 다시 입력해주세요 *");
			}
			else {
				ticketing.setSeat1(inputColumn);
				break;
			}
			
		}
	}
	
	
	
		
	public void seat2(Person_Ticket_Info ticketing) {
		System.out.println(" * 예약하실 좌석의 행 번호를 입력해주세요 * ");
		while(true) {
	        rowNum = scanner.nextInt();
	        if(rowNum < 1 || rowNum > 9) {
	            System.err.println(" * 잘못 입력하셨습니다 다시 입력해주세요 *");
	        }
	        else {
	        	System.out.println(" 선택하신 좌석은 : " +inputColumn+ " 열 / " + rowNum + " 번입니다");
	        	ticketing.setSeat2(rowNum);
	        	break;
	        }
		}
		
	}
		
		
}