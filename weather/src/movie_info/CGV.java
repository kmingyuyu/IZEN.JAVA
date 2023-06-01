package movie_info;

import java.util.*;

public class CGV {
//	 싱글톤
    private static CGV instance = new CGV();
    
    private boolean login = false  ; //로그인 상태
    private String temp_ID  ; // 아이디 확인
    
  
//  CGV에 영화 정보들을 넣어준다. :ArrayList
  private ArrayList<Movie_Default_Info> movieList = new ArrayList<>();  
//	CGV에 회원 정보들을 넣어준다. :Map  
  private Map<String, Person_Info> personList =new HashMap<>();
  
  private ArrayList<Movie_Default_Info> movieTemp =new ArrayList<>();
	
//싱글톤 생성자
  private CGV() {}
  
//싱글톤 메소드
  public static CGV getTotal() {
	  if (instance == null) {
		  instance = new CGV();
	  }
	  return instance;
  }
  
  
  public ArrayList<Movie_Default_Info> getMovieTemp() {
	return movieTemp;
}

//영화의 상세정보를 담는다
  public void addmovieList(Movie_Default_Info movie_Default_Info) {
	  movieList.add(movie_Default_Info);
  }
//  선택된 영화의 임시정보
  public void addmovieTemp(Movie_Default_Info movie_Default_Info) {
	  movieTemp.add(movie_Default_Info);
  }
	

  public void put_personList (String ID , Person_Info person_Info) {
	personList.put(ID , person_Info);
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








	
    


  
    
    
    
}

