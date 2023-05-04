package korail;

public class TicketingInfo {
	   private int adult; //인원
	   private int obstacle; //장애인원 여부
	   private int seat; //좌석
	   private int endStation; //도착역 
	   private int startMonth; //출발 월 
	   private int startDay; //출발 일 
	   private int startTime; //출발 시간 
	   
	
	   static String[] seatlist = {"일반석","특별석","장애특별석"}; //좌석종류
	   static String[] endtlist = {"부산","여수","강릉"}; //도착지 종류
       
	   TicketingInfo(){}
	   
	   
	   
	   
	   TicketingInfo
	   (int adult , int obstacle, int seat,  int endStation , int startMonth ,int startDay , int startTime) {
	       this.adult = adult;	   
		   this.obstacle = obstacle;
		   this.seat = seat;
		   this.endStation = endStation;
		   this.startMonth = startMonth;
		   this.startDay = startDay;
		   this.startTime = startTime;
	  }
	   
	 
	   
	   
	   
	   
	   
	   public void totalinfo() {
			System.out.println("인원수 : " + adult  + "    장애인원 여부 : " + obstacle);
			System.out.println("좌석:" + seatlist[seat-1] );
			System.out.println("도착역:" + endtlist[endStation-1] );
			System.out.println("출발일: 2023 - " + startMonth + " - " + startDay + "  시: " + startTime );
			
		}
	   
	   

	public int getAdult() {
		return adult;
	}


	public void setAdult(int adult) {
		this.adult = adult;
	}




	public int getObstacle() {
		return obstacle;
	}




	public void setObstacle(int obstacle) {
		this.obstacle = obstacle;
	}




	public int getSeat() {
		return seat;
	}




	public void setSeat(int seat) {
		this.seat = seat;
	}




	public int getEndStation() {
		return endStation;
	}




	public void setEndStation(int endStation) {
		this.endStation = endStation;
	}




	public int getStartMonth() {
		return startMonth;
	}




	public void setStartMonth(int startMonth) {
		this.startMonth = startMonth;
	}




	public int getStartDay() {
		return startDay;
	}




	public void setStartDay(int startDay) {
		this.startDay = startDay;
	}




	public int getStartTime() {
		return startTime;
	}




	public void setStartTime(int startTime) {
		this.startTime = startTime;
	}
	   
	   
	   


	
	
}
