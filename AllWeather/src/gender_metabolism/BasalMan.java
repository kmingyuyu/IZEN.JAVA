package gender_metabolism;


public class BasalMan implements Metabolism{

	@Override
	public int BMR(int height, int weight, int age) {
		int BMR = (int) (88.4 + (13.4 * weight ) + (4.8 * height) - (5.68 * age));
		return  BMR;
		
	}

	@Override
	public int AMR(int exercise , int BMR) {
		
		
		return 0;
	}

	
//	남성: 88.4 ＋ (13.4 × 몸무게) ＋ (4.8 × 키) – (5.68 × 나이)
	

}
