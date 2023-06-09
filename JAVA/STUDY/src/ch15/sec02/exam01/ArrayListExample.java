package ch15.sec02.exam01;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
//		<Board> : 제네릭 , 배열에 저장할 타입을 명시한다.
//		뒤에오는건 타입을 생략해도 상관없다.
		
		ArrayList<Board> list = new ArrayList<Board>();
		
		list.add(new Board("제목1" , "내용1" , "글쓴이1")); //배열에 Board 객체 추가
		list.add(new Board("제목2" , "내용2" , "글쓴이2")); //배열에 Board 객체 추가
		list.add(new Board("제목3" , "내용3" , "글쓴이3")); //배열에 Board 객체 추가
		list.add(new Board("제목4" , "내용4" , "글쓴이4")); //배열에 Board 객체 추가
		list.add(new Board("제목5" , "내용5" , "글쓴이5")); //배열에 Board 객체 추가
		
//		저장된 총 객체 수 얻기
		int size = list.size();
		System.out.println("총 갯수 : " + size );
		System.out.println("-------------------");
//		특정 인덱스 번호의 객체 가져오기
		Board board =list.get(2); // board 객체를 리턴해주므로 board타입으로 받는다.
		System.out.println(board.getSubject() + "" +  board.getContent() + "" + board.getWriter());
		
//		모든 객체를 하나씩 가져오기
		for(int i=0; i<list.size(); i++) {
		Board b =list.get(i); // board 객체를 리턴해주므로 board타입으로 받는다.
		System.out.println(b.getSubject() + "" +  b.getContent() + "" + b.getWriter());
		}
		
		System.out.println("-------------------");
		
//		객체삭제
		list.remove(2);
		
		for(Board b : list) {
			System.out.println(b.getSubject() + "" +  b.getContent() + "" + b.getWriter());
		}
		
		
	}

}
