package math;


public class BasalWoman implements Basal {

	@Override
	public int BMR(int height, int weight, int age) {
		int BMR = (int) (447.6 + (9.25 * weight ) + (3.1 * height) - (4.33 * age));
		return  BMR;
		
	}




	
	
	
	
}
