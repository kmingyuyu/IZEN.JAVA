package math;

public class Nutrient {

	public double carbohydrate(int AMR) {
		double c;
		c = AMR * 0.4 / 4 ;
		return c;
	}
	public double fat(int AMR) {
		double f;
		f = AMR * 0.2 / 9 ;
		return f;
	}
	public double protien(int AMR) {
		double p;
		 p = AMR * 0.4 / 4 ;
		return p;
	}
	
	
}
