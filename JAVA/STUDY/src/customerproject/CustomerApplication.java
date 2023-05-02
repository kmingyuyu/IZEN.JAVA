package customerproject;

import java.util.ArrayList;

import customer.project.Customer;

public class CustomerApplication {
     
	private static ArrayList<Customer> customerList = new ArrayList<> ();
	
	
	public static void main(String[] args) {
//		실버 둥급(일반)
		Customer customerLee = new Customer (10010 , "이순신");
		Customer customerShin = new Customer (10020 , "신사임당");
		
//		골드 등급 (자동타입변환) = > 다형성
		Customer customerHong = new GoldCustomer(10030 , "홍길동");
		Customer customerJeong = new GoldCustomer(10040 , "정약용");
		
//		VIP등급
		Customer customerYull = new VIPCustomer(10050 , "이율곡" , 12345);
		
//		arrayList에 .add로 객체 추가
		customerList.add(customerLee);
		customerList.add(customerShin);
		customerList.add(customerHong);
		customerList.add(customerJeong);
		customerList.add(customerYull);
		
//		1. 모든 고객 정보 출력
		showAllCustomer();
		
//		2. ID로 찾은 고객의 실제 지불금액과, 보너스포인트 출력
		Customer customer = findCustomer(10050); //이율곡
        
		if(customer == null) {
//			회원을 찾지 못했을때
			System.out.println("존재 하지 않는 회원입니다");
		}else {
//			회원을 찾았을때
			showPriceBonus(customer, 10000); //이율곡이 10000원을 주고 상품을 구매했을때
		}
		
	}
	
//	고객 정보 출력 메소드
	public static void showAllCustomer () {
		System.out.println("-------------------모든 고객 정보 출력-------------------");
		for(Customer customer : customerList ) {
			System.out.println(customer.showCustomerInfo());
		}
	}
	
//	고객ID로 고객찾기
	public static Customer findCustomer(int customerID) {
		Customer resultCustomer = null;
		for(Customer customer : customerList) {
//			id가 같으면
			if(customer.getCustomerID() == customerID) {
//				id가 같은 customer객체 resultCustomer에 넣어줌
				resultCustomer = customer;
				break;
			}
		}return resultCustomer;
	}
	
//	실제 지불금액 , 보너스 포인트 출력
	public static void showpRriceBonus (Customer customer, int price) {
		System.out.println("-------------------고객의 할인율과 보너스 포인트-------------------");
		
//		지불 금액
		int cost = customer.calcPrice(price);
		
		System.out.println(customer.getCustomerName() + "님의 지불금액" + cost + "원");
		System.out.println(customer.getCustomerName() + "님의 지불금액" + cost + "원");
	}
}
