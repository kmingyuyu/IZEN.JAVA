package ch19.sec02;

import java.net.*;

public class InetAddressExample {

	public static void main(String[] args) {
		try {
			InetAddress lacal = InetAddress.getLocalHost();
			System.out.println("내컴퓨터 ip 주소 : " + lacal.getHostAddress());
			
			InetAddress[] iaArr = InetAddress.getAllByName("www.google.com");
			for(InetAddress remote : iaArr) {
				System.out.println("www.google.com 주소 : " + remote.getHostAddress());
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
