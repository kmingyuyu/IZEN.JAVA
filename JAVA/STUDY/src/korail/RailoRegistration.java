package korail;

public class RailoRegistration {
   static int passDay; // 7일권 / 3일권
   static int headCount; // 인원수
   static char obstacle; // 장애인원 여부
   static int startStation; // 출발역
   static int startMonth; // 출발 월
   static int startDay; // 출발 일
   
   static int finalDay; // 도착 일
   
   static String[] passDayList = {"7일권","3일권"}; //출발지 종류
   static String[] startlist = {"서울","용산","광명"}; //출발지 종류
   
   RailoRegistration(int passDay, int headCount, char obstacle, int startstation, int startMonth, int startDay) {
	   this.passDay = passDay;
	   this.headCount = headCount;
	   this.obstacle = obstacle;
	   this.startStation = startStation;
	   this.startMonth = startMonth;
	   this.startDay = startDay;
   }
   
   public static void totalRailo() {
	   System.out.println("패스권 : " + passDayList[passDay-1] );
	   System.out.println("인원수 : " + headCount + "       장애인원 여부 : " + obstacle );
	   System.out.println("출발역 : " + startlist[startStation-1] );
	   System.out.println("기간 :");
	   System.out.println("2023 - "+  + startMonth + " - " + startDay );
	   System.out.println(" ~ ");
	   System.out.println("2023 - "+  + startMonth + " - " + finalDay() );
   }
  
   
    private static int finalDay() {
    	if(passDay == 0) {
    		finalDay = startDay + 7;}
    	if(passDay == 1) {
    		finalDay = startDay + 3;}
	return finalDay;
}


public static int getPassDay() {
	return passDay;
}

public static void setPassDay(int passDay) {
	RailoRegistration.passDay = passDay;
}

public static int getHeadCount() {
	return headCount;
}

public static void setHeadCount(int headCount) {
	RailoRegistration.headCount = headCount;
}

public static int getObstacle() {
	return obstacle;
}

public static void setObstacle(char obstacle) {
	RailoRegistration.obstacle = obstacle;
}

public static int getStartStation() {
	return startStation;
}

public static void setStartStation(int startStation) {
	RailoRegistration.startStation = startStation;
}

public static int getStartMonth() {
	return startMonth;
}

public static void setStartMonth(int startMonth) {
	RailoRegistration.startMonth = startMonth;
}


public static int getStartDay() {
	return startDay;
}


public static void setStartDay(int startDay) {
	RailoRegistration.startDay = startDay;
}
   
   
}
