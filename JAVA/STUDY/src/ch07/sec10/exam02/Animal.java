package ch07.sec10.exam02;

public abstract class Animal {
//	String owner;
//	
//	
//	
//	Animal(String owner) {
//		this.owner = owner;
//	}
	
//  일반 메소드
	public void breath () {
		System.out.println("숨을 쉽니다.");
	}
	
//	추상 메소드(선언만 하는 메소드) -> 구현은? 자식클래스에서 오버라이드 해야함
	public abstract void sound();
	
}
