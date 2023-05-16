package metabolism;

import utils.Define;

public class BasalExercise {
   
	
	
	public int AMR (int exerciseCode , int BMR) {
		
		int AMR = 0;
		
		if(exerciseCode == Define.TUTORIAL) {
			AMR = (int) (BMR * 1.2);
		}else if (exerciseCode == Define.EASY) {
			AMR = (int) (BMR * 1.375);
		}else if (exerciseCode == Define.NORMAL) {
			AMR = (int) (BMR * 1.55);
		}else if (exerciseCode == Define.HARD) {
			AMR = (int) (BMR * 1.725);
		}else {
			AMR = -99999;
		}
		
		
		
		return AMR; 
				
	}
	
	
	
}
