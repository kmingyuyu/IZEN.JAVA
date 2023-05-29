package member;

import java.util.ArrayList;
import java.util.Scanner;

import movie_info.CGV;
import movie_info.Person_Info;
import utils.Define;

public class MemberPersonBrowser {
	Scanner scanner = new Scanner(System.in);
	static CGV cgv = CGV.getTotal();
	ArrayList<Person_Info> personList= cgv.getPersonList();
	
	
		public int info() {
		
		for(Person_Info info : personList) {
			
			System.out.println("ID :" + info.getMember_ID());
			System.out.println("성함 :" + info.getMember_Name());
			System.out.println("주민번호(앞자리) :" + info.getMember_RRN());
			System.out.println("P/N :" + info.getMember_PhoneNumber());
		}
		
		return Define.ADMIN_BROWSER;
	}
	
		public int logout() {
			
			
			return Define.ADMIN_BROWSER;
		}
}
