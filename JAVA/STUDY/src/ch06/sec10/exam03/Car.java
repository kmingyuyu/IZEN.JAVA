package ch06.sec10.exam03;

public class Car {
//	인스턴스 필드
    int speed;
    
//  정적 필드 
    static int gas;
    
//  인스턴스 메소드
//  인스턴스 메소드) 인스턴스 필드, 정적필드 다 사용가능
    void run() {
    	System.out.println(speed + "로 달립니다.");
//    	System.out.println("가스 양 : " + gas);
    }

//  인스턴스 메소드) 인스턴스 메소드 정적 메소드 다 사용가능
    void run2() {
    	System.out.println(speed + "로 달립니다.");
//    	System.out.println("가스 양 : " + gas);
    	run(); //인스턴스메소드
    	simulate(); //정적메소드
    }
    
//  정적메소드) 정적 메소드 에서 인스턴스 필드는 사용할수 없다
    static void simulate() {
//    	System.out.println(speed + "로 달립니다."); //인스턴스필드
//    	simulate2(); //정적 메소드 사용가능
//    	System.out.println("가스 양 : " + gas); //정적 메소드 사용가능
//    	run(); //정적 메소드에서는 인스턴스  메소드 사용할수 없음
    	Car myCar = new Car();
    	myCar.speed = 60;
    	myCar.run();
    }
    
//  정적메소드에서는 인스턴스 멤버를 사용하기위해 객체를 생성해서 사용한다.
    

    
    
    static void simulate2() {
    	System.out.println("가스 양 : " + gas);
    }
    
    
	
	
//	main = 리턴타입이 없는 'main'이라는 이름을 가진 정적(static)메소드
	public static void main(String[] args) {
         Car myCar = new Car();
//         myCar.speed = 60;
         myCar.run2();
         
//         System.out.println(Car.gas);
//         Car.simulate();
         
		
		
	}
}
