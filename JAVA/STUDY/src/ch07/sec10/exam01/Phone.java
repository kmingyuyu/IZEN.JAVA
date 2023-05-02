package ch07.sec10.exam01;


// abstract 추상클래스?
// 1.상속을 하기위해 만든 클래스(추상클래스가 부모클래스가 된다)
// 2.완전하지 않은 클래스 -> 추상클래스를 가지므로

public abstract class Phone {
	
//  필드
	String owner;
	
//	생성자
	Phone(String owner){
		this.owner=owner;
	}

//	메소드
	void turnon() {
		System.out.println("폰 전원을 켭니다");
	}
	void turnoff() {
		System.out.println("폰 전원을 끕니다");
	}
	
	
	
	
	
	
}
