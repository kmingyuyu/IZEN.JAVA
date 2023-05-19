package ch19.sec03.exam01;

import java.net.*;
import java.io.*;


public class ClientExample {

	public static void main(String[] args) {
		try {
//			소켓 생성, 50001 번 연결 요청
//			내 컴퓨터에서 서버를 구동시키므로 주소는 localhost	
			Socket socket = new Socket("localhost" , 50001); 
//			port는 50001 번 으로 접속
			
			System.out.println("[클라이언트] 연결 성공");
			
			socket.close();
			System.out.println("[클라이언트] 가 연결 끊음");
		} catch (Exception e) {
			
		}

	}

}
