package movie_info;

import java.time.*;

public class DetailInfo {
	private double reservationRate ; // 예매율
	private int runningTime; //상영 시간
	private LocalDate openingdate; //개봉날짜
	private int ageGroup; // 연령
	
	private LocalDateTime[] movieSchedule;  
	
	public DetailInfo (double reservationRate ,int runningTime ,LocalDate openingdate ,int ageGroup) {
		this.reservationRate = reservationRate;
		this.runningTime = runningTime;
		this.openingdate = openingdate;
		this.ageGroup = ageGroup;
		
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
