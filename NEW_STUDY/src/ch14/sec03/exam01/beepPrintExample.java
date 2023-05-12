package ch14.sec03.exam01;

import java.awt.Toolkit;

public class beepPrintExample {

	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit(); //비프음 발생시키는 객체
				for(int i=0 ; i<5 ; i++) {
					toolkit.beep(); //비프음 발생
					try {
						Thread.sleep(500);
					} catch (Exception e) {
					}
						
				}
				
			}
			
		});
		
		thread.start();
		
		for(int i=0 ; i<5 ; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
			}
				
		}
		
		
		
		
		
		
		
		
		

	}

}
