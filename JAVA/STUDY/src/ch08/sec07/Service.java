package ch08.sec07;

public interface Service {
//   디폴트 메소드
	 default void defaultMethod1 () {
		 System.out.println("defaultMethod1 종속 코드");
		 defaultCommon ();
	 }
	 default void defaultMethod2 () {
		 System.out.println("defaultMethod2 종속 코드");
		 defaultCommon ();
	 }
	 
	 
//	 프라이빗 메소드 - > 사용할때 구현객체가 필요하다.
	 private void defaultCommon () {
		 System.out.println("defaultMethod 중복코드A");
		 System.out.println("defaultMethod 중복코드B");
	 }
	 
	 
	 static void staticMethod1() {
		 System.out.println("staticMethod1 중속코드");
		 staticCommon();
	 }
	 static void staticMethod2() {
		 System.out.println("staticMethod2 중속코드");
		 staticCommon();
	 }
	 
	 
	 
	 private static void staticCommon() {
		 System.out.println("staticMethod 중복코드C");
		 System.out.println("staticMethod 중복코드D");
	 }
	 

	 
	 
}
