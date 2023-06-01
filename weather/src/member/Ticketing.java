package member;

import java.time.format.DateTimeFormatter;
import java.util.*;
import movie_info.*;
import utils.Define;


public class Ticketing {
	static CGV cgv = CGV.getTotal();
	Scanner scanner = new Scanner(System.in);
	Person_Ticket_Info ticketing = new Person_Ticket_Info();
	
	String E_HH_mm = "MM-dd일 <E> : HH:mm";
	String MM_dd = "MM-dd일 <E> ";
	String HH_mm = "HH:mm";
	DateTimeFormatter E_HH_mm_format = DateTimeFormatter.ofPattern(E_HH_mm);
	DateTimeFormatter MM_dd_format = DateTimeFormatter.ofPattern(MM_dd);
	DateTimeFormatter HH_mm_format = DateTimeFormatter.ofPattern(HH_mm);
	
	
	
	String menu ; // 스캐너 입력객체
	int num ; // 입력 객체
	public int ticketing() {
		System.out.println("--------------------예매를 진행합니다 ---------------------");
		Time();
		people();
		Seat ();
		System.out.println(" * 완료 되었습니다 * ");
		System.out.println("--------------------------------------------------");
		ArrayList<Movie_Default_Info> default_Movie = cgv.getMovieTemp();
		Movie_Default_Info def = default_Movie.get(0);
		Movie_Detail_Info det = def.getMovie_Detail().get(0);
		System.out.println("\t[ " + def.getTitle() + " ] " + "("+ det.getAgeGroup() + " 세)");
	 	System.out.println("  개봉날짜: " + det.getOpeningdate() + " | 상영시간: " + det.getRunningTime() + "분" );
	 	System.out.println("  장르: " + def.getGenre() + " | " + "국가: " + def.getCountry());
	 	System.out.println("--------------------------------------------------");
	 	System.out.println("  시간: " + ticketing.getTime().format(MM_dd_format) + " " + ticketing.getTime().format(HH_mm_format) + " ~ " +
	 					   ticketing.getTime().plusMinutes(det.getRunningTime()).format(HH_mm_format));
	 	System.out.println("  인원수: " + ticketing.getPeople() );
	 	System.out.println("  "+ticketing.getCenema()+"관: " + ticketing.getSeat1() + "열 " + ticketing.getSeat2() + "번");
	 	System.out.println("--------------------------------------------------");
	 	System.out.println(" * 입력된 정보가 맞습니까? ( Y / N ) ");
	 	while(true) {
	 		menu = scanner.next();
	 		switch (menu) {
			case "y" , "Y": 
				System.out.println(" * 예매 완료 되었습니다 * ");
				return Define.MOVIEMENU;
			case "n" , "N": 
				System.out.println(" * 처음화면 으로 이동합니다 * ");
				return Define.MOVIEMENU;
			default : System.err.println(" * 잘못 입력하셨습니다 다시 입력해주세요 *");			
				}
	 		
	 	}
	}
	
	
	
	public void Time() {
		System.out.println(" 날짜를 선택해주세요 ");
		ArrayList<Movie_Default_Info> def = cgv.getMovieTemp();
		Movie_Detail_Info det = def.get(0).getMovie_Detail().get(0);
		for(int i=0 , y=1; i<det.getMovieSchedule().length; i++ , y++) {
			System.out.println("-----------------------------------");
			System.out.println("< " + y + " > "+det.getMovieSchedule()[i].format(E_HH_mm_format));
		}
		System.out.println("-----------------------------------");
		while(true) {
			num = scanner.nextInt();
			if(det.getMovieSchedule().length < num) {
				System.err.println("* 없는 날짜입니다 다시 입력해주세요 *");
			}
			else if(det.getMovieSchedule().length >= num){
				ticketing.setTime(det.getMovieSchedule()[num-1]);
				break;
			}
			else {
				System.err.println(" * 잘못 입력하셨습니다 다시 입력해주세요 *");
			}
		}
	
}

	public void people() {
		System.out.println(" 인원 수를 입력해주세요 ");
		while(true) {
			num = scanner.nextInt();
			if(num >= 5) {
				System.err.println(" * 5명 이상 예매할수 없습니다 다시 입력해주세요 *");
			}
			else {
				ticketing.setPeople(num);
				break ;}
		}
	}
	
//	아직안함
	public int Seat () {
		while(true) {
			System.out.println(" |1> 일반관|2> IMAX|3> 3D|");
			menu = scanner.next();
			switch (menu) {
			case "1":
				
				return Define.INFOMENU;
			case "2":
				return Define.LOGOUT;
			case "3":  return Define.MOVIEMENU;   
			default : System.err.println(" * 잘못 입력하셨습니다 다시 입력해주세요 *");			
				}
		}
	}
	
	
	
	
}
	
	
	