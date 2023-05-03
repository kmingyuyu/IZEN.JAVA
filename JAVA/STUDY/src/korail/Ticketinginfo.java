package korail;

public class Ticketinginfo  {
   static int passId; // 패스권 아이디
   static int trainType; // 열차선택
   static int seat; //좌석
   static int endStation; //도착역 선택
   static int startMonth; //출발 월 선택
   static int startDay; //출발 일 선택
   
  
   
   static String[] trainlist = {"ktx","itx","새마을호"}; // 열차종류
   static String[] seatlist = {"일반석","특별석","장애특별석"}; //좌석종류
   static String[] endtlist = {"부산","강릉","춘천"}; //도착지 종류
   
   
   
   Ticketinginfo
   (int passId , int trainType, int seat, int endStation, int startMonth, int startDay) {
       this.passId = passId;	   
	   this.trainType = trainType;
	   this.seat = seat;
	   this.endStation = endStation;
	   this.startMonth = startMonth;
	   this.startDay = startDay;
  }
   
   
   
	   
	public static void totalinfo() {
		System.out.println("패스권 번호 : " + passId);
		System.out.println("열차:" + trainlist[trainType-=1]);
		System.out.println("좌석:" + seatlist[seat-=1] );
		System.out.println("도착역:" + endtlist[endStation-=1] );
		System.out.println("출발일: 2023 - " + startMonth + " - " + startDay );
		
	}
	
	
	
	
	

	



	
	public void price() {
		
	}




	public static int getPassId() {
		return passId;
	}

	public static void setPassId(int passId) {
		Ticketinginfo.passId = passId;
	}

	public static int getTrainType() {
		return trainType;
	}

	public static void setTrainType(int trainType) {
		Ticketinginfo.trainType = trainType;
	}

	public static int getSeat() {
		return seat;
	}

	public static void setSeat(int seat) {
		Ticketinginfo.seat = seat;
	}

	public static int getEndStation() {
		return endStation;
	}

	public static void setEndStation(int endStation) {
		Ticketinginfo.endStation = endStation;
	}

	public static int getStartMonth() {
		return startMonth;
	}

	public static void setStartMonth(int startMonth) {
		Ticketinginfo.startMonth = startMonth;
	}

	public static int getStartDay() {
		return startDay;
	}

	public static void setStartDay(int startDay) {
		Ticketinginfo.startDay = startDay;
	} 
	



	
}


  

