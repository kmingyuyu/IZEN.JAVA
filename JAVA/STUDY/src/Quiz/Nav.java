package Quiz;

public class Nav {
	
	int monthDay;
	int monthPay;
	int totalDay;
	
	
	void pay() {
		System.out.println("[(1일 평균임금 × 30일) × 총 계속근로기간] ÷ 365");
	}
	

//	1일 평균임금 = { 사유발생한 날(퇴직일) 이전 3월간의 임금총액}① / {사유발생한 날(퇴직일) 이전 3월간의 총 일수}②
   void pay (int x, int y, int z) {
//	   1일 평균임금*
 //    1일 평균임금 구하기 x:퇴직날전 한달간 임금총액 근무시간 y: 퇴직날전 한달간 총 일수
	   int monthDay =  (x*3)/(y*3);
	   int monthPay =  monthDay*z;
	   int totalDay =  monthPay/365;
	   int result = totalDay;
   }
   
   
   Nav(int monthDay, int monthPay, int totalDay) {
	   this.monthDay = monthDay;
	   this.monthPay = monthPay;
	   this.totalDay = totalDay;
   }
   
   
   int pay2 (int x , int y) {
	   int result = (x * y)/365;
	   return result;
   }
   
   }

   
 
	   
   
   

   
  
   
	
	

	
	

