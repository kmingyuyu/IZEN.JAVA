package movie_info;

import java.util.*;
import java.time.*;

public class Person_Ticket_Info {
	private LocalDateTime NowDate; //예매한 시간
	private LocalDateTime MovieDate; //영화 시작시간
	private String[][] seat ; // 영화관 좌석
	
//	예매한 영화정보 담아줌
	private ArrayList<Movie_Default_Info> movieList = new ArrayList<> ();
	
	
	Person_Ticket_Info(LocalDateTime NowDate ,LocalDateTime MovieDate , String[][] seat) {
		this.NowDate = NowDate;
		this.MovieDate = MovieDate;
		this.seat = seat;
	}
	
	  public void addMovieList (Movie_Default_Info defaultInfo) {
	    	movieList.add(defaultInfo);
	    }  
	

	public LocalDateTime getNowDate() {
		return NowDate;
	}


	public void setNowDate(LocalDateTime nowDate) {
		NowDate = nowDate;
	}


	public LocalDateTime getMovieDate() {
		return MovieDate;
	}


	public void setMovieDate(LocalDateTime movieDate) {
		MovieDate = movieDate;
	}


	public String[][] getSeat() {
		return seat;
	}


	public void setSeat(String[][] seat) {
		this.seat = seat;
	}


	public ArrayList<Movie_Default_Info> getMovieList() {
		return movieList;
	}


	public void setMovieList(ArrayList<Movie_Default_Info> movieList) {
		this.movieList = movieList;
	}
	
	
	
}
