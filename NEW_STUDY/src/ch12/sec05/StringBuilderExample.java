package ch12.sec05;

public class StringBuilderExample {

	public static void main(String[] args) {

		
//		StringBuilder : 문자열을 추가 삭제 할때 사용 -> 동기화 지원 X
//		Stringbuffer : StringBuilder 와 기능은 같음 -> 동기화 지원 o
		
		
//		data = "DEF";
		String data = new StringBuilder()
				.append("DEF") // 문자열을맨끝에 추가
				.insert(0,"ABC") // 원하는 위치에 추가 
				.delete(3,4) //(시작위치,끝위치) 시작위치에서 끝나기직전 인덱스 번호까지 삭제
				.toString(); //StringBuilder -> String 타입으로 변경
		
		System.out.println(data);
		
		

	}

}
