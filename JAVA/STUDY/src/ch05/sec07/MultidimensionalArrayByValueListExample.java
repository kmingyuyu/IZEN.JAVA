package ch05.sec07;

public class MultidimensionalArrayByValueListExample {

	public static void main(String[] args) {
		
		int[][] score = {
				{80,90,96},{76,88}
		};
		
		System.out.println("1차원 배열 길이 (반의 수):" + score.length); //{80,90,96},{76,88} => 총{}2개
		System.out.println("2차원 배열 길이 (첫번쨰 반의 학생수)" + score[0].length + "명");
		System.out.println("2차원 배열 길이 (첫번쨰 반의 학생수)" + score[1].length + "명");

//		첫번째 반에서 세번째 학생의 점수 읽기
		System.out.println(score[0][2] + "점");
		
//		두번째 반에서 두번째 학생의 점수 읽기
		System.out.println(score[1][1] + "점");
		
//		첫번째 반의 평균 점수 구하기
        int class1sum = 0;
//      score[0] = {80,90,96};
        for(int i=0; i<score[0].length; i++) {
        	class1sum += score[0][i] ;
        };
        System.out.println("합계:" + class1sum);
        System.out.println("평균:" + (double)class1sum/ score[0].length);
		
//		두번째 반의 평균 점수 구하기
        int class2sum = 0;
//		score[1] = {76,88};
        for(int i=0; i<score[1].length; i++) {
        	class2sum += score[1][i];
        };
        System.out.println("합계:" + class2sum);
        System.out.println("평균:" + (double)class2sum/ score[1].length);
//        score[0] = {80,90,96}; 
//        score[1] = {76,88};
//      전체 학생의 평균 점수 구하기
        int totalst = 0;
        int totalsum = 0;
        
        for(int i=0; i<score.length; i++) { //length : 행의 갯수
        	
        	totalst += score[i].length; //첫번째 반의 학생수와 두번째 반의 학생수를 더한다 
        	
            for(int k=0; k<score[i].length; k++) { //length : 열의 갯수
            	System.out.println("score[" + i + "]" + "[" + k + "] :" +  score[i][k]);
            	
            	totalsum += score[i][k];
            	
            };
        };
                
        System.out.println("전체 학생의 평균점수" + (double)totalsum / totalst );
		
	}

}
