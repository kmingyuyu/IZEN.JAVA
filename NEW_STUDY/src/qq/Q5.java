package qq;

import java.text.SimpleDateFormat;
import java.util.*;


public class Q5 {
   public static void main(String[] args) {
	   Date now = new Date() ;
	   SimpleDateFormat simpleDateFormat = new SimpleDateFormat ("yyyy년 MM월 dd일 E요일 k시 m분");
	   String now2 = simpleDateFormat.format(now);
	   System.out.println(now2);
	
}
	
}
