package ch07.sec10.exam01;

public class PhoneExample {

	public static void main(String[] args) {
//		추상 클래스는 객체로 생성할수 없다.
//		Phone Phone = new Phone();
		
		SmartPhone smartPhone = new SmartPhone("홍길동") ; 
		smartPhone.turnon();
		smartPhone.turnoff();
		
		
	}

}
