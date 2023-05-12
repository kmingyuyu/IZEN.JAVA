package gender_metabolism;

import utils.Define;

public class BasalWoman implements Metabolism {

	@Override
	public int BMR(int height, int weight, int age) {
		int BMR = (int) (447.6 + (9.25 * weight ) + (3.1 * height) - (4.33 * age));
		return  BMR;
		
	}

	@Override
	public int AMR(int exercise , int BMR) {
		if(exercise == Define.TUTORIAL) {
			int AMR = (int) (BMR * 1.2);
			return AMR;
		}
		
		
		return 0;
	}

//	여성: 447.6 + (9.25 × 몸무게) ＋ (3.1 × 키) – (4.33 × 나이)
	
	
	
	
}
