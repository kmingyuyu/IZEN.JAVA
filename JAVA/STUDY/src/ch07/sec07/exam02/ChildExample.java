package ch07.sec07.exam02;

public class ChildExample {
   public static void main(String[] args) {
	

	   
//	   자동 타입 변환
//	   Child Child = new Child();
//	   Parent Parent = Child; 
	   
//	   자동 타입 변환2
	   Parent Parent = new Child();
	   
//	   2.자동타입 변환시 자식클래스에 오버라이딩 된 메소드가 있으면 
//	   오버라이딩 된 메소드가 호출된다.
	   Parent.method1();
	   Parent.method2();
	   Parent.parentField1 = 10;
	   
	   
//	   1. 자동타입 변환시
//	   부모클래스에 선언된 필드와 메소드만 접근 가능.
//	   Parent.method3();
//	   Parent.childField1 = 10;

	   System.out.println("----------------------");
//	   강제 타입변환
	   Child child = (Child)Parent;
	   child.method3();
	   child.childField1 = 10;
	   child.method2();
	   child.parentField1 = 10;
	   
	   
}
}
