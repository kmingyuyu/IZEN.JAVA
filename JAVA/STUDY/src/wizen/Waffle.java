package wizen;

public class Waffle {

		double doughAmount = 100; //반죽량(kg)
		double creamAmout = 100;  //생크림 양(kg)
		String[] jam; //잼
		int sweet; //단맛 정도(1~10)
		int salt;  //짠만 정도(1~10)

		//생성자
		Waffle(String[] jam, int sweet, int salt) {
			this.jam = jam;
			this.salt = salt;
			this.sweet = sweet;
		}
		
		//단맛 추가
		void sweetAdd() {
			
		}
		
		//짠맛 추가
		void saltAdd() {
			
		}
		
		//와플 굽기 
		void run(int count) {
			//와플하나 굽는데 0.1kg 만큼의 반죽 소모
			//와플하나 굽는데 0.05kg 만큼의 크림 소모
			doughAmount = doughAmount - (0.1 * count); 
			creamAmout = creamAmout - (0.05 * count); 
			
			System.out.println("와플이" + count + "개 나왔습니다!");
			System.out.println("남은 반죽량:" + doughAmount);
			System.out.println("남은 생크림량:" + creamAmout);
		}
	}

