package quiz0426;

public class KORAIL {

 int totalTime = 324  ; //서울에서 부산까지 거리
 int timeRestArea = 200 ; //서울에서 휴계소 까지 거리
 double totalDistance = 332.25 ;

	
	
	int time(int x) { //출발 지점에서 도착까지 남은시간
		int result = this.totalTime - x;
		System.out.println("서울->부산도착까지 남은 시간 : " + result/60 + "시간" + result%60+ "분");
		return result;
	}
	
	int timeSecond (int x) { //출발지점에서 휴계소도착까지 남은시간
		int result = x - this.timeRestArea ;
		System.out.println("서울->휴계소도착까지 남은 시간 : " + result/60 + "시간" + result%60+ "분");
		return result;

	}
	
	
	double distance (int x)  {
		
    double result = this.totalDistance - x;
    System.out.println("도착까지 남은 거리 : " + result);
		return result;
	}
}

    

