package metabolism;


public class BasalMan implements Basal{

	@Override
//	남성: 88.4 ＋ (13.4 × 몸무게) ＋ (4.8 × 키) – (5.68 × 나이)
	public int BMR(int height, int weight, int age) {
		int BMR = (int) (88.4 + (13.4 * weight ) + (4.8 * height) - (5.68 * age));
		return  BMR;
		
	}


	
	

}
