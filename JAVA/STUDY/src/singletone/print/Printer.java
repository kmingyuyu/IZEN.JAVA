package singletone.print;

public class Printer {
//	필드
    private static Printer printer= null;
	
//	생성자
	private Printer() {}
	  
	public static Printer getPrinter() {
		if(printer == null) {
			printer = new Printer(); 
	// printer필드를 맨 처음 사용할 땐 새로운 Printer 인스턴스 생성
		}
		return printer;
	}	
	
	public void print(String str) {
		System.out.println(str);
	}
	
	
	
	
	
	
}
