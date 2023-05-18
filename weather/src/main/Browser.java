package main;

import java.util.Calendar;

import movie_info.*;

public class Browser {

	public static void main(String[] args) {

	}
	
	Calendar today = Calendar.getInstance();
	int md = today.get(Calendar.DATE);
	
	int[] arrayTime = {1300 , 1600 , 1925 , 2230}; 
	
	
	DayInfo dayInfo = new DayInfo(md ,arrayTime);
	
	
	public void inputInfo() {
//  각 영화별로 영화 기본정보 / 상세정보 값 넣어줌
//	DefaultInfo 클래스에 제목 장르 국가 값 넣어줌
//	DetailInfo 클래스에 영화세부정보 예매율 상영시간 개봉날짜 연령 값 넣어줌
		
	DefaultInfo defaultInfo1 = new DefaultInfo("분노의 질주-라이드 오어 다이" , "액션" , "미국");
	DetailInfo detailInfo1 = new DetailInfo(43.4 , 141 , 20230517 , 15);
	
	DefaultInfo defaultInfo2 = new DefaultInfo("범죄도시" , "범죄,액션" , "한국");
	DetailInfo detailInfo2 = new DetailInfo(15.6 , 105 , 20230531 , 15);
	
	DefaultInfo defaultInfo3 = new DefaultInfo("가디언즈 오브 갤럭시-Volume 3" , "액션" , "미국");
	DetailInfo detailInfo3 = new DetailInfo(14.9 , 150 , 20230503 , 12);
	
	}
	
	
	
}
