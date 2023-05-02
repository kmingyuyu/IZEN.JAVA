package Quiz;

public class ex3 {
//	필드
    private int balance; // 잔고
    static final int MIN_BALANCE = 0;
    static final int MAX_BALANCE = 1000000;

    
    
    
	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		
		if(balance > MAX_BALANCE) {
			
		}else if (balance < MIN_BALANCE) {
			
		}else {
			this.balance = this.balance + balance;     
		}
		
		
		
	}
    
	
	
}
