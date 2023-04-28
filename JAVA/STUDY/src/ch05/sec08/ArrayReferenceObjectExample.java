package ch05.sec08;

public class ArrayReferenceObjectExample {

	public static void main(String[] args) {
      
		String[] strarray = new String[3];
		strarray[0] = "Java";
		strarray[1] = "Java";
		strarray[2] = new String("Java");
		System.out.println(strarray[0] == strarray[1]); //주소가 같다
		System.out.println(strarray[0] == strarray[2]); //주소가 다르다
		System.out.println(strarray[0].equals(strarray[2])); //.equals:값이 같다
	}

}
