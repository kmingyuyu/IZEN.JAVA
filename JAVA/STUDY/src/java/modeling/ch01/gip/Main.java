package java.modeling.ch01.gip;

public class Main {

	public static void main(String[] args) {
//      합성관계 
//		컴퓨터만 생성해도 컴퓨터의 부품들이 다 생성된다.
		Computer c = new Computer();
//		컴퓨터가 사라지면 컴퓨터 부품들도  다 사라진다.
		c = null;
		
		
//		집약관계
//		부품을 따로 생성한다
		MainBoard mb = new MainBoard();
		CPU cpu = new CPU();
		Memory m = new Memory();
		PowerSupply ps = new PowerSupply();
        
		Computer2 c2 = new Computer2(mb , cpu , m , ps);
//		컴퓨터가 사라져도 부품들이 존재함
		c2 = null;
		
		
		
		
	}

}
