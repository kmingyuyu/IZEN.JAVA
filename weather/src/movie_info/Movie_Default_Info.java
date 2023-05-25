package movie_info;

import java.util.ArrayList;

public class Movie_Default_Info {
     private String title; //영화제목
     private String genre; //영화 장르
     private String country; // 국가
     
//   영화의 상세정보를 담는다
     private ArrayList<Movie_Detail_Info> Movie_DetaillList = new ArrayList<> ();
     
//    생성자
     public Movie_Default_Info(String title , String genre , String country) {
    	 this.title = title;
    	 this.genre = genre;
    	 this.country = country;
    	 
     }

//   영화의 상세정보를 넣는 메소드
     public void getDetailList (Movie_Detail_Info detailInfo) {
    	 Movie_DetaillList.add(detailInfo);
     }
     
     
//    get/set
	
     
     
     
     
     
     
     
}
