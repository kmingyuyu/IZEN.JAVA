package ch08.sec07;

public class ServiceExample {

	public static void main(String[] args) {
          
		Service service = new ServiceImpl();
		service.defaultMethod1();
		service.defaultMethod2();
		
		System.out.println("-------------------");
		
		Service.staticMethod1();
		Service.staticMethod2();
	}

}
