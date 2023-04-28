package ch02.sec07;

public class PromtionExample {

	public static void main(String[] args) {
		
		
		
		
		byte byteValue = 10;
		int intValue = byteValue;	
		System.out.println("intValue" + intValue);
		
		
		char charValue = 'A';
		intValue = charValue;
		System.out.println(intValue);
		
//		예외
		byteValue = 65;
		charValue =byteValue;
		
		intValue = 50;
//		 00000000 00000000 00000000 00110010
		
		
		long longValue = intValue;
		
		System.out.println(longValue);
		
		longValue = 100;
		float floatValue = longValue;
		System.out.println(floatValue);
		
		floatValue = 100.5F;
		double doubleValue = floatValue;
		System.out.println(doubleValue);
		
		
	}

}
