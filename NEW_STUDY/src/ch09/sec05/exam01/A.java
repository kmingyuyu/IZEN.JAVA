package ch09.sec05.exam01;

public class A {
//	인스턴스 필드/메소드
	int field1;
	
	void method1() {}
 	
//	인스턴스 필드/메소드
	static int field2;
	
	static void method2() {}
	
	
	
	class B {
		void method() {
			A.this.field1 = 10;
			A.this.method1();
		}
	}
	
	
	static class C  {
		void method() {
//			 A클래스의 인스턴스 필드/메소드는 사용 불가능하다
//			 field1= 10;
//			
//			 method1();
		 	
			
			
			
			
			field2 = 10;
			method2();
		}
	}
}
