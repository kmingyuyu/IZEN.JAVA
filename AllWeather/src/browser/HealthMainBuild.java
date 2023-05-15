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
    
    
    public final static String TITLE = "-----------------기초/활동대사량 계산기-------------------\n";
    public final static String LINE = "-----------------------------------------------------\n";
    StringBuilder build = new StringBuilder(); 
    
    
	

 public static void humanInfo() {
//     사람 이름/성별/운동강도 등록
	 Human human1 = new Human("kim" , "남성" , Define.MEN , "거의운동X" , Define.TUTORIAL);
	 Human human2 = new Human("park" , "남성"  ,Define.MEN , "가벼운 운동 (주 1-3)" ,Define.NORMAL);
	 Human human3 = new Human("li" , "남성" ,  Define.MEN , "적극적 운동 (주 6-7)" , Define.HARD);
	 
	 Human human4 = new Human("yun" , "여성" , Define.WOMEN , "가벼운 운동 (주 1-3)" , Define.EASY);
	 Human human5 = new Human("kang" , "여성" , Define.WOMEN , "적극적 운동 (주 6-7)" , Define.HARD);
	 Human human6 = new Human("hwa" , "여성" ,Define.WOMEN , "보통 수준(주 3-5)" , Define.NORMAL);
	 
//	   사람마다 키/몸무게/나이 등록
	 human1.inputStatList(new Stat(170 , 65 , 25));
	 human2.inputStatList(new Stat(178 , 88 , 20));
	 human3.inputStatList(new Stat(180 , 100 , 30));
	 
	 human4.inputStatList(new Stat(158 , 50 , 25));
	 human5.inputStatList(new Stat(165 , 65 , 22));
	 human6.inputStatList(new Stat(160 , 52 , 30));
	 
//	   싱글톤에 human 1~6 등록
	 total.inputHumanList(human1);
	 total.inputHumanList(human2);
	 total.inputHumanList(human3);
	 total.inputHumanList(human4);
	 total.inputHumanList(human5);
	 total.inputHumanList(human6);
	 
 }
 
 public static void main(String[] args) {	
	 HealthMainBuild test = new HealthMainBuild();
	 String ts = test.browser();
	 System.out.println(ts);
	 
 }
 public String browser () {
	 build.append(HealthMainBuild.TITLE);
	 humanInfo();
	 ArrayList<Human> humanlist = total.getHumanList();
	 for(Human human : humanlist) {
		 body(human);
//		 mathBMR(human);
//		 mathAMR(human , BMR);
		 
	 }
	 
	 return build.toString();
	 }
 
 
 public void body (Human human) {
	 build.append(HealthMainBuild.LINE);
	 build.append("             " + human.getName());
	 build.append(" 님 프로필 \n ");
	 build.append(" | 성별 : ");
	 build.append(human.getGender());
	 build.append(" | 운동강도 : ");
	 build.append(human.getExercise());
	 build.append(" | \n");
	 
	 
 }
 
 
 
 
 
 
 
 
 
 
 
// 기초 대사량 측정  
 public static void mathBMR(Human human) {
	 ArrayList<Stat> statList = human.getStatList();
	 for(int i=0; i<statList.size(); i++) {
		 Stat stat = statList.get(i);
		 
		 if(human.getGenderCode() == Define.MEN) {
			 Basal metabolism = new BasalMan();
			 BMR =  metabolism.BMR(stat.getHeight(), stat.getWeight(), stat.getAge());
			 
		 }else if(human.getGenderCode() == Define.WOMEN) {
			 Basal metabolism = new BasalWoman();
			 BMR =  metabolism.BMR(stat.getHeight(), stat.getWeight(), stat.getAge());
		 }
		 
	 }
	 	
 }
 
 // 운동 대사량 측정
 public static void mathAMR(Human human , int BMR) {
	 BasalExercise basalExercise = new BasalExercise();
	 AMR = basalExercise.AMR(human.getExerciseCode(), BMR);
	 
 }
 
 
 }
 
 






