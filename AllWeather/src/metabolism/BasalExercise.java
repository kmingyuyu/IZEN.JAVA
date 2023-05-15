package metabolism;

import utils.Define;

public class BasalExercise {
   
	
	
	public int AMR (int exercise , int BMR) {
		
		int AMR = 0;
		
		if(exercise == Define.TUTORIAL) {
			AMR = (int) (BMR * 1.2);
		}else if (exercise == Define.EASY) {
			AMR = (int) (BMR * 1.375);
		}else if (exercise == Define.NORMAL) {
			AMR = (int) (BMR * 1.55);
		}else if (exercise == Define.HARD) {
			AMR = (int) (BMR * 1.725);
		}
		
		
		
		return AMR; 
				
	}
	
	
	
}
