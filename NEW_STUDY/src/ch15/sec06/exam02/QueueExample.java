package ch15.sec06.exam02;

import java.util.*;


public class QueueExample {

	public static void main(String[] args) {
		Queue<Message> messageQueue = new LinkedList<> ();
		
		messageQueue.offer(new Message("sendMail","홍길동"));
		messageQueue.offer(new Message("sendSMS","신용권"));
		messageQueue.offer(new Message("sendKakagotalk","김자바"));
		
		while(!messageQueue.isEmpty()) {
			Message message = messageQueue.poll();
			
			switch (message.command) {
			case "sendMail": {
				System.out.println(message.to + "님에게 메일을 보냅니다.");
				break;
			}case "sendSMS": {
				System.out.println(message.to + "님에게 SMS을 보냅니다.");
				break;
			}case "sendKakagotalk": {
				System.out.println(message.to + "님에게 카톡을 보냅니다.");
				break;
			}
			default:
			}
		} 
		

	}

}
