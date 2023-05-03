package ch08.sec08;

public class MultiInterfaceImplExample {

	public static void main(String[] args) {
              
		
		RemoteControl rc =  new SmartTelevision();
		
//		RemoteControl에 선언된 메소드만 사용가능
		rc.turnon();
		rc.turnoff();
		
		
		
		Searchable searchable = new SmartTelevision();
		
		searchable.search("http://www.naver.com");
	}

}
