package math;


public class BasalMan implements Basal{

	@Override
	public int BMR(int height, int weight, int age) {
		int BMR = (int) (88.4 + (13.4 * weight ) + (4.8 * height) - (5.68 * age));
		return  BMR;
		
	}



	
	

}
