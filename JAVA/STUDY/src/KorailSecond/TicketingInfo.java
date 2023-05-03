package KorailSecond;

public class TicketingInfo {
	   static int adult; //인원
	   static char  obstacle; //장애인원 여부
	   static int trainType; // 열차선택
	   static int seat; //좌석
	   static int startStation; //도착역 선택
	   static int endStation; //도착역 선택
	   static int startMonth; //출발 월 선택
	   static int startDay; //출발 일 선택
	
	   static String[] trainlist = {"ktx","itx","새마을호"}; // 열차종류
	   static String[] seatlist = {"일반석","특별석","장애특별석"}; //좌석종류
	   static String[] startlist = {"서울","용산","광명"}; //출발지 종류
	   static String[] endtlist = {"부산","강릉","춘천"}; //도착지 종류
       
	   TicketingInfo(){}
	   
	   
	   
	   
	   TicketingInfo
	   (int adult , char obstacle, int trainType, int seat,int startStation, 
			   int endStation , int startMonth ,int startDay) {
	       this.adult = adult;	   
		   this.obstacle = obstacle;
		   this.trainType = trainType;
		   this.seat = seat;
		   this.startStation = startStation;
		   this.endStation = endStation;
		   this.startMonth = startMonth;
		   this.startDay = startDay;
	  }
	   
	   public static void totalinfo() {
			System.out.println("인원수 : " + adult  + "    장애인원 여부 : " + obstacle);
			System.out.println("열차:" + trainlist[trainType-1]);
			System.out.println("좌석:" + seatlist[seat-1] );
			System.out.println("출발역:" + startlist[startStation-1] );
			System.out.println("도착역:" + endtlist[endStation-1] );
			System.out.println("출발일: 2023 - " + startMonth + " - " + startDay );
			
		}
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   

	public static int getAdult() {
		return adult;
	}

	public static void setAdult(int adult) {
		TicketingInfo.adult = adult;
	}

	public static char getObstacle() {
		return obstacle;
	}

	public static void setObstacle(char obstacle) {
		TicketingInfo.obstacle = obstacle;
	}

	public static int getTrainType() {
		return trainType;
	}

	public static void setTrainType(int trainType) {
		TicketingInfo.trainType = trainType;
	}

	public static int getSeat() {
		return seat;
	}

	public static void setSeat(int seat) {
		TicketingInfo.seat = seat;
	}

	public static int getStartStation() {
		return startStation;
	}

	public static void setStartStation(int startStation) {
		TicketingInfo.startStation = startStation;
	}

	public static int getEndStation() {
		return endStation;
	}

	public static void setEndStation(int endStation) {
		TicketingInfo.endStation = endStation;
	}

	public static int getStartMonth() {
		return startMonth;
	}

	public static void setStartMonth(int startMonth) {
		TicketingInfo.startMonth = startMonth;
	}

	public static int getStartDay() {
		return startDay;
	}

	public static void setStartDay(int startDay) {
		TicketingInfo.startDay = startDay;
	}
	   


	
	
}
