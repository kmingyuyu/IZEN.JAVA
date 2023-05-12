package grade;

public class BasicEvaluation implements GradeEvaluation {

	@Override
	public String getGrade(int point) {
		String grade; // 일반과목 점수
		
		
		if(point >= 90 && point <= 100) { //90 ~ 100점 사이 
			grade = "A";
		}else if(point >= 80 && point <= 89) { //80 ~ 89점 사이 
			grade = "B";
		}else if(point >= 70 && point <= 79) { //70 ~ 79점 사이 
			grade = "C";
		}else if(point >= 55 && point <= 69) { //55 ~ 69점 사이 
			grade = "D";
		}else {
			grade = "F";
		}
		
		return grade;
	}

}
