package Quiz;

public class MemberService {

	String id;
	String password;
	
	
static boolean login(String id , String password) {
	    if(id == "hong" && password =="12345") {
	    	return true;
	    }else {
	        return false;}
		}
	
static void logout(String id) {
		System.out.println(id + "님이 로그아웃 되었습니다.");
	}



}