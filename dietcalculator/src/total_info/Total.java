package total_info;

import java.util.ArrayList;

public class Total {
//	 싱글톤
     private static Total instance = new Total();
     
     private ArrayList<Human> humanList = new ArrayList<> ();
	
//   싱글톤 생성자
     private Total() {}
     
	
//   싱글톤 메소드
     public static Total getTotal() {
    	 if (instance == null) {
 			instance = new Total();
 		}
 		return instance;
 	 }
     
	
//    humanList 에 넣어주는 메소드
     public void inputHumanList (Human human) {
    	 humanList.add(human);
     }


     
//     get/set
	public ArrayList<Human> getHumanList() {
		return humanList;
	}

	public void setHumanList(ArrayList<Human> humanList) {
		this.humanList = humanList;
	}
     
     
     
     
}
