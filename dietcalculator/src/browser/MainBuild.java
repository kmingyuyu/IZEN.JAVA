package browser;


import java.util.ArrayList;

import math.*;

import java.text.*;

import total_info.*;
import utils.Define;

public class MainBuild {
	
//  싱글톤
	static Total total = Total.getTotal();
    
    public final static String TITLE = "--------------------------------다이어트 계산기----------------------------------\n";
    public final static String LINE = "-----------------------------------------------------------------------------\n";
    StringBuilder build = new StringBuilder(); 
    

//   출력하는 메소드
 public String browser () {
	 build.append(MainBuild.LINE);
	 build.append(MainBuild.TITLE);
	 ArrayList<Human> humanlist = total.getHumanList();
	 for(Human human : humanlist) {
		 profile(human);
		 math(human);
		 }
	 build.append(MainBuild.LINE);
	 return build.toString();
	 }
 
//  프로필 메소드
 public void profile (Human human) {
	 build.append(MainBuild.LINE);
	 build.append("\t\t\t\t");
	 build.append(human.getName() + " 님 프로필 ");
	 build.append("\n\n");
	 
 }
 
 
// 측정 메소드
 public void math(Human human) {
	 ArrayList<Stat> statList = human.getStatList();
	 for(int i=0; i<statList.size(); i++) {
		 Stat stat = statList.get(i);
		 build.append(" 성별 : " + human.getGender());
		 build.append(" | 나이 : " + stat.getAge() );
		 build.append(" | 키 : " + stat.getHeight()+ "cm");
		 build.append(" | 몸무게 : " + stat.getWeight() + "kg");
		 build.append(" | 운동강도 : " + human.getExercise());
		 build.append("\n");
		 mathBMI(stat);
		 mathBMR(stat, human);
	 }
 }
// 체질량 측정 메소드
 public void mathBMI(Stat stat) {
	 int BMI;
	 String grade;
	 
	 BodyMassIndex bmi = new BodyMassIndex();
	 BMI = bmi.BMI(stat.getHeight(), stat.getWeight());
	 grade = bmi.gradeBMI(BMI);
	 
	 build.append(" 체질량 지수 : " + BMI  + " -> " + grade);
	 build.append("\n");
 }
 
// 기초대사량 측정 메소드
 public void mathBMR(Stat stat , Human human) {
	 int BMR = 0;
	 if(human.getGenderCode() == Define.MEN) {
		 Basal metabolism = new BasalMan();
		 BMR =  metabolism.BMR(stat.getHeight(), stat.getWeight(), stat.getAge());
		 
	 }else if(human.getGenderCode() == Define.WOMEN) {
		 Basal metabolism = new BasalWoman();
		 BMR =  metabolism.BMR(stat.getHeight(), stat.getWeight(), stat.getAge());
	 }
	 
	 build.append(" 기초 대사량 : " + BMR + " kcal");
	 mathAMR(human ,BMR);
	 
	 
 }
 
 
 // 활동 대사량 측정 메소드
 public void mathAMR(Human human , int BMR) {
	 int AMR;
	 int AMR2;
	 
	 BasalExercise basalExercise = new BasalExercise();
	 AMR = basalExercise.AMR(human.getExerciseCode(), BMR);
	 AMR2 = basalExercise.AMR(human.getExerciseCode(), BMR)-500;
	 build.append(" | 활동 대사량 : " + AMR + " kcal");
	 build.append("\n\n");
	 build.append(" 하루 권장 섭취 칼로리 : " + AMR2 + " kcal");
	 mathCFP(AMR);
	
 	}
 
//  탄수화물/단백질/지방 측정 메소드
 public void mathCFP(int AMR) {
	 String carbohydrate;
	 String fat;
	 String Protein;
	 
	 DecimalFormat d = new DecimalFormat("0.0");
	 Nutrient nutrient = new Nutrient();
	 
	 carbohydrate = d.format(nutrient.carbohydrate(AMR));  
	 fat = d.format(nutrient.fat(AMR));  
	 Protein = d.format(nutrient.protien(AMR));  
	 
	 build.append("\n");
	 build.append(" 하루 권장 영양성분 : ");
	 build.append("탄수화물 : " + carbohydrate + "g");
	 build.append(" | 지방 : " + fat + "g");
	 build.append(" | 단백질 : " + Protein + "g");
	 build.append("\n");
 }
 
 
 
 
 }


 
 






