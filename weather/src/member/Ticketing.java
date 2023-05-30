package member;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;

import movie_info.*;
import utils.Define;


public class Ticketing {
	static CGV cgv = CGV.getTotal();
	Scanner scanner = new Scanner(System.in);
	
	LocalDate n = LocalDate.now();
	String menu ; // 스캐너 입력객체
	
	String E = "< E > MM-dd일";
	String HH_mm = " HH:mm";
	String E_HH_mm = "MM-dd일 <E> \t HH:mm";
	DateTimeFormatter E_format = DateTimeFormatter.ofPattern(E);
	DateTimeFormatter HH_mm_format = DateTimeFormatter.ofPattern(HH_mm);
	DateTimeFormatter E_HH_mm_format = DateTimeFormatter.ofPattern(E_HH_mm);

	
	public int movieTimeChoice() {
		int value = cgv.getTemp_Movie().get(cgv.getTemp_ID());
		System.out.println("--------------------예매를 진행합니다 ---------------------");
		System.out.println(" 날짜를 선택해주세요 ");
		ArrayList<Movie_Default_Info> defaultList= cgv.getMovieList();
		for(Movie_Default_Info Defalut : defaultList) {
			ArrayList<Movie_Detail_Info> movieDetail = Defalut.getMovie_DetaillList();
			for(int i=0 ; i<movieDetail.size(); i++  ) {
				Movie_Detail_Info detail = movieDetail.get(value);
				moiveList(detail);
			}
		
			
		
		}
		return Define.MEMBER_BROWSER;
	
}
	public void moiveList(Movie_Detail_Info detail ) {
		for(int y=0; y<detail.getMovieSchedule().length; y++) {
			System.out.println(detail.getMovieSchedule()[y].format(E_HH_mm_format));
		}
}

	public int movieSeat () {
		while(true) {
			System.out.println(" |1> 일반관|2> IMAX|3> 3D|");
			menu = scanner.next();
			switch (menu) {
			case "1":  return Define.INFOMENU;
			case "2":  return Define.LOGOUT;
			case "3":  return Define.MOVIEMENU;   
			default : System.err.println("잘못 입력하셨습니다");			
				}
		}
	}
	
	
	
	
}
	
	
	