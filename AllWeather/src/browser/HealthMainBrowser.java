package browser;


import java.util.ArrayList;

import gender_metabolism.*;
import total_info.*;
import utils.Define;

public class HealthMainBrowser {
	
//  싱글톤
	static Total total = Total.getTotal();
    static int BMR;
    static int AMR;

	
public static void main(String[] args) {
	
	
}

 public static void humanInfo() {
//     사람 이름/성별/운동강도 등록
	 Human human1 = new Human("kim" , Define.MEN , Define.TUTORIAL);
	 Human human2 = new Human("park" , Define.MEN , Define.NORMAL);
	 Human human3 = new Human("li" , Define.MEN , Define.HARD);
	 
	 Human human4 = new Human("yun" , Define.WOMEN , Define.EASY);
	 Human human5 = new Human("kang" , Define.WOMEN , Define.HARD);
	 Human human6 = new Human("hwa" , Define.WOMEN , Define.NORMAL);
	 
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
 
 
 public static void browser () {
	 ArrayList<Human> humanlist = total.getHumanList();
	 for(Human human : humanlist) {
		 mathBMR(human);
	 }
	 
	 }
 
 
// 기초 대사량 측정 / 운동 대사량 측정
 public static void mathBMR(Human human) {
	 ArrayList<Stat> statList = human.getStatList();
	 for(int i=0; i<statList.size(); i++) {
		 Stat stat = statList.get(i);
		 
		 if(human.getGender() == Define.MEN) {
			 Metabolism metabolism = new BasalMan();
			 BMR =  metabolism.BMR(stat.getHeight(), stat.getWeight(), stat.getAge());
			 AMR =  metabolism.AMR(human.getExercise(), BMR);
			 
		 }else if(human.getGender() == Define.WOMEN) {
			 Metabolism metabolism = new BasalWoman();
			 BMR =  metabolism.BMR(stat.getHeight(), stat.getWeight(), stat.getAge());
			 AMR =  metabolism.AMR(human.getExercise(), BMR);
		 }
		 
	 }
	 	
 }
 
 
 public static void basal() {
 }
 
 
 }
 
 






