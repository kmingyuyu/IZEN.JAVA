package ch05.sec06;

public class ArrayCreactByValueListExample {

	public static void main(String[] args) {
		
//		1.배열타입, 초기 데이터랑 같이 선언
		String[] season = {"Spirng","Summer","Fall","Winter"};
		
		System.out.println(season[0]);
		System.out.println(season[1]);
		System.out.println(season[2]);
		System.out.println(season[3]);
		
//		season[1] = "여름";
//		System.out.println(season[1]);
		
		for(int i=0; i<season.length; i++) {
			System.out.println(season[i]);
		}
		
		
		System.out.println("------------------------------------------");
		
        int[] score = {83,90,87};
        int sum = 0; //누적합산 결과를 넣을 변수는 무조건 초기값이 있어야 한다.
        
//        총합과 평균 구하기
        
        for(int i=0; i<score.length; i++) {
        	System.out.println(score[i]);
        	sum += score[i]; // sum= sum+ score[i];
        }
        System.out.println("총합:" + sum);
        
        double avg = (double)sum / 3 ;
        System.out.println("평균:" + avg);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		2.배열의 크기만 선언
		String[] season2 = new String[4];
		season[0] = "Spirng";
		season[0] = "Summer";
		season[0] = "Fall";
		season[0] = "Winter";
		
//		3.배열타입,초기데이터랑 같이 선언
		String[] season3 = new String[] {"Spirng","Summer","Fall","Winter"};
		
//		주의사항
//	    String[] season4; 
//	    season4 = {"Spirng","Summer","Fall","Winter"}; // 불가
//	    season4 = new String[4]; // 가능
//	    season4 = new String[] {"Spirng","Summer","Fall","Winter"}; //가능
		

	}

}
