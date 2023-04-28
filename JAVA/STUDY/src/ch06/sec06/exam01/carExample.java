package ch06.sec06.exam01;

public class carExample {

	public static void main(String[] args) {
//      인스턴스 : new 로 생성한 자동차(객체)
		car mycar = new car();
		
		
//		필드에 접근 -> 인스턴스명.필드명
		System.out.println("mycar1제작회사 : " + mycar.company);
		System.out.println("모델명 : " + mycar.model);
		System.out.println("색 : " + mycar.color);
		System.out.println("최고속도 : " + mycar.maxspeed);
		System.out.println("현재속도 : " + mycar.speed);
		System.out.println(mycar);
		
//		필드값 변경 -> 인스턴스명.필드명 = 값 ;
		mycar.speed = 60;
		System.out.println("수정된 mycar속도 : " + mycar.speed);
		
		car mycar2 = new car();
		mycar2.speed=70;
		mycar2.company="기아";
		System.out.println("mycar2제작회사 : " + mycar2.company);
		System.out.println("수정된 mycar2속도 : " + mycar2.speed);
		System.out.println(mycar2);
		
		car mycar3 = new car();
		mycar3.speed=90;
		mycar3.company="르노삼성";
		System.out.println("mycar3제작회사 : " + mycar3.company);
		System.out.println("수정된 mycar3속도 : " + mycar3.speed);
		System.out.println(mycar3);
	}

}
