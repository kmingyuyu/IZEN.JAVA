package ch07.sec04.exam01;

public class ComputerExample {

	public static void main(String[] arg) {
		int r= 10;
		
		Calculator Calculator = new Calculator();
		System.out.println("원 면적 : " + Calculator.areaCircle(r));
		System.out.println("----------");
		
//		!중요! 메소드 오버라이딩이 되었다면 자식클래스의 메소드가 우선적으로 사용됨
		Computer Computer = new Computer();
		System.out.println("원 면적 : " + Computer.areaCircle(r));
		
	}
}
