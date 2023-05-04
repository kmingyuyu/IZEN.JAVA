package java.modeling.ch01.asso1;

import java.util.ArrayList;

public class Student {
//	필드
    private String name;
    
    
//  단방향관계 
//  학생은 자기가 수강하는 과목을 알고 있다.
    private ArrayList<Course> courses;  
    
    
    
//  생성자
    public Student(String name) {
    	this.name = name;
    	courses = new ArrayList<>();
    }    
    
    
    
//  메소드 
//  수강 신청
    public void registerCourse () {}
    
//  수강 취소
    public void dropCourse () {}
    
}
