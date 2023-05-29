package movie_info;

import java.util.ArrayList;
import java.util.HashMap;

public class CGV {
//	 싱글톤
    private static CGV instance = new CGV();
    
    private boolean login = false  ; //로그인 상태
    private String temp_ID  ; // 아이디 확인
    
    HashMap<String , Integer> temp_Movie = new HashMap<>(); // 예매번호 /  받은 영화
	
    public void putTemp_Movie (String ID , int num) {
		temp_Movie.put(ID , num);
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



	public HashMap<String, Integer> getTemp_Movie() {
		return temp_Movie;
	}

	public void setTemp_Movie(HashMap<String, Integer> temp_Movie) {
		this.temp_Movie = temp_Movie;
	}



	//    CGV에 영화 정보들을 넣어준다.
    private ArrayList<Movie_Default_Info> movieList = new ArrayList<> ();
    private ArrayList<Person_Info> personList = new ArrayList<> ();
    
	
//  싱글톤 생성자
    private CGV() {}
    
	
//  싱글톤 메소드
    public static CGV getTotal() {
   	 if (instance == null) {
			instance = new CGV();
		}
		return instance;
	 }
    


	//    영화정보를 담는 메소드
    public void addMovieList (Movie_Default_Info defaultInfo) {
    	movieList.add(defaultInfo);
    }  
    
//    회원정보를 담는 메소드
  public void addPersonList (Person_Info person_Info) {
	  personList.add(person_Info);
  }


public ArrayList<Movie_Default_Info> getMovieList() {
	return movieList;
}

public ArrayList<Person_Info> getPersonList() {
	return personList;
}


  
    
    
    
}

