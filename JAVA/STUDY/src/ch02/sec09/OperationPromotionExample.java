package ch02.sec09;

public class OperationPromotionExample {

	public static void main(String[] args) {
		short v1 = 10;
		short v2 = 20;
		short result = (short) (v1 + v2);
//		연산되는 순간 형변환 발생 (int) 
		
		byte v3 = 10;
		int v4 = 100;
		long v5 = 1000L;
		long result3 = v3 + v4 + v5;
//		연산되는 피연산자중에 큰타입 피연산자로 형변환 발생 
//		해결방법:허용범위가 큰타입으로 변수타입 지정
		
		char v6 = 'A'; //65
		char v7 = 1;
		int result4 = v6 + v7; 
		System.out.println("result4 =" + result4);
		System.out.println("result4 = " + (char)result4);
//		short , byte , char 끼리 연산하는 순간 int로 형변환 발생 
//		해결방법: int 타입에 결과를 담아야함
		
		int v8 = 10;
		double result5 = v8 / 4;
		System.out.println("result5 :" + result5);
//		정수 끼리 연산의 결과는 정수
//		연산후 실수에 담아도 정수
//		결과는= 2.0 실수2.5로 나오는 해결방법:
		int v9 = 10;
		double result6 = v9 / 4.0;
		System.out.println("result6 :" + result6);
//		피연산자를 정수와 실수로 실행
		
//		둘다 정수가 담긴 변수인데 실수 결과를 얻어야 할때 해결방법:
		int v10 = 1;
		int v11 = 2;
		double result7 =(double) v10 / v11; //(double) (v10/v11)되지않도록 조심
		System.out.println("result7 :" + result7);
//		변수 넣기전 연산식 앞에 형변환 실행
				

	}

}
