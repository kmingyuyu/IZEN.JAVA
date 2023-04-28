package ch03.sec04;

public class AccurcatExample {

	public static void main(String[] args) {
//		정확한 계산은 정수로 해야함
          int apple = 1; //사과 1조각	
          int totalpiece = apple * 10; //10분의 1
          int number = 7;
          
          int result = totalpiece - number; // 10- 7 : 3
          System.out.println("사과 1개에서 남은양:" + result/10.0);
          
          

	}

}
