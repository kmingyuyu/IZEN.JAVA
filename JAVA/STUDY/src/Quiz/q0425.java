package Quiz;

public class q0425 {

	public static void main(String[] args) {
//		⦁다음 배열에 담긴 값을 모두 더하는 프로그램을 만드시오
//		 (힌트: for 문 이용)
//		int[] arr = {10, 20, 30, 40, 50};
       
		
		int total = 0;
		int[] arr = {10, 20, 30, 40, 50};
		
		for(int i=0; i<arr.length; i++) {
			total += arr[i];
		}
//		System.out.println(total);
		
		
//		⦁	주어진 배열 항목에서 최대값을 출력하는 코드를 작성해보세요
//		(힌트: for 문 이용)
//        int[] array = { 1, 5, 3, 8, 2 };


        int[] array = { 1, 5, 3, 8, 2 };
        int max = array[0];
        int min = array[0];
        
        for(int i=0; i<array.length; i++) {
        	
        	if (max < array[i]) {
        		max = array[i];
        	}else if (min > array[i]) {
        		min = array[i];
        	}
        	
        	
        }
        System.out.println("최대값"+max);
        System.out.println("최소값"+min);
		
        
//        ⦁	주어진 배열 항목의 전체 합과 평균을 구해 출력하는 코드를 
//        작성해보세요(힌트: 중첩 for 문 이용)
      

        int[][] array2 = {
         	      {95, 86},
         	      {83, 92, 96},
         	      {78, 83, 93, 87, 88}
         	};
         int totalf = 0;
         int totals = 0;
         double avg =0.0;
         for(int i = 0; i<array2.length; i++) {
         	 for(int j=0; j<array2[i].length; j++) {
         		totalf += array2[i][j];
         		totals +=1;
         	}
         }
         
         avg = totalf/totals;
         
         System.out.println("총합 :" + totalf);
         System.out.println("평균 :" + avg);
        

        


		
	}

}
