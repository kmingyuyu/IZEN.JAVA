package map;

public class DefaultMapMain {

	
	public static void main(String[] args) {
//		서울 지역
		SeoulMap seouul1 = new SeoulMap("월요일" , 13);
		SeoulMap seouul2 = new SeoulMap("수요일" , 17);
		SeoulMap seouul3 = new SeoulMap("토요일" , 17);
		
//		여수 지역
		DefaultMap yeosu1 = new DefaultMap("월요일" , 13);
		DefaultMap yeosu2 = new DefaultMap("토요일" , 17);
		
//		강릉 지역
		DefaultMap gangleung1 = new DefaultMap("토요일" , 13);
		DefaultMap gangleung2 = new DefaultMap("토요일" , 17);
		
//		부산 지역
		DefaultMap busan1 = new DefaultMap("토요일" , 13);
		DefaultMap busan2 = new DefaultMap("토요일" , 17);
		
	}
}












