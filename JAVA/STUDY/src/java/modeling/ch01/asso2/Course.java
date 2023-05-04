package java.modeling.ch01.asso2;

import java.util.ArrayList;

public class Course {
	private String name;
	
//	양방향 관계
//	Student student : 1개 일때
	private ArrayList<Student> students;
	
	
//	생성자
	public Course(String name) {
		this.name = name;
		students = new ArrayList<> ();
		
	}
	
	public String getname() {
		return name;
	}
	
//	수강취소한 학생 추가
	public void addStudent(Student student) {
		students.add(student);
	}
	
//	수강취소한 학생 제거
	public void removeStudent(Student student) {
		students.remove(student);
	}
}
