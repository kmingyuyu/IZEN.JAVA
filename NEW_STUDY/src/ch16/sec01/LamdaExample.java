package ch16.sec01;

public class LamdaExample {
	public static void main(String[] args) {
//		익명구현객체 + 매게변수 = 람다(함수)
		action((x , y) -> {
			int result = x + y;
			System.out.println("result :" + result);
		});
		
		
		action((x , y) -> {
			int result = x - y;
			System.out.println("result :" + result);
		});
	}
	
	
	
	public static void action(Calculatble calculatble) {
		int x = 10;
		int y = 4;
		
		calculatble.calculate(x,y);
		
	}
	
	
	
	
	
}
