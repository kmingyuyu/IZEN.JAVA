package ch08.sec09;

public class ExtendsExample {

	
	public static void main(String[] args) {
	     
		
        
		InterfaceA ia = new InterfaceImpl();
		ia.methodA();
		
		InterfaceB ib = new InterfaceImpl();
		ib.methodB();
		
//		InterfaceC 가  InterfaceA InterfaceB 를 
//		상속하고 있으므로 아래와 같이 사용 가능
		InterfaceC ic = new InterfaceImpl();
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}
}
