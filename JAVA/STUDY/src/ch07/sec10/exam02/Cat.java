package ch07.sec10.exam02;

public class Cat extends Animal {
//
//	Cat(String owner) {
//		super(owner);
//	}
//	
	
//	!중요!
//	추상 클래스가 부모클래스일때 추상메소드가 있으면
//	반드시 오버라이드(재정의) 해야함
	
	@Override
	public void sound() {
		System.out.println("야옹");
	}
        
	
}
