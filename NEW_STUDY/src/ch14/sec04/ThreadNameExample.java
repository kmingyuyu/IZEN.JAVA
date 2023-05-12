package ch14.sec04;

public class ThreadNameExample {

	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread(); //이코드를 실행하는 스레드 객체를 얻어옴
		System.out.println(mainThread.getName() + "실행");
		
		
		
		
		
		for(int i=0; i<3; i++) {
			Thread threadA = new Thread() {

				@Override
				public void run() {
					System.out.println(getName() + "실행");
				}
				
			};
			threadA.start();
		}
		
	
		
		Thread chatThread = new Thread() {

			@Override
			public void run() {
				System.out.println(getName() + "실행");
			}
			
		};
//		스레드의 이름지정 : 스레드가 시작되기전에 지정을 해줌.
		chatThread.setName("chat-thread");
		chatThread.start();

	}

}
