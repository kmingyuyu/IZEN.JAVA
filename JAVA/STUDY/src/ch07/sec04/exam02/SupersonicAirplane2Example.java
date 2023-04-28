package ch07.sec04.exam02;

public class SupersonicAirplane2Example {
	public static void main(String[] arg) {
		
	  SupersonicAirplane sa = new SupersonicAirplane();
	  sa.takeOff();
	  sa.fly();
	  
	  System.out.println("---------------------");
//	  정적필드 호출 -> (클래스).(상수);
	  sa.flyMode = SupersonicAirplane.SUPERSONIC;
	  sa.fly();
	  
	  sa.flyMode = SupersonicAirplane.NORMAL;
	  sa.fly();
	  sa.land();
	  
	}
}
