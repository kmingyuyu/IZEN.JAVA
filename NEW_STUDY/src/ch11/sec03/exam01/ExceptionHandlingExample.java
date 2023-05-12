package ch11.sec03.exam01;

public class ExceptionHandlingExample {
	public static void main(String[] args) {

		String[] array = {"100" , "1ㅇㅇ", null , "200"};
		
		
		for(int i=0; i<3; i++) {
			try {
				 int value = Integer.parseInt(array[i]); //문자열 int로 바꿔줌
				 System.out.println("array[" + i + "]" + value);
			}
//			ArrayIndexOutOfBoundsException: 없는 배열을 불러왔을때 
			catch (ArrayIndexOutOfBoundsException e) {
				e.printStackTrace();
			}
//			NumberFormatException : int로 변환시 변환안될때
			catch (NumberFormatException | NullPointerException e) {
				System.out.println("데이터에 문제가 있음");
			}
		}
		
		
		}
	
	
}
