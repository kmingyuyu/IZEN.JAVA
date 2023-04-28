package ch06.sec08.exam01;

public class CalculatorExample {

	public static void main(String[] args) {
    
		Calculator MyCalc = new Calculator();
		Calculator MyCalc2 = new Calculator();
		
//		인스턴스명.메소드명();
		MyCalc.powerOn();
		
		int result1 = MyCalc.plus(5, 6);
		System.out.println(result1);
		
		int x= 10, 
			y= 4;
		
		double result2 = MyCalc.divide(x, y);
		
		System.out.println(result2);
		
		MyCalc.powerOff();
		
		
		
		
	}

}
