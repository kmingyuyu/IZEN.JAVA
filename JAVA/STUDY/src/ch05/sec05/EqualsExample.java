package ch05.sec05;

public class EqualsExample {

	public static void main(String[] args) {
//		strvar1과 strvar2는 같은 주소를 가지고 있다
      String strvar1 ="홍길동";
      String strvar2 ="홍길동";
      
      if(strvar1 == strvar2) {
    	  System.out.println("strvar1과 stavar2는 같은 주소를 참조");
      } else {
    	  System.out.println("strvar1과 stavar2는 다른 주소를 참조");
      }
      
      
//      값 자체를 비교하기 위해서는 equals를 사용한다.
      if(strvar1.equals(strvar2)) {
    	  System.out.println("strvar1과 stavar2는 값이 같다.");
      }
      
//      다른 주소를 가지고 있다.
      String strvar3 = new String("홍길동");
      String strvar4 = new String("홍길동");
      if(strvar3 == strvar4) {
    	  System.out.println("strvar3과 stavar4는 같은 주소를 참조");
      } else {
    	  System.out.println("strvar3과 stavar4는 다른 주소를 참조");
      }
      if(strvar3.equals(strvar4)) {
    	  System.out.println("strvar3과 stavar4는 값이 같다.");
      }
      
      
//      빈문자열도 똑같이 equals를 사용한다.
      String hobby = "";
      if(hobby.equals("")) {
    	  System.out.println("hobby가 참조하는건 빈문자열");
      }
      
      
		
	}

}
