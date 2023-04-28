package ch06.sec07.exam01;

public class carExample {

	public static void main(String[] args) {
//      중요. 인스턴스(객체)가 생성될때 생성자가 실행된다.
		car mycar = new car("그렌져","검정",250);
		
		System.out.println(mycar.model);
		System.out.println(mycar.color);
		System.out.println(mycar.maxspeed);
	}

}
