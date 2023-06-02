package movie_info;

import java.util.*;

public class Movie_Default_Info {
     private String title; //영화제목
     private String genre; //영화 장르
     private String country; // 국가
     
//   영화 상세정보 담는 List
     private ArrayList<Movie_Detail_Info> movie_Detail = new ArrayList<>();
     
     
     
     
//    생성자
     public Movie_Default_Info(String title , String genre , String country) {
    	 this.title = title;
    	 this.genre = genre;
    	 this.country = country;
    	 
     }
     
//   영화의 상세정보를 담는다
     public void addmovie_Detail(Movie_Detail_Info Movie_Detail_Info) {
    	 movie_Detail.add(Movie_Detail_Info);
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

    public ArrayList<Movie_Detail_Info> getMovie_Detail() {
		return movie_Detail;
	}




     
     
	
     
     
     
     
     
     
     
}
