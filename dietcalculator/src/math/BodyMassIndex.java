package math;

public class BodyMassIndex {
	
	
	public int BMI (int height, int weight) {
		int BMI = (int) (weight / Math.pow(height*0.01, 2));
		return BMI;
	}

 
	public String gradeBMI(int BMI) {
		String grade = "" ;
		if(BMI >=0 && BMI <= 18.5 ) {
			grade = "\"저\" 체중 입니다.";
		}else if(BMI >=18.5 && BMI <= 24.9) {
			grade = "\"정상(평균)\" 체중 입니다.";
		}else if(BMI >=24.9 && BMI <= 29.9) {
			grade = "\"과\" 체중 입니다.";
		}else if(BMI >= 29.9) {
			grade = "\"비만\" 입니다.";
		}
		return grade;
		
	}
}