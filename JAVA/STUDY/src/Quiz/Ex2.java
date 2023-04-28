package Quiz;

public class Ex2 {
	//max 메소드 작성
//	-메서드명 : max
//	-기능 : 주어진 int형 배열의 값 중에서 제일 큰 값을 반환한다. 만일 주어진 배열이 null이거나 크기가 0인 경우, -999999를 반환한다.
//	-반환타입 : int
//	-매개변수 : int[] arr -> 최대값을 구할 배열
	
	
	
	//
	
	
	int max(int[] arr) {
		int max = 0;
		if(arr == null || arr == 0) {
			
//			str == null || str == ""
		}
		
		
		for(int i=0; i<arr.length; i++) {
			if(max >= arr[i]) {
			}
		}	
		return max;
		
	} 

	
		public static void main(String[] args) {
			Ex2 ex2 = new Ex2();
			
			int[] data = { 3, 2, 9, 4, 7 };
			System.out.println(java.util.Arrays.toString(data));
			System.out.println("최대값:" + ex2.max(data));
			System.out.println("최대값:" + ex2.max(null));
			System.out.println("최대값:" + ex2.max(new int[] {})); // 크기가 0인 배열
		}

}
