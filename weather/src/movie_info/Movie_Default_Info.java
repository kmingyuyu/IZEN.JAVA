package movie_info;

import java.util.*;

public class Movie_Default_Info {
     private String title; //영화제목
     private String genre; //영화 장르
     private String country; // 국가
     
//   영화의 상세정보를 담는다
     
     
//    생성자
     public Movie_Default_Info(String title , String genre , String country) {
    	 this.title = title;
    	 this.genre = genre;
    	 this.country = country;
    	 
     }
     
     


	@Override
	public String toString() {
		return "제목 :" + title + " 장르 :" + genre + " 국가 :" + country  ;
	}

//    get/set
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}



     
     
	
     
     
     
     
     
     
     
}
