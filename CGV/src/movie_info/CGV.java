package movie_info;

import java.util.*;
public class CGV {
//	 싱글톤
    private static CGV instance = new CGV();
    
    private boolean login = false ; //로그인 상태 (기본값:false) : 회원가입 이나 로그인시  true
    private String temp_ID ; // 아이디 확인
    
  
//  CGV에 상영중인 영화 정보들을 넣어준다. :ArrayList
  private ArrayList<Movie_Default_Info> movieList = new ArrayList<>(); 
  
//	CGV에  개봉예정 영화 정보들을 넣어준다. :ArrayList
  private ArrayList<Movie_Default_Info> commingsoonList = new ArrayList<>(); 

//	CGV에 회원 정보들을 넣어준다. :Map  
  private Map<String, Person_Info> personList =new HashMap<>();
  
//  회원들의 예매 목록 : map
  private Map<Object, Person_Ticket_Info> ticketingList =new HashMap<>();
  
	
//싱글톤 생성자
  private CGV() {}
  
//싱글톤 메소드
  public static CGV getTotal() {
	  if (instance == null) {
		  instance = new CGV();
	  }
	  return instance;
  }
  
  
 


//상영중인 영화를 담는다.
  public void addmovieList(Movie_Default_Info movie_Default_Info) {
	  movieList.add(movie_Default_Info);
  }
  
//개봉예정인 영화를 담는다.
  public void addcommingsoonList(Movie_Default_Info movie_Default_Info) {
	  commingsoonList.add(movie_Default_Info);
  }
	
// 회원들의 정보를 담는다.
  public void put_personList (String ID , Person_Info person_Info) {
	  personList.put(ID , person_Info);
  }
  
// 회원들의 예매정보를 담는다.
  public void put_ticketingList (Object ID ,  Person_Ticket_Info ticket) {
	  ticketingList.put(ID , ticket);
  }
  
  
  public Map<Object, Person_Ticket_Info> getTicketingList() {
	  return ticketingList;
  }

public ArrayList<Movie_Default_Info> getMovieList() {
	  return movieList;
  }
    
    
    public boolean isLogin() {
		return login;
	}


	public void setLogin(boolean login) {
		this.login = login;
	}


	public String getTemp_ID() {
		return temp_ID;
	}


	public void setTemp_ID(String temp_ID) {
		this.temp_ID = temp_ID;
	}


	public Map<String, Person_Info> getPersonList() {
		return personList;
	}

	public ArrayList<Movie_Default_Info> getCommingsoonList() {
		return commingsoonList;
	}


	


 


	
    


  
    
    
    
}

