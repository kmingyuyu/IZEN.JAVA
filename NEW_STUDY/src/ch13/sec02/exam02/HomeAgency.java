package ch13.sec02.exam02;

public class HomeAgency implements Rentable<Home> { //Home 클래스를 타입으로 사용

	@Override
	public Home rent() {
		return new Home(); //리턴 타입이 반드시 Home 이어야 함
	}
	
	
}
