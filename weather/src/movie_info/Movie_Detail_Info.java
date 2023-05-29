package movie_info;

import java.time.*;

public class Movie_Detail_Info implements Comparable<Movie_Detail_Info> {
	private double reservationRate ; // 예매율
	private int runningTime; //상영 시간
	private LocalDate openingdate; //개봉날짜
	private int ageGroup; // 연령
	
	private LocalDateTime[] movieSchedule; // 영화예매시간
	
	public Movie_Detail_Info (double reservationRate ,int runningTime ,LocalDate openingdate ,int ageGroup) {
		this.reservationRate = reservationRate;
		this.runningTime = runningTime;
		this.openingdate = openingdate;
		this.ageGroup = ageGroup;
		
	}
	

	

	@Override
	public int compareTo(Movie_Detail_Info o) {
		return (int) (reservationRate - o.reservationRate);
	}




	@Override
	public String toString() {
		return "예매율 : " + this.reservationRate + "상영시간 : " + this.runningTime
				+ "개봉날짜 : " + this.openingdate + "연령 : " + this.ageGroup;
	}




	public LocalDateTime[] getMovieSchedule() {
		return movieSchedule;
	}

	public void setMovieSchedule(LocalDateTime[] movieSchedule) {
		this.movieSchedule = movieSchedule;
	}

	public double getReservationRate() {
		return reservationRate;
	}



	public void setReservationRate(double reservationRate) {
		this.reservationRate = reservationRate;
	}



	public int getRunningTime() {
		return runningTime;
	}



	public void setRunningTime(int runningTime) {
		this.runningTime = runningTime;
	}



	public LocalDate getOpeningdate() {
		return openingdate;
	}



	public void setOpeningdate(LocalDate openingdate) {
		this.openingdate = openingdate;
	}



	public int getAgeGroup() {
		return ageGroup;
	}



	public void setAgeGroup(int ageGroup) {
		this.ageGroup = ageGroup;
	}



	
	
//	get /set
	
	
	
	
	
	
	
}
