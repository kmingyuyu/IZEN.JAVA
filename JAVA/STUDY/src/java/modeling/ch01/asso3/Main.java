package java.modeling.ch01.asso3;

public class Main {

	public static void main(String[] args) {
//		학생 2명
		Student min = new Student("min");
		Student gyu = new Student("gyu");
		
//		과목 생성
        Course java = new Course("java");
        Course dp = new Course("Design pattern");
        
//      성적객체 - > 수강 신청 동시에 발생
        Transcript t1 = new Transcript(min,java); // min은 자바를 수강신청
        Transcript t2 = new Transcript(min,dp); // min은 dp를 수강신청
        Transcript t3 = new Transcript(gyu,dp); // gyu은 dp를 수강신청
        
        t1.setDate("2023-05-04");
        t1.setGrade("B");
        t2.setDate("2023-05-04");
        t2.setGrade("B");
        t3.setDate("2023-05-04");
        t3.setGrade("B");
        
        
	}

}
