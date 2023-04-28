package ch07.sec6.package1;

public class B {

//	메소드 선언
    public void method() {
//    	protected = 클래스가 서로 같은 패키지에 있으면 접근 가능.
    	A a= new A();
    	a.field = "Value";
    	a.method();
    }	
}
