package movie_info;

import java.util.*;
import java.time.*;

public class Person_Ticket_Info {
	private LocalDateTime time; //예매한 시간
	private int People ; //인원수
	private String cenema = "일반" ;
	private String seat1 ; // 영화관 좌석 행
	private int seat2 ; // 영화관 좌석 열
	
//	예매한 영화정보 담아줌
	private ArrayList<Movie_Default_Info> movieList = new ArrayList<> ();
	
	
	
	  public void addMovieList (Movie_Default_Info defaultInfo) {
	    	movieList.add(defaultInfo);
	    }  
	
	  
	


	public String getCenema() {
		return cenema;
	}





	public void setCenema(String cenema) {
		this.cenema = cenema;
	}





	public LocalDateTime getTime() {
		return time;
	}





	public void setTime(LocalDateTime time) {
		this.time = time;
	}





	public int getPeople() {
		return People;
	}





	public void setPeople(int people) {
		People = people;
	}





	public String getSeat1() {
		return seat1;
	}





	public void setSeat1(String seat1) {
		this.seat1 = seat1;
	}





	public int getSeat2() {
		return seat2;
	}





	public void setSeat2(int seat2) {
		this.seat2 = seat2;
	}





	public ArrayList<Movie_Default_Info> getMovieList() {
		return movieList;
	}


	public void setMovieList(ArrayList<Movie_Default_Info> movieList) {
		this.movieList = movieList;
	}
	
	
	
}
