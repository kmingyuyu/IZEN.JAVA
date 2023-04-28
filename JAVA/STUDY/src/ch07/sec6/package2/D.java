package ch07.sec6.package2;

import ch07.sec6.package1.A;

// 패키지가 달라도 상속은 가능하다.
public class D extends A {
	
	public D() {
//		부모클래스의 생성자 호출
		super();
	}
//      부모클래스의 필드를 바꾼다
	public void method1() {
		super.field = "Value";
		
//		부모클래스의 메소드 호출
		super.method();
//		=> 이것들이 가능한 이유는 protected 
//		접근제한자는 상속관계일때 접근 가능
	}
	
	public void method2() {
//		protected를 생성자에 사용하면 사용하는것은 안됨
		A a = new A();
		a.field = "Value";
		a.method();
	}
	
}
