package ch18.sec03.exam01;

import java.io.*;

public class ReadExample {

	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("C:/Temp/test1.db");
			
			
			while (true) {
				int data = is.read(); //1byte 씩 데이터를 읽어온다.
				
//				더이상 읽을 데이터가 없으면 -1을 리턴함
				if(data == -1) break;
				
				System.out.println(data);
			}
			
			is.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		} 

	}

}
