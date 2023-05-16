package total_info;

import java.util.ArrayList;


public class Human {
   private String name ; // 등록자 성
   private String gender; // 성별
   private int genderCode; //성별 코드
   private String exercise ; //운동강도
   private int exerciseCode; //운동강도 코드
   
   private ArrayList<Stat> statList = new ArrayList<>(); // stat 넣어줌
   
   
   public Human(String name, String gender , int genderCode , String exercise , int exerciseCode ) {
	   this.name = name;
	   this.gender = gender;
	   this.exercise = exercise;
	   this.exerciseCode = exerciseCode;
	   this.genderCode = genderCode;
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

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}

public int getGenderCode() {
	return genderCode;
}

public void setGenderCode(int genderCode) {
	this.genderCode = genderCode;
}

public String getExercise() {
	return exercise;
}

public void setExercise(String exercise) {
	this.exercise = exercise;
}

public int getExerciseCode() {
	return exerciseCode;
}

public void setExerciseCode(int exerciseCode) {
	this.exerciseCode = exerciseCode;
}

public ArrayList<Stat> getStatList() {
	return statList;
}

public void setStatList(ArrayList<Stat> statList) {
	this.statList = statList;
}

   
   

   
   
   
}
