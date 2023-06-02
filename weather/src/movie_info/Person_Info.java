package movie_info;

public class Person_Info {

	private String member_ID ; // 아이디
	private String member_Password ; // 비밀번호
	private String member_Name ;  // 회원 이름
	private String member_RRN ; //회원 주민번호
	private String member_PhoneNumber ; // 핸드폰 번호 
	
	
//	생성자
	
	


	@Override
	public String toString() {
		return "\tID : " + this.member_ID + 
				"\n\t성함 : " + this.member_Name + 
				"\n\t생년월일(앞자리) : " + this.member_RRN + 
				"\n\tP/N : " + this.member_PhoneNumber;
	}


	public String getMember_ID() {
		return member_ID;
	}


	public void setMember_ID(String member_ID) {
		this.member_ID = member_ID;
	}


	public String getMember_Password() {
		return member_Password;
	}


	public void setMember_Password(String member_Password) {
		this.member_Password = member_Password;
	}


	public String getMember_Name() {
		return member_Name;
	}


	public void setMember_Name(String member_Name) {
		this.member_Name = member_Name;
	}


	public String getMember_RRN() {
		return member_RRN;
	}


	public void setMember_RRN(String member_RRN) {
		this.member_RRN = member_RRN;
	}


	public String getMember_PhoneNumber() {
		return member_PhoneNumber;
	}


	public void setMember_PhoneNumber(String member_PhoneNumber) {
		this.member_PhoneNumber = member_PhoneNumber;
	}
	
	
	
	
	
	
	
	
	
}
