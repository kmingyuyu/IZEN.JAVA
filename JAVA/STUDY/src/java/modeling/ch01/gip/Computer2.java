package java.modeling.ch01.gip;

// 집약관계 : 전체가 사라져도 부분은 사라지지 않는다.
public class Computer2 {
	private MainBoard mb;
	private CPU c;
	private Memory m;
	private PowerSupply ps;
	
	
	public Computer2 (MainBoard mb, CPU c ,Memory m,PowerSupply ps) {
		this.mb = mb;
		this.c = c;
		this.m = m;
		this.ps = ps;
	}
	   
}
