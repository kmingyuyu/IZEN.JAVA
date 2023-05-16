package browser;


import java.util.ArrayList;

import metabolism.*;
import total_info.*;
import utils.Define;

public class HealthMainBuild {
	
//  싱글톤
	static Total total = Total.getTotal();
	
    static int BMR;
    static int AMR;
    static int BMI;
    static String grade;
    
    public final static String TITLE = "-----------------기초/활동대사량 계산기--------------------\n";
    public final static String LINE = "-----------------------------------------------------\n";
    StringBuilder build = new StringBuilder(); 
    

//   출력하는 메소드
 public String browser () {
	 build.append(HealthMainBuild.LINE);
	 build.append(HealthMainBuild.TITLE);
	 ArrayList<Human> humanlist = total.getHumanList();
	 for(Human human : humanlist) {
		 body(human);
		 mathBMR(human);
		 mathAMR(human,BMR);
		 }
	 build.append(HealthMainBuild.LINE);
	 return build.toString();
	 }
 
//  몸통 메소드
 public void body (Human human) {
	 build.append(HealthMainBuild.LINE);
	 build.append("                  " + human.getName());
	 build.append(" 님 프로필 \n ");
	 build.append(" 성별 : " + human.getGender());
	 build.append(" | 운동강도 : " + human.getExercise());
 }
 
 
// 기초 대사량 측정 메소드
 public void mathBMR(Human human) {
	 ArrayList<Stat> statList = human.getStatList();
	 for(int i=0; i<statList.size(); i++) {
		 Stat stat = statList.get(i);
		 
		 mathBMI(stat);
		 
		 if(human.getGenderCode() == Define.MEN) {
			 Basal metabolism = new BasalMan();
			 BMR =  metabolism.BMR(stat.getHeight(), stat.getWeight(), stat.getAge());
			 
		 }else if(human.getGenderCode() == Define.WOMEN) {
			 Basal metabolism = new BasalWoman();
			 BMR =  metabolism.BMR(stat.getHeight(), stat.getWeight(), stat.getAge());
		 }
		 build.append("    | 키 : " + stat.getHeight());
		 build.append(" | 몸무게 : " + stat.getWeight());
		 build.append(" | 나이 : " + stat.getAge());
		 build.append("\n");
		 build.append("  기초 대사량 :  " + BMR);
		 build.append("  | 활동 대사량 : " + AMR);
		 build.append("  | 체지방율 :  " + BMI + "       " + grade);
		 build.append("\n");
	 }
 }
 
 
 // 활동 대사량 측정 메소드
 public void mathAMR(Human human , int BMR) {
	 BasalExercise basalExercise = new BasalExercise();
	 AMR = basalExercise.AMR(human.getExerciseCode(), BMR);
	
 	}
 
// 체지방율 계산 메소드
 public void mathBMI(Stat stat) {
	 BodyMassIndex bmi = new BodyMassIndex();
	 BMI = bmi.BMI(stat.getHeight(), stat.getWeight());
	 grade = bmi.gradeBMI(BMI);
 }
 
 
 
 }


 
 






