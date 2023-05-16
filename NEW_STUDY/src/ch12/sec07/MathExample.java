package ch12.sec07;

public class MathExample {
	
	public static void main(String[] args) {
		double v1 = Math.ceil(5.3); //올립
		double v2 = Math.floor(5.3); //버림
		System.out.println(v1);
		System.out.println(v2);
		
		System.out.println("------------");
		
		long v3 = Math.max(3, 7); // 두개의 값중에 큰값
		long v4 = Math.min(3, 7); // 두개의 값중에 작은값
		System.out.println(v3);
		System.out.println(v4);
		
		System.out.println("------------");
		
//		소수점 이하 두자리 얻기
		double value = 12.3456;
		double temp1 = value * 100;
		long temp2 = Math.round(temp1); //반올림
		System.out.println(temp2);
		
		double v5 = temp2 / 100.0;
		System.out.println(v5);
		
		
	}
	
}
