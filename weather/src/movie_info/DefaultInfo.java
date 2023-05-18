package movie_info;

import java.util.ArrayList;

public class DefaultInfo {
     private String title; //영화제목
     private String genre; //영화 장르
     private String country; // 국가
     
     private ArrayList<DetailInfo> detailList = new ArrayList<> ();
     
     public DefaultInfo(String title , String genre , String country) {
    	 this.title = title;
    	 this.genre = genre;
    	 this.country = country;
    	 
     }

     public void getDetailList (DetailInfo detailInfo) {
    	 detailList.add(detailInfo);
     }
     
     
//    get/set
	
     
     
     
     
     
     
     
}
