package grade;

public class MajorEvaluation implements GradeEvaluation {

	@Override
	public String getGrade(int point) {
		
        String grade; //필수과목 학점
		
		if(point >= 95 && point <= 100) { //95 ~ 100점 사이 
			grade = "S";
		}else if(point >= 90 && point <= 94) { //90 ~ 94점 사이 
			grade = "A";
		}else if(point >= 80 && point <= 89) { //80 ~ 89점 사이 
			grade = "B";
		}else if(point >= 70 && point <= 79) { //70 ~ 79점 사이 
			grade = "C";
		}else if(point >= 60 && point <= 69) { //60 ~ 69점 사이 
			grade = "D";
		}else {
			grade = "F";
		}
		
		return grade;
	}

}
