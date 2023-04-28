package ch06.sec10.exam02;

public class Television {

//	정적필드는 필드선언과 동시에 초기값을 주는게 '일반적'
	static String company = "MyCompany";
	static String model = "LCD";
	static String info;
	
//  정적블록:연산 등 복잡한 초기화작업이 필요할때 사용
	static {
		info= company + "-" + model;
	}
}
