package Quiz;

public class Member {
      public static void main(String[ ] arg) {
		
    	  MemberService Member = new MemberService();

		boolean result = Member.login("hong", "12345");

		if(result) {
		     System.out.println("로그인 되었습니다.");
		     Member.logout("hong");
		} else {
		     System.out.println("id 또는 password가 올바르지 않습니다.");
		}


	}
       
  
  

}
  
  




	






