package ch06.sec11.exam01;

public class KoreanExample {

	public static void main(String[] args) {
          
		Korean k1 = new Korean ("감자바");

		
//		필드값 읽기
        System.out.println(k1.nation);		
        System.out.println(k1.ssn);		
        System.out.println(k1.name);	
        
//      필드값 변경
//        k1.nation = "USA";
//        k1.ssn = "12345";
        k1.name = "이지바";
		
	}

}
