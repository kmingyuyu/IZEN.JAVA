package total_info;

import java.util.ArrayList;


public class Human {
   private String name ; // 등록자 성
   private int gender; // 성별
   private int exercise ; //운동강도
   
   private ArrayList<Stat> statList = new ArrayList<>(); // stat 넣어줌
   
   
   public Human(String name, int gender , int exercise ) {
	   this.name = name;
	   this.gender = gender;
	   this.exercise = exercise;
   }
   
   public void inputStatList(Stat stat) {
	   statList.add(stat);
   }

   
   
// get/set
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getGender() {
	return gender;
}

public void setGender(int gender) {
	this.gender = gender;
}

public int getExercise() {
	return exercise;
}

public void setExercise(int exercise) {
	this.exercise = exercise;
}

public ArrayList<Stat> getStatList() {
	return statList;
}

public void setStatList(ArrayList<Stat> statList) {
	this.statList = statList;
}
   
   
   
   
}
