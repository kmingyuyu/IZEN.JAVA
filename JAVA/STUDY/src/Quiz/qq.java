package Quiz;

import java.util.Scanner;

public class qq {

	public static void main(String[] args) {
		
//        1. int형 변수 x가 10보다 크고 20보다 작을 때 true인 조건식-> 10 < x && x < 20
		 int x = 25;
		
		
		if(10 < x && x < 20 ) {
			System.out.println("x=" + true);
		} else {
			System.out.println("x=" + false);
		}
//        2. char형 변수 ch가 공백이나 탭이 아닐 때 true인 조건식
//        3. char형 변수 ch가 'x' 또는 'X'일 때 true인 조건식
//        4. char형 변수 ch가 숫자(‘0’~‘9’)일 때 true인 조건식
//        5. char형 변수 ch가 영문자(대문자 또는 소문자)일 때 true인 조건식
		
		char ch = 'b';
		
		if(ch == 'x'&& ch =='X') {
			System.out.println("ch=" + true);
		}else if(ch >= 0 && 9 >= ch) {
			System.out.println("ch=" + true);
		}else if( ch >= 'a'&& 'z' >= ch) {
			System.out.println("ch=" + true);			
		}else if( ch >= 'A'&& 'Z' >= ch) {
			System.out.println("ch=" + true);			
		}else if (ch != ' ') {
			System.out.println("ch=" + true);						
		}else {
			System.out.println("ch=" + false);						
		}
		
//        6. int형 변수 year가 400으로 나눠떨어지거나 또는 4로 나눠떨어지고 100으로
//            나눠떨어지지 않을 때 true인 조건식
		
		  int year = 5;
		  if( year%400 == 0 && year%4 == 0 && year%100 < 0 ) {
			  System.out.println("year=" + true);						
		  }else {
			  System.out.println("year=" + false);							  
		  }
		
//		⦁	다음 문장들을 조건식으로 표현하시오.
//        7. boolean형 변수 powerOn가 false일 때 true인 조건식
		  
		  boolean powerOn;
		  
		  if(powerOn = false) {
			  System.out.println("powerOn=" + true);						
		  }else {
			  System.out.println("powerOn=" + false);						
			  
		  }
//        8. 문자열 참조변수 str이 “yes”일 때 true인 조건
		  String str = "no";
		  if(str == "yes") {
			  System.out.println("str=" + true);						
		  }else {
			  System.out.println("str=" + false);						
		  }

        
//		  ⦁	for 문을 이용하여 1~100까지의 정수 중 3의 배수 총합을 구하는 코드를 작성하시오.
//		  힌트: 3의 배수는 3으로 나눴을때 나머지가 0
		  
		  int u = 0;
		  
		  for(int min=1; min<=100; min++) {
			  if(min%3 == 0) {
				  u = u + min;
			  }
		  }
		  System.out.println(u);
		  
//		  ⦁	1부터 20까지의 정수 중에서 2 또는 3의 배수가 아닌 수의 총합을 구하는 코드를 작성하시오.
//		  총합: 73
		  int h = 0;
		  
		  for(int g=1; g<=20; g++) {
			  if(g%2 != 0 && g%3 != 0) {
				  h = h + g;
			  }
		  }
		  System.out.println("h:"+h);
		  
		  
		 
//		  ⦁	while 문과 Math.random( ) 메소드를 이용해서 두 개의 주사위를 던졌을 때 나오는 눈을 (눈1,
//			눈2) 형태로 출력하고, 눈의 합이 5가 아니면 계속 주사위를 던지고, 눈의 합이 5이면 실행을 멈추
//			는 코드를 작성해보세요. 눈의 합이 5가 되는 경우는 (1, 4), (4, 1), (2, 3), (3, 2)입니다.
//			힌트: 반복문, break 사용 (아직안품)
		  
		  while (true) {
		  int dice = (int)(Math.random()*6)+1 ;
		  int dicesecond = (int)(Math.random()*6)+1 ;
//		  System.out.println(dice);
//		  System.out.println(dicesecond);
		  
		  System.out.println("눈1:" + dice + "  눈2:" + dicesecond );
		  if((dice+dicesecond) == 5) {
			  
			  break;
		  }
			  
		  }
		  
//		  중첩 for 문을 이용하여 방정식 4x + 5y = 60의 모든 해를 구해서 (x, y) 형태로 출력하는 코드
//				  를 작성해보세요. 단, x와 y는 10 이하의 자연수입니다.
//				  힌트: x와 y를 이중 for으로 반복해 돌린다.
		  
		  
		 for(int x1=1; x1<=10; x1++) {
			   
			 for(int y=1; y<=10; y++) {
//				System.out.println("y :" + y);
				 if((4 * x1 + 5 * y) == 60) {
                  System.out.println("(" + x1 + "," + y + ")");					 
				 }
			 }
		 }
		 
//		 피보나치(Fibonnaci) 수열(數列)은 앞을 두 수를 더해서 다음 수를 만들어 나가는 수열이다.
//		 예를 들어 앞의 두 수가 1과 1이라면 그 다음 수는 2가 되고 
//		 그 다음 수는 1과 2를 더해서 3이 되어서 1,1,2,3,5,8,13,21,... 
//		 과 같은 식으로 진행된다. 1과 1부터시작하는 피보나치수열의 10번째 수는 무엇인지 
//		 계산하는 프로그램을 완성하시오.
		 
		 int num1 = 1; //첫번째값
		 int num2 = 1; //두번째값
		 int num3 = 0; //세번째값
		 
		System.out.print(num1 + "," + num2);
		
//		8번덧셈
		for(int i=0; i<8; i++) {
             num3 = num1 + num2;
             System.out.print("," + num3);
             num1= num2; //두번째 수열을 첫번째 값으로 한다.
             num2= num3; //세번째 수열을 두번째로 값으로 한다.
             
		}
		 System.out.println("---------------------");
		 
		 
		 
		 
		 
//		 for 문을 이용해서 다음과 같은 실행 결과가 나오는 코드를 작성해보세요.
         for(int i =1; i<=5; i++) {
        	 for(int j = 1; j <= i; j++) {
        		 System.out.print("*");
        		 if(j == i) {
        			 System.out.println();
        		 }
        	 }
         }
		 
		 
//         다음은 숫자맞추기 게임을 작성한 것이다. 
//         1과 100사이의 값을 반복적으로 입력해서 컴퓨터가 생각한 값을 맞추면 게임이 끝난다. 
//         사용자가 값을 입력하면, 컴퓨터는 자신이 생각한 값과 비교해서 결과를 알려준다. 
//         사용자가 컴퓨터가 생각한 숫자를 맞추면 게임이 끝나고 몇 번 만에 숫자를 맞췄는지 알려준다. 
//         네모에 알맞은 코드를 넣어 프로그램을 완성하시오.
         
           int answer = (int)(Math.random()*100) + 1;
           int input = 0; //사용자입력 저장공간
           int count = 0; //시도횟수를 세기 위한 변수
           
           java.util.Scanner s = new java.util.Scanner(System.in);

           do {
        	   count++; //시도횟수를 증가
        	   System.out.println("1과 100사이 값을 입력하세요");
        	   input = s.nextInt(); // 입력받은 값을 변수 input에 저장함
        	   
        	   if(answer > input) {
        		   System.out.println("더 큰수를 입력하세요");
        	   } else if(answer < input) {
        		   System.out.println("더 작은수를 입력하세요");
        	   } else if (answer == input) {
        		   System.out.println("맞췄습니다!");
        		   System.out.println("시도횟수는" + count);
        		   
        	   }
            } while (true);
           
           
//           while 문과 Scanner의 nextLine ( ) 메소드를 이용해서 다음 실행 결과와 같이 키보드로부터
//           입력된 데이터로 예금, 출금, 조회, 종료 기능을 제공하는 코드를 작성해보세요.
           
              boolean run = true;
              int balance = 0; //잔고
              Scanner scanner = new Scanner(System.in); 
              
              while(run) {
            	  System.out.println("--------------------");
            	  System.out.println("1.예금 2.출금 3.잔고 4.종료");
            	  System.out.println("--------------------");
            	  
            	  
//            	  사용자에게 입력을 받는다.
            	  System.out.println("선택 > ");
            	  
            	  
            	  
            	  int menunum = scanner.nextInt();
              }
		 
		 
		 


		  
		  
		  


		  
		  
		  
	}  

}
