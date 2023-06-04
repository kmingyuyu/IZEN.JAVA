package member;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import movie_info.*;
import utils.Define;
import seat.*;

public class Ticketing {
	static CGV cgv = CGV.getTotal();
	Scanner scanner = new Scanner(System.in);

	String E_HH_mm = "MM-dd일 <E> : HH:mm";
	String MM_dd = "MM-dd일 <E> ";
	String HH_mm = "HH:mm";
	DateTimeFormatter E_HH_mm_format = DateTimeFormatter.ofPattern(E_HH_mm);
	DateTimeFormatter MM_dd_format = DateTimeFormatter.ofPattern(MM_dd);
	DateTimeFormatter HH_mm_format = DateTimeFormatter.ofPattern(HH_mm);

	String menu; // 스캐너 입력객체
	int num; // 입력 객체
	
//	예매시작
	public int ticketing(Person_Ticket_Info ticketing) {
		System.out.println("--------------------예매를 진행합니다 ---------------------");
		Time(ticketing);
		Seat(ticketing);
		System.out.println(" * 완료 되었습니다 * ");
		System.out.println("--------------------------------------------------");
		ArrayList<Movie_Default_Info> default_Movie = ticketing.getMovieList();
		Movie_Default_Info def = default_Movie.get(0);
		Movie_Detail_Info det = def.getMovie_Detail().get(0);
		System.out.println("\t[ " + def.getTitle() + " ] " + "(" + det.getAgeGroup() + " 세)");
		System.out.println("  개봉날짜: " + det.getOpeningdate() + " | 상영시간: " + det.getRunningTime() + "분");
		System.out.println("  장르: " + def.getGenre() + " | " + "국가: " + def.getCountry());
		System.out.println("--------------------------------------------------");
		System.out.println(
				"  시간: " + ticketing.getTime().format(MM_dd_format) + " " + ticketing.getTime().format(HH_mm_format)
						+ " ~ " + ticketing.getTime().plusMinutes(det.getRunningTime()).format(HH_mm_format));
		System.out.println(
				"  " + ticketing.getCenema() + "관: " + ticketing.getSeat1() + "열 " + ticketing.getSeat2() + "번");
		System.out.println("--------------------------------------------------");
		System.out.println(" * 입력된 정보가 맞습니까? ( Y / N ) ");
		while (true) {
			menu = scanner.next();
			switch (menu) {
			case "y", "Y":
				System.out.println(" * 예매 완료 되었습니다 * ");
			Map<Object, Person_Ticket_Info> ticket =  cgv.getTicketingList();
			for(int num=0; num<=ticket.size(); num++) {
				if(!ticket.containsKey(cgv.getTemp_ID() + num)) {
			     cgv.put_ticketingList(cgv.getTemp_ID() + num, ticketing);
			     break;
				}
			}
				return Define.MOVIEMENU;
			case "n", "N":
				System.out.println(" * 처음화면 으로 이동합니다 * ");
				return Define.MOVIEMENU;
			default:
				System.err.println(" * 잘못 입력하셨습니다 다시 입력해주세요 *");
			}

		}
	}
	
//	날짜선택 
	public void Time(Person_Ticket_Info ticketing) {
		LocalDateTime newt = LocalDateTime.now();
		System.out.println(" 날짜를 선택해주세요 ");
		ArrayList<Movie_Default_Info> def = ticketing.getMovieList();
		Movie_Detail_Info det = def.get(0).getMovie_Detail().get(0);
		for (int i = 0, y = 1; i < det.getMovieSchedule().length; i++, y++) {
				System.out.println("-----------------------------------");
				System.out.println("< " + y + " > " + det.getMovieSchedule()[i].format(E_HH_mm_format));
		}
		System.out.println("-----------------------------------");
		while (true) {
			num = scanner.nextInt();
			 if (det.getMovieSchedule().length < num) {
				System.err.println("* 없는 날짜입니다 다시 입력해주세요 *");
			 }else if (newt.isAfter(det.getMovieSchedule()[num-1])) {
				System.out.println(" * 끝난 상영시간입니다 다시 입력해주세요  *");
				}
			 else if (det.getMovieSchedule().length >= num) {
				ticketing.setTime(det.getMovieSchedule()[num - 1]);
				break;
			} else {
				System.err.println(" * 잘못 입력하셨습니다 다시 입력해주세요 *");
			}
		}

	}

//	좌석선택
	public void Seat(Person_Ticket_Info ticketing) {
		Default_Seat seat = new Default_Seat();
		while (true) {
			System.out.println(" |1> 일반관|2> IMAX|3> 3D|");
			menu = scanner.next();
			if (menu.equals("1")) {
				seat.screen();
				seat.seat1(ticketing);
				seat.seat2(ticketing);
				break;
			} else if (menu.equals("2")) {
				seat = new Imax_Seat();
				ticketing.setCenema("IMAX");
				seat.screen();
				seat.seat1(ticketing);
				seat.seat2(ticketing);
				break;
			} else if (menu.equals("3")) {
				seat = new ThreeD_Seat();
				ticketing.setCenema("3D");
				seat.screen();
				seat.seat1(ticketing);
				seat.seat2(ticketing);
				break;
			} else {
				System.err.println(" * 잘못 입력하셨습니다 다시 입력해주세요 *");
			}
		}
	}
}
