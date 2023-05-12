package ch14.sec06.exam01;

public class User2Thread extends Thread{

private Calculator calculator ;  
	
	
	public User2Thread () {
		setName("User2Thread"); //스레드 이름 지정
	}
	
	
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
	
	
	
	@Override
	public void run() {
//		실행될 스레드 코드
		calculator.setMemory1(50);
	}

}
