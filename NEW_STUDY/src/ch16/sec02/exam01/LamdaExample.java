package ch16.sec02.exam01;

public class LamdaExample {
	public static void main(String[] args) {
		Person person = new Person();
		
		person.action(()->{
			System.out.println("출근 합니다");
			System.out.println("프로그래밍");
		});
		
//		실행문이 하나일때 중괄호 생략이 가능하다
		person.action(()->System.out.println("퇴근 합니다"));
	}
}
