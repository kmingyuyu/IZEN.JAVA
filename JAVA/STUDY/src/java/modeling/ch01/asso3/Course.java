package java.modeling.ch01.asso3;

import java.util.ArrayList;

public class Course {
	private String name;
	private ArrayList<Transcript> transcripts;
	
//	양방향 관계
//	Student student : 1개 일때
	
//  수강신청 추가
   public void addTranscript(Transcript transcript) {
  	 transcripts.add(transcript);
   }
	
//	생성자
	public Course(String name) {
		this.name = name;
		transcripts = new ArrayList<>();
		
	}
	
	public String getname() {
		return name;
	}
	
	
	
	

}
