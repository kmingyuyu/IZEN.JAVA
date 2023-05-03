package ch08.sec10.exam02;

public class CastingExample {

	public static void main(String[] args) {
		
		Vehicle vehicle = new Bus(); //자동타입변환
		vehicle.run();
		
		Bus bus = (Bus)vehicle;
		bus.checkFare(); 
		bus.run();
//       자식클래스 고유의 메소드,필드는 실행이 안된다.
//		->강제타입변환으로 해결
	}

}
