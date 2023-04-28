package ch02.sec13;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("x값 입력:");
		String strx = scanner.nextLine(); // 문자형으로 입력받음
		int x = Integer.parseInt(strx); //문자형 -> 숫자형 으로 변환

		System.out.println("y값 입력:");
		String strY = scanner.nextLine(); // 문자형으로 입력받음
		int y = Integer.parseInt(strY); //문자형 -> 숫자형 으로 변환
		
		int result = x + y;
		System.out.println("x + y:" + result);
		
//		무한반복
		while(true) {
			System.out.println("입력 문자열: ");
			String data = scanner.nextLine();
//			자바에서는 문자열을 비교할때 equals를 이용해 비교한다.
			if(data.equals("q")) { // data =="q"
				break;
			}
			System.out.println("출력 문자열:" + data);
		}
		System.out.println("종료");
	}

}
