package ch06.sec07.exam01;

// class = 설계도
public class car {
//	  필드(멤버변수)
	  String model;
      String company;
      String color;
      int maxspeed;
      int speed;
      
//    생성자
      car(String m, String c, int s){
//    	  주로 필드 초기화를 할때 쓴다.
//    	  this :이 클래스 -> car 클래스 -> car 클래스 안에 있는 필드
    	  this.model=model;
    	  this.color=color;
    	  this.maxspeed=maxspeed;
      }
}
