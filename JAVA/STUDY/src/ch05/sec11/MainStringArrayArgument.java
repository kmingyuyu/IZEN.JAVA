package ch05.sec11;

public class MainStringArrayArgument {

	public static void main(String[] args) {
		                       // String[] args = {"10","20"};
		 if(args.length !=2) { //입력된 데이터의 갯수가 2개가 아닐경우
            System.out.println("프로그램 입력값이 부족");
            System.exit(0); //프로그램 종료
		 }
		 
		 String strnum1 = args[0];
		 String strnum2 = args[1];
		 
//		 문자열을 숫자로 변환
		 int num1 = Integer.parseInt(strnum1);
		 int num2 = Integer.parseInt(strnum2);
		 
		 int result = num1 + num2;
         System.out.println(num1 + "+" + num2 + "=" + result);
	}

}
