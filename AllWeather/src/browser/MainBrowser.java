package browser;

import total_info.Human;
import total_info.Stat;
import total_info.Total;
import utils.Define;

public class MainBrowser {
	
//	싱글톤
	static Total total = Total.getTotal();

	public static void main(String[] args) {	
		HealthMainBuild test = new HealthMainBuild();
		humanInfo();
		String browser = test.browser();
		
//		 console 출력
		System.out.println(browser);
	}

	
	
//	정보 저장 메소드
	public static void humanInfo() {
//	     사람 이름/성별/운동강도 등록"
		 Human human1 = new Human("kim" , "남성", Define.MEN ,"가벼운 운동 (주 1-3)" , Define.EASY);
		 Human human2 = new Human("park" , "남성", Define.MEN ,"가벼운 운동 (주 1-3)" ,Define.NORMAL);
		 Human human3 = new Human("li" , "남성", Define.MEN ,"적극적 운동 (주 6-7)" , Define.HARD);
		 
		 Human human4 = new Human("yun" , "여성", Define.WOMEN , "거의운동X" , Define.TUTORIAL);
		 Human human5 = new Human("kang" , "여성", Define.WOMEN , "적극적 운동 (주 6-7)" , Define.HARD);
		 Human human6 = new Human("hwa" , "여성",Define.WOMEN , "보통 수준(주 3-5)" , Define.NORMAL);
		 
//		   사람마다 키/몸무게/나이 등록
		 human1.inputStatList(new Stat(170 , 65 , 25));
		 human2.inputStatList(new Stat(178 , 88 , 20));
		 human3.inputStatList(new Stat(180 , 100 , 30));
		 
		 human4.inputStatList(new Stat(158 , 50 , 25));
		 human5.inputStatList(new Stat(165 , 65 , 22));
		 human6.inputStatList(new Stat(160 , 52 , 30));
		 
//		   싱글톤에 human 1~6 등록
		 total.inputHumanList(human1);
		 total.inputHumanList(human2);
		 total.inputHumanList(human3);
		 total.inputHumanList(human4);
		 total.inputHumanList(human5);
		 total.inputHumanList(human6);

	}
}