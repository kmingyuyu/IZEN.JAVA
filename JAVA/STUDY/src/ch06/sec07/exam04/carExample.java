package ch06.sec07.exam04;

public class carExample {

	public static void main(String[] args) {
//		자동차 4대 생산
		car car1 = new car();
		System.out.println("--------------------------------" );
		System.out.println("car1.company : " + car1.company);
		System.out.println("car1.model : " + car1.model);
		System.out.println("car1.color : " + car1.color);
		System.out.println("car1.maxspeed : " + car1.maxspeed);
		
		car car2 = new car("자가용");
		System.out.println("--------------------------------" );
		System.out.println("car2.company : " + car2.company);
		System.out.println("car2.model : " + car2.model);
		System.out.println("car2.color : " + car2.color);
		System.out.println("car2.maxspeed : " + car2.maxspeed);
		
		car car3 = new car("자가용", "빨강");
		System.out.println("--------------------------------" );
		System.out.println("car3.company : " + car3.company);
		System.out.println("car3.model : " + car3.model);
		System.out.println("car3.color : " + car3.color);
		System.out.println("car3.maxspeed : " + car3.maxspeed);
		car car4 = new car("택시", "검정" , 200);
		System.out.println("--------------------------------" );
		System.out.println("car4.company : " + car4.company);
		System.out.println("car4.model : " + car4.model);
		System.out.println("car4.color : " + car4.color);
		System.out.println("car4.maxspeed : " + car4.maxspeed);
		
		
	}
}
