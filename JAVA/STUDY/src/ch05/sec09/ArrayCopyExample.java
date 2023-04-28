package ch05.sec09;

public class ArrayCopyExample {

	public static void main(String[] args) {
           
		
		String[] oldstrarray = {"자바" , "어레이" , "카피" };
		
		String[] newstrarray = new String[5];
		
//      System.arraycopy
//		(원본배열, 원본배열 시작 인덱스, 새배열, 새배열 붙여넣기 시작인덱스 , 복사 항목수)
		System.arraycopy(oldstrarray, 0, newstrarray, 0, oldstrarray.length);
		
		for(int i=0; i<newstrarray.length; i++) {
			System.out.println(newstrarray[i]);
		}
	}

}
