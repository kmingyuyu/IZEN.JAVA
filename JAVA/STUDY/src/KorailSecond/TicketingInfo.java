package KorailSecond;

public class TicketingInfo {
	   static int adult; //인원
	   static char  obstacle; //장애인원 여부
	   static int seat; //좌석
	   static int endStation; //도착역 
	   static int startMonth; //출발 월 
	   static int startDay; //출발 일 
	   static int startTime; //출발 시간 
	   
	
	   static String[] seatlist = {"일반석","특별석","장애특별석"}; //좌석종류
	   static String[] endtlist = {"부산","여수","강릉"}; //도착지 종류
       
	   TicketingInfo(){}
	   
	   
	   
	   
	   TicketingInfo
	   (int adult , char obstacle, int seat,  int endStation , int startMonth ,int startDay , int startTime) {
	       this.adult = adult;	   
		   this.obstacle = obstacle;
		   this.seat = seat;
		   this.endStation = endStation;
		   this.startMonth = startMonth;
		   this.startDay = startDay;
		   this.startTime = startTime;
	  }
	   
	   public static void totalinfo() {
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




	public char getObstacle() {
		return obstacle;
	}




	public void setObstacle(char obstacle) {
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
