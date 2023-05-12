package school;


// 어느 '학생'의 어느 '과목' 점수가 '몇점'이다
public class Score {
   private int studentId ; //학번
   private Subject subject ; //과목
   private int point ; //점수
   
   public Score(int studentId, Subject subject, int point) {
	   this.studentId = studentId;
	   this.subject = subject;
	   this.point = point;
   }

@Override
public String toString() { //클래스의 정보를 출력할때 사용
	return "학번: " + this.studentId + "," + subject.getSubjectName() + ":" + point;
}


// get/set
public int getStudentId() {
	return studentId;
}

public void setStudentId(int studentId) {
	this.studentId = studentId;
}

public Subject getSubject() {
	return subject;
}

public void setSubject(Subject subject) {
	this.subject = subject;
}

public int getPoint() {
	return point;
}

public void setPoint(int point) {
	this.point = point;
}
   
   
	
}
