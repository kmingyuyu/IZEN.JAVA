package ch07.sec04.exam01;

public class Computer extends Calculator {

//	오버라이드: 리턴타입,메소드이름,매개변수는 다같으며
//	내부 실행코드는 다르다.
	@Override
	public double areaCircle(double r) {
		System.out.println("Computer 객체의 reaCircle() 실행");
  	   return Math.PI*r*r;
	}
	
	
}
