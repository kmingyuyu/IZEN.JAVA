package movie_info;

import java.util.*;

public class CGV {
//	 싱글톤
    private static CGV instance = new CGV();
    
    private boolean login = true  ; //로그인 상태
    private String temp_ID = "sky2" ; // 아이디 확인
    
//  CGV에 영화 정보들을 넣어준다.
  
  private Map<Movie_Default_Info, Movie_Detail_Info> movieList =new LinkedHashMap<>();
  private Map<String, Person_Info> personList =new HashMap<>();
	
//싱글톤 생성자
  private CGV() {}
  
	
//싱글톤 메소드
  public static CGV getTotal() {
 	 if (instance == null) {
			instance = new CGV();
		}
		return instance;
	 }
    
    
	
    public void put_MovieList (Movie_Default_Info movie_Default_Info , Movie_Detail_Info movie_Detail_Info) {
    	movieList.put(movie_Default_Info , movie_Detail_Info );
	}
    public void put_personList (String ID , Person_Info person_Info) {
    	personList.put(ID , person_Info);
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


	



	public Map<Movie_Default_Info, Movie_Detail_Info> getMovieList() {
		return movieList;
	}


	public void setMovieList(Map<Movie_Default_Info, Movie_Detail_Info> movieList) {
		this.movieList = movieList;
	}


	public Map<String, Person_Info> getPersonList() {
		return personList;
	}


	public void setPersonList(Map<String, Person_Info> personList) {
		this.personList = personList;
	}






	
    


  
    
    
    
}

