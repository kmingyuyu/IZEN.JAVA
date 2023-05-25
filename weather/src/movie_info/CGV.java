package movie_info;

import java.util.ArrayList;

public class CGV {
//	 싱글톤
    private static CGV instance = new CGV();
    
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

