package ch15.sec03.exam02;

public class Member {
		
	public String name ; 
	public int age;
	
	
	public Member(String name , int age) {
		this.name = name;
		this.age = age;
	}


	@Override
	public int hashCode() {
		return name.hashCode();
		
	}


	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) { // instanceof : obj 객체가 member 객체를 가지고 있는지 ?
			
			Member target = (Member)obj; //강제타입변환 
			
			return target.name.equals(name) && (target.age == age);
		}else {
			return false;
		}
	}
	
	
	
}
