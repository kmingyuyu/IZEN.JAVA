package ch05.sec10;

public class AdvancedForExample {

	public static void main(String[] args) {
          
		
		int[] scores = {95,71,84,93,87};
//		평균점수 구하기
		int sum=0;
		for(int score : scores) {
			sum += score;
			System.out.println(score);
		}
		
		double avg = (double) sum/scores.length;
		System.out.println("평균: " + avg);
	}

}
