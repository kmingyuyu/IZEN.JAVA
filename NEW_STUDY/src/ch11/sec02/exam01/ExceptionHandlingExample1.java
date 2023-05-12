package ch11.sec02.exam01;

public class ExceptionHandlingExample1 {
	
	public static void printLength(String data) {
		
		try {
			int result = data.length();
			System.out.println("문자 수 : " + result);
			
		} catch (NullPointerException e) { //try문에서 NullPointerException 에러 발생시 잡는다
//			System.out.println("NullPointerException 에러가 발생했습니다");
			System.out.println(e.getMessage()); // 예외가 발생한 이유를 리턴
			System.out.println(e.toString()); //예외의 종류를 리턴
			e.printStackTrace(); //예외의 이유 , 종류 , 어디서 발생했는지 리턴
		} finally {
			System.out.println("[마무리 실행]");
		}
		
		
		
		
		
	};
	
	
	
	public static void main(String[] args) {
		System.out.println("[프로그램 시작]");
		printLength("this is java");
		printLength(null);
		System.out.println("프로그램 종료");
}
}
