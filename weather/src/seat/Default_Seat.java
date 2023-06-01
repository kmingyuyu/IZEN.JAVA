package seat;

import java.util.Scanner;

public class Default_Seat {
	Scanner scanner = new Scanner(System.in);
	String strColumn;
	int rowNum;
	char inputColumn;
	int [][] seats = new int[6][6];
	
	public void screen() {
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
	public void seat1 () {
		System.out.println(" * 예약하실 좌석의 열을 입력해주세요 *");
		while(true) {
			strColumn = scanner.next();	
			if(inputColumn < 65 || inputColumn > 74) {
				System.err.println(" * 잘못 입력하셨습니다 다시 입력해주세요 *");
			}
			else {
				inputColumn = strColumn.trim().charAt(0);
				System.out.println("입력한 열 : " +inputColumn);
				break;
			}
			
			int column = inputColumn - 65;
		}
	}	
		
		public void seat2 () {
		System.out.println(" 예약하실 좌석의 행 번호를 입력해주세요 ");
		while(true) {
	        rowNum = scanner.nextInt();

	        if(rowNum < 1 || rowNum > 10) {
	            System.err.println("선택할 수 없는 행 번호입니다");
	        }

	        System.out.println("선택하신 좌석은 : " +inputColumn+ " 열이고 " + rowNum + " 행입니다");
	        System.out.println("예약 완료 하시겠습니까 ? (Yes / No) : ");
				
		}
	}	
	
		
		
		
		
		
		
		
}