package metabolism;


public class BasalWoman implements Basal {

	@Override
//	여성: 447.6 + (9.25 × 몸무게) ＋ (3.1 × 키) – (4.33 × 나이)
	public int BMR(int height, int weight, int age) {
		int BMR = (int) (447.6 + (9.25 * weight ) + (3.1 * height) - (4.33 * age));
		return  BMR;
		
	}


	
	
	
	
}
