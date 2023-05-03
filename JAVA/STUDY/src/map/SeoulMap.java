package map;

public class SeoulMap {
     int distance; // 거리
     String weather ; // 날씨
    private String dayweek ; // 요일
    private int time ; // 시간
    
    public SeoulMap() {}
    
    public SeoulMap(String dayweek , int time) {
    	this.dayweek =  dayweek;
    	this.time =  time;
    	distanceDefault();
    	distanceCal ();
    }
    
    public void distanceDefault () {
    	distance = 40;
    }
    
    public int distanceCal () {
    	if(dayweek != "금요일" && dayweek != "토요일" && dayweek != "일요일") {
    		if((time < 20 && time > 17)&&(time < 9 && time > 7)) {
    			distance += 50;
    		}
    	}
    	if(dayweek == "금요일" && dayweek == "토요일" && dayweek == "일요일") {
    		distance += 30;
    		if((time < 20 && time > 17)&&(time < 9 && time > 7)) {
    			distance += 50;
    		}
    	}
    	return distance;
    }
    
    
    public void browser() {
    	System.out.println("거리 : " + distance + "날씨 : " + weather  );
    }
    
    
    

	public String getDayweek() {
		return dayweek;
	}

	public void setDayweek(String dayweek) {
		this.dayweek = dayweek;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

    
    
    
}


