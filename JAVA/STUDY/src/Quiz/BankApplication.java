package Quiz;

import java.util.Scanner;

public class BankApplication {
	
//	다음은 키보드로부터 계좌 정보를 입력받아 계좌를 관리하는 프로그램입니다. 계좌는Account
//	객체로 생성되고 BankApplication에서 길이 100인 Account[ ] 배열로 관리됩니다. 실행 결과를
//	보고, Account와 BankApplication 클래스를 작성해보세요(키보드로 입력받을 때는 Scanner
//	의 nextLine ( ) 메소드를 사용).


	
	
	
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
	    	 System.out.println("-----------");
	    	 System.out.println("계좌목록");
	    	 System.out.println("-----------");
//	    	 계좌가 잘 생성이 되었나 확인하기(객체이므로 주소가 찍힘)
	    	 for(Account account : accountArray) {
//	    		 배열이 null값일때 실행하는걸 방지하기 위해서
	    		 if(account != null) {
	    			 System.out.print(account.getAno());
	    			 System.out.print("");
	    			 System.out.print(account.getOwner());
	    			 System.out.print("");
	    			 System.out.print(account.getBalance());
	    			 System.out.println();
	    		 }
	    			 
	    		 
	    		 
	    	 }
	     }
//	     예금하기
	     private static void deposit() {
	    	 System.out.println("-----------");
	    	 System.out.println("예금");
	    	 System.out.println("-----------");
//	    	 계좌 번호, 예금액 입력
	    	 System.out.println("계좌번호 : ");
	    	 String ano = scanner.next(); //스트링 타입으로 입력을받음
	    	 
	    	 System.out.println("예금액 : ");
	    	 int money = scanner.nextInt(); //인트 타입으로 입력을받음
	    	
	    	 
//	     계좌찾기
//	     리턴해 주는 값을 같은 타입인 account로 받는다.
//	     account 변수에는 찾은 계좌 객체가 들어있다.
	     Account account = findAccount(ano);
	     
	     if(account == null) {
	    	 System.out.println("결과 : 계좌가 없습니다.");
	    	 return; //메소드를 끝낸다.
	     }
	     
	     account.setBalance(account.getBalance()+money);
	     System.out.println("결과 :예금이 성공 되었습니다.");
	    	 
	    	 
	     }
//	     출금하기
	     private static void withdraw() {
	    	 System.out.println("-----------");
	    	 System.out.println("출금");
	    	 System.out.println("-----------");
	    	 System.out.println("계좌번호 : ");
	    	 String ano = scanner.next(); //스트링 타입으로 입력을받음
	    	 
	    	 System.out.println("출금액 : ");
	    	 int money = scanner.nextInt(); //인트 타입으로 입력을받음
	    	
	    	 
//	     계좌찾기
//	     리턴해 주는 값을 같은 타입인 account로 받는다.
//	     account 변수에는 찾은 계좌 객체가 들어있다.
	     Account account = findAccount(ano);
	     
	     if(account == null) {
	    	 System.out.println("결과 : 계좌가 없습니다.");
	    	 return; //메소드를 끝낸다.
	     }
	     
	     account.setBalance(account.getBalance()-money);
	     System.out.println("결과 :출금이 성공 되었습니다.");
	    	 
	     }
	     
	     
	     
//	     계좌찾기 메소드
	     private static Account findAccount(String ano) {
	    	 Account resultAccount = null;
	    	 for(Account account : accountArray) {
//		    	 배열의 값이 null이 아닐때만 실행된다. => account 객체를 가지고 있을때
		    		 if(account != null) {
		    			if(ano.equals(account.getAno())){
//		    				여기서 리턴을 하면 안되므로 아래와 같이 찾은 계좌를 넣어준다.
		    				resultAccount = account;
		    				break;
		    			} 
		    		 }
		    	 }return resultAccount; //찾은 계좌를 리턴한다.
	     }
}
