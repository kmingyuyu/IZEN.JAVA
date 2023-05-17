package ch18.sec03.exam02;

import java.io.*;

public class ReadExample {

	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("C:/Temp/test2.db");
			
			byte[] data = new byte[100]; //100byte씩 읽어옴
			
			while (true) {
				int num = is.read(data); //1byte 씩 데이터를 읽어온다.
				
//				더이상 읽을 데이터가 없으면 -1을 리턴함
				if(num == -1) break;
				
				for(int i=0; i<num; i++) {
					System.out.println(data[i]);
				}
			}
			
			is.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		} 

	}

}
