package Quiz;

public class Ex {
    
//	메서드명 : isNumber
//	-기능 : 주어진 문자열이 모두 숫자로만 이루어져있는지 확인한다.
//	모두 숫자로만 이루어져 있으면 true를 반환하고, 그렇지 않으면 false를 반환한다.
//	만일 주어진 문자열이 null이거나 빈문자열“”이라면 false를 반환한다.
//	-반환타입 : boolean
//	-매개변수 : String str ->검사할 문자열
	
	
	public static boolean isNumber(String str) {
		char check;
		
		if(str == null || str == "") return false;
		
			
		else {
			for(int i=0; i<str.length(); i++) {
				check = str.charAt(i);
				if(check < 48 || check > 58) {
					return false;
				}
			}
			
		      }
		return true;
	} 


	

public static void main(String[] args) {
	
<<<<<<< HEAD
	Ex ex = new Ex();
	
	String str = "5";
	System.out.println(str + "는 숫자입니까? " + ex.isNumber(str));
	str = "1O";
	System.out.println(str + "는 숫자입니까? " + ex.isNumber(str));
=======
	String str = "123";
	System.out.println(str + "는 숫자입니까? " + isNumber(str));
	str = "1u";
	System.out.println(str + "는 숫자입니까? " + isNumber(str));
>>>>>>> 3029035551f6e28c38d048343eecfe3ad55c4579
}
}







