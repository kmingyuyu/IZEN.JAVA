package ch18.sec03.exam03;

import java.io.*;

public class CopyExample {

	public static void main(String[] args) {
			
			String originalFileName = "C:/Temp/test.jpg";
			String targetFileName = "C:/Temp/test2.jpg";
			
			try {
				InputStream is = new FileInputStream(originalFileName);
				OutputStream os = new FileOutputStream(targetFileName);
				
				byte[] data = new byte[1024];
				
				while (true) {
					int num = is.read(data); 
					
					if(num == -1) break;
					os.write(data , 0 ,num);
				}
				
				os.flush();
				os.close();
				is.close();
			} catch (Exception e) {
			}
			
			
			
			
			
			}
	
			
		
	}


