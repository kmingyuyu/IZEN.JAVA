package school.report;

import java.util.ArrayList;

import school.*;
import utils.Define;
import grade.*;

public class GenerateGradeReport {
	School school = School.getInstance();
	
	public static final String TITLE = "수강생 학점 \t\t\n";
	public static final String HEADER = "이름 | 학번 | 필수과목 | 점수	 \n";
	public static final String LINE = "------------------------ \n";
	private StringBuffer buffer = new StringBuffer();
	private String str = new String();

	
//	헤더 몸통 푸터 를 합쳐주는 메소드
	public String getReport() {
		//학교에 개설된 과목 리스트를 불러온다.
		ArrayList<Subject> subjectList = school.getSubjectList();
		
//		학교에 개설된 과목을 하나씩 가져온다.
		for(Subject subject : subjectList) {
            makeHeader(subject);
            makeBody(subject);
            makeFooter();
            
			}
		
		
		return buffer.toString(); // StringBuffer - > String타입으로 변경해준다.
	}
	
	
	
	
//	헤더를 만드는 메소드
	public void makeHeader(Subject subject) {
		buffer.append(GenerateGradeReport.LINE);
		buffer.append("\t" + subject.getSubjectName());
		buffer.append(GenerateGradeReport.TITLE);
		buffer.append(GenerateGradeReport.HEADER);
		buffer.append(GenerateGradeReport.LINE);
	}
	
	
//	몸통을 만드는 메소드
	public void makeBody(Subject subject) {
//		해당과목을 수강신청한 학생리스트를 가져온다
		ArrayList<Student> studentList = subject.getStudentList();
		
		for(Student student : studentList) {
			buffer.append(student.getStudentName()); // 학생 이름
			buffer.append("|");
			buffer.append(student.getStudentId()); // 학번
			buffer.append("|");
			buffer.append(student.getMajorSubject().getSubjectName()); //학생 필수과목
			buffer.append("|");
			
//			학생별 수강과목의 점수, 학점계산
			getScoreGrade(student , subject.getSubjectId());
			buffer.append("\n");
			buffer.append(GenerateGradeReport.LINE);
		}
		
	}
	
//	학생의 수강과목 점수와 학점은 얻는 메소드
	public void getScoreGrade(Student student , int subjectId) {
//		학생이 수강한 과목의 점수 리스트(국어.수학)+
		ArrayList<Score> scoreList = student.getScoreList();
		
		
//		해당학생의 필수과목 코드를 가져온다.
		int majorId = student.getMajorSubject() .getSubjectId(); // !중요!
		
//		GradeEvaluation gradeEvaluation1 = new MajorEvaluation();
//		GradeEvaluation gradeEvaluation2 = new BasicEvaluation();
		
		
		
//		GradeEvaluation 타입의 배열에 new BasicEvaluation() 객체와 new MajorEvaluation() 객체를 저장한다.
		GradeEvaluation[] gradeEvaluation = {new BasicEvaluation(), new MajorEvaluation()}; //!중요!
		
		
		for(Score score : scoreList) {
//			점수에 해당하는 과목의 과목코드를 얻어온다
			if(score.getSubject().getSubjectId() == subjectId) {
				String grade;
//				필수과목일때 학점 산출
				if(score.getSubject().getSubjectId() == majorId) {
					grade = gradeEvaluation[Define.SAB_TYPE].getGrade(score.getPoint());
				}
//				일반과목일때 학점 산출
				else {
					grade =  gradeEvaluation[Define.AB_TYPE].getGrade(score.getPoint());
				}
				
				buffer.append(score.getPoint());
				buffer.append(":");
				buffer.append(grade);
				buffer.append("|");
			}
		}
		
		
		
		
		
	}
	
	
// 푸터를 만들어 주는 메소드
	public void makeFooter() {
	    buffer.append("\n");
	
	}
}
