package korail;

public class Ticketinginfo {
   static int adult; //어른 수
   static int child; // 어린이 수
   static int obstacle; //장애인원 여부
   static int traintype; // 열차선택
   static int seat; //좌석
   static int startstation; //출발역 선택
   static int endstation; //도착역 선택
   static int startmonth; //출발 월 선택
   static int startday; //출발 일 선택
   
   static String[] trainlist = {"ktx","itx","새마을호"}; // 열차종류
   static String[] seatlist = {"일반석","특별석","장애특별석"}; //좌석종류
   static String[] startlist = {"용산","광명","서울"}; //출발지 종류
   static String[] endtlist = {"부산","강릉","춘천"}; //도착지 종류
   
//   Ticketinginfo() {
//	   this.adult = adult;
//	   this.child = child;
//	   this.obstacle = obstacle;
//	   this.seat = seat;
//	   this.traintype = traintype;
//       this.startstation = startstation;
//	   this.endstation = endstation;
//	   this.startmonth = startmonth;
//	   this.startday = startday;
//  }
   
   
   Ticketinginfo(int adult, int child,  int obstacle) {
	  
	   }
	   
	   
   
   
   
   

	public static int getAdult() {
		return adult;
	}

	public static void setAdult(int adult) {
		Ticketinginfo.adult = adult;
	}

	public static int getChild() {
		return child;
	}

	public static void setChild(int child) {
		Ticketinginfo.child = child;
	}

	public static int getObstacle() {
		return obstacle;
	}

	public static void setObstacle(int obstacle) {
		Ticketinginfo.obstacle = obstacle;
	}

	public static int getTraintype() {
		return traintype;
	}

	public static void setTraintype(int traintype) {
		Ticketinginfo.traintype = traintype;
	}

	public static int getStartstation() {
		return startstation;
	}

	public static void setStartstation(int startstation) {
		Ticketinginfo.startstation = startstation;
	}

	public static int getEndstation() {
		return endstation;
	}

	public static void setEndstation(int endstation) {
		Ticketinginfo.endstation = endstation;
	}

	public static int getStartmonth() {
		return startmonth;
	}

	public static void setStartmonth(int startmonth) {
		Ticketinginfo.startmonth = startmonth;
	}

	public static int getStartday() {
		return startday;
	}

	public static void setStartday(int startday) {
		Ticketinginfo.startday = startday;
	}


	public static int getSeat() {
		return seat;
	}


	public static void setSeat(int seat) {
		Ticketinginfo.seat = seat;
	}
   
   
	
}


  

