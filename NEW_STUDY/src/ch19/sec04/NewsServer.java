package ch19.sec04;

import java.net.*;
import java.util.Scanner;

public class NewsServer {
        private static DatagramSocket datagramSocket = null;
        public static void main(String[] args) {
        	System.out.println("------------------------------------------------");
    		System.out.println("서버를 종료하려면 q 또는 Q를 입력하고 Enter 키를 입력하세요");
    		System.out.println("------------------------------------------------");
    		
    		startServer();
    		
    		Scanner scanner = new Scanner(System.in);
    		while (true) {
    			String key = scanner.nextLine();
    			if(key.toLowerCase().equals("q")) {
    				break;
    			}
    		}
    		
    		scanner.close();
    		
    		stopServer();
    		
		}
        
        public static void startServer() {
        	Thread thread = new Thread() {

				@Override
				public void run() {
					try {
						datagramSocket = new DatagramSocket(50001);
						System.out.println("[서버] 시작");
						
						while (true) {
//							클라이언트한테 데이터를 받는다.(뉴스 주제)
							DatagramPacket receivePacket = new DatagramPacket
									(new byte[1024] , 1024); // 수신받을수 있는 배열 , 수신받을 바이트
							datagramSocket.receive(receivePacket);
							String newsKind = new String
									(receivePacket.getData(), 0 , receivePacket.getLength() , "UTF-8");
							
							SocketAddress socketAddress = receivePacket.getSocketAddress();
							
							for(int i=1; i<=10; i++) {
								String data = newsKind + ": 뉴스 " + i;
								
//								클아이언트한테 데이터를 보낸다.
								byte[] bytes = data.getBytes("UTF-8"); // 인코딩
								DatagramPacket sendPacket = 
										new DatagramPacket(bytes , 0 , bytes.length , socketAddress);
								datagramSocket.send(sendPacket);
							}
						}
						
					} catch (Exception e) {
						System.out.println("[서버] " + e.getMessage());
					}
				}
        	};
        	thread.start();
        	
        }
        public static void stopServer() {
        	datagramSocket.close();
        	System.out.println("[서버] 종료");
        }
        
        
        
        }
