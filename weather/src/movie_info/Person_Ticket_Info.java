package movie_info;

import java.util.*;
import java.time.*;

public class Person_Ticket_Info {
	private LocalDateTime time; //예매한 시간
	private String cenema = "일반" ; // 관 정보 기본: 일반
	private char seat1 ; // 영화관 좌석 행
	private int seat2 ; // 영화관 좌석 열
	
	
	public Person_Ticket_Info (LocalDateTime time , String cenema, char seat1 , int seat2 ) {
		this.time = time;
		this.cenema = cenema ;
		this.seat1 = seat1;
		this.seat2 = seat2;
	}
	
	
	
//	예매한 영화정보 담아줌
	private ArrayList<Movie_Default_Info> movieList = new ArrayList<> ();
	
	
	 public void addMovieList (Movie_Default_Info defaultInfo) {
	    movieList.add(defaultInfo);
	   }  


	public String getCenema() {
		return cenema;
	}

	
	




	@Override
	public String toString() {
		return this.time + this.cenema + this.seat1 + this.seat2 ;
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



	public char getSeat1() {
		return seat1;
	}





	public void setSeat1(char seat1) {
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
