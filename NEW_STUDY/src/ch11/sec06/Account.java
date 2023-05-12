package ch11.sec06;

public class Account {
	private long balance;
	
	public Account() {}
	
	public long getBalance() {
		return balance;
	}
	
	
	
//	예금하는 메소드
	public void deposit(int money) {
		balance += money;
	}
	
//	 출금하는 메소드
	public void withdraw(int money) throws InsufficientException {
		if(balance < money) {
//			예외를 발생시킴.
			throw new InsufficientException("잔고 부족" + (money-balance) + " 모자람");
		}
	} 
	
	
	
	
}
