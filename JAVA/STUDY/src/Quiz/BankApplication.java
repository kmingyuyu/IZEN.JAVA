package Quiz;

import java.util.Scanner;

public class BankApplication {
//	static 필드
	
//	계좌객체를 저장 할수 있는 배열( default 값: null )
    private static Account[] accountArray = new Account[100];
    private static Scanner scanner = new Scanner(System.in);
	
	
	public static void main(String[] args) {
        boolean run = true;
        
        while(run) {
        	System.out.println("-------------------------------------------");
        	System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
        	System.out.println("-------------------------------------------");
        	System.out.println("선택>");
        	int selectNO = scanner.nextInt();
        	
        switch(selectNO)	 {
        case 1:
//        계좌생성
        	createAccount();
          break;       	
        case 2:
//        계좌목록 보여주기
        	accountList();
        	break;       	
        case 3:
//          예금기능 실행
        	deposit();
          	break;       	
        case 4:
//          출금기능 실행
        	withdraw();
          	break;  
        case 5:
          run=false;
          	break;
        default :
        	System.out.println("1~5사이의 숫자를 입력하세요");
        	break;
        }
        	
        }
	}
//       계좌 생성하기
	     private static void createAccount() {
	    	 System.out.println("------");
	    	 System.out.println("계좌생성");
	    	 System.out.println("------");
	    	 System.out.println("계좌번호 : ");
	    	 String ano = scanner.next(); // String 타입으로 입력을 받는다.
	    	 System.out.println("계좌주 : ");
	    	 String owner = scanner.next(); // String 타입으로 입력을 받는다.
	    	 System.out.println("초기입금액 : ");
	    	 int balance = scanner.nextInt(); // String 타입으로 입력을 받는다.
	    	 
	    	 
//	    	 계좌생성
	    	 Account newAccount = new Account(owner,ano,balance);
	    	 
//	    	 !중요! 배열 안에 객체를 넣는다.
	    	 for(int i=0; i<accountArray.length; i++) {
	    		 if(accountArray[i] == null) {
	    			 accountArray[i] = newAccount; //계좌객체를 배열에 넣어준다.
	    			 System.out.println("결과 : 계좌가 생성 되었습니다.");
	    			 break; // 계좌를 생성하면 for문을 나온다.
	    		 }
	    	 }

	    	 
	    	 
	     }
//       계좌목록 보여주기	
	     private static void accountList() {
//	    	 계좌가 잘 생성이 되었나 확인하기(객체이므로 주소가 찍힘)
	    	 for(Account account : accountArray) {
	    		 
	    			 System.out.println(account);
	    			 
	    		 
	    		 
	    	 }
	     }
//	     예금하기
	     private static void deposit() {}
//	     출금하기
	     private static void withdraw() {}
}
