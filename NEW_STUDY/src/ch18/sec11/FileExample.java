package ch18.sec11;

import java.text.*;
import java.util.Date;
import java.io.File;
import java.io.IOException;


public class FileExample {

	public static void main(String[] args) throws IOException {
		File dir = new File("C:/Temp/images");
		File file1 = new File("C:/Temp/file1.txt");
		File file2 = new File("C:/Temp/file2.txt");
		File file3 = new File("C:/Temp/file3.txt");
		
		if(!dir.exists()) {dir.mkdirs();} //존재하지 않으면 디렉토리 생성
		if(!file1.exists()) {file1.createNewFile();} //파일이 존재하지 않으면 파일 생성
		if(!file2.exists()) {file2.createNewFile();}
		if(!file3.exists()) {file3.createNewFile();}
		
		File temp = new File ("C:/Temp");
		File[] contents = temp.listFiles();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
		for (File file : contents) {
			System.out.printf("%-25s",sdf.format(new Date(file.lastModified())));
			
			if(file.isDirectory()) { //디렉토리 인지 확인
				System.out.printf("%-10s%-20s" , "<DIR>" , file.getName());
			}else {
				System.out.printf("%-10s%-20s" , file.length() , file.getName());
			}
			
			System.out.println();
		}
	

	}

}
