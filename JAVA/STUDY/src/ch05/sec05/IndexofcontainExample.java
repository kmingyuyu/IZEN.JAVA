package ch05.sec05;

public class IndexofcontainExample {

	public static void main(String[] args) {
		String subject = "자바 프로그래밍";
		
//		1.원하는 문자열을 찾아서 가져오는 기능
//		해당 문자열이 시작하는 인덱스 번호를 리턴한다.
		int location = subject.indexOf("프로그래밍");
		System.out.println(location);
		
		String substring = subject.substring(location);
		System.out.println(substring);
		
		
//		2.해당 문자열이 있는지 찾아노는 기능
		String str = "프로그래밍";
		location = subject.indexOf(str);
		if(location == -1) { //문자열이 없으면 -1을 리턴한다
			System.out.println("해당 문자열이 없습니다");
		}else {
			System.out.println("해당 문자열이 존재합니다");
			
//			                    subject.substring(0,2);
			String substring2 = subject.substring(location,str.length());
			System.out.println("substring2=" +substring2);
		}
		
		boolean result = subject.contains("자바");
		if(result) {
			System.out.println("자바와 관련된 책이군요");
		}else {
			System.out.println("자바와 관련없는 책이군요");
		}

	}

}
