package ch13.sec02.exam02;

public class CarAgency implements Rentable<Car>{ //Car 클래스를 타입으로 사용 

	@Override
	public Car rent() {
		return new Car(); // 리턴타입이 Car 여야 함
	}

}
