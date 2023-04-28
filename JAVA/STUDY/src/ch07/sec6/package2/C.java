package ch07.sec6.package2;

import ch07.sec6.package1.A;

public class C {
	public void method() {
//    	protected = 클래스가 서로 다른 패키지에 있으면 접근 불가.
    	A a= new A();
    	a.field = "Value";
    	a.method();
    }	
}
