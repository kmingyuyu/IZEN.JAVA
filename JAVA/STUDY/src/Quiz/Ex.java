package Quiz;

public class Ex {
    
//	메서드명 : isNumber
//	-기능 : 주어진 문자열이 모두 숫자로만 이루어져있는지 확인한다.
//	모두 숫자로만 이루어져 있으면 true를 반환하고, 그렇지 않으면 false를 반환한다.
//	만일 주어진 문자열이 null이거나 빈문자열“”이라면 false를 반환한다.
//	-반환타입 : boolean
//	-매개변수 : String str ->검사할 문자열
	
	
	public boolean isNumber(String str) {
		char check;
		
		if(str == null || str == "") {
			return false;
		}
			
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
	
	Ex ex = new Ex();
	
	String str = "";
	System.out.println(str + "는 숫자입니까? " + ex.isNumber(str));
	str = "1";
	System.out.println(str + "는 숫자입니까? " + ex.isNumber(str));
}
}







