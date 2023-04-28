package quiz0426;

public class MarineExample {

	public static void main(String[] args) {

//		객체는 각각 다르지만 정적필드로 지정한 필드는 모든 객체에서 공유한다.
		Marine Marine1 = new Marine();
		Marine Marine2 = new Marine();
		Marine Marine3 = new Marine();
		
		Marine.armor = 10; //세명의 병사가 전부 방어력 10 됨.
		Marine.weapon = 2; //세명의 병사가 전부 공격력 2 됨.
		
		Marine.weaponUp();
		
		System.out.println("1:" + Marine1.weapon);
		System.out.println("2:" + Marine2.weapon);
		System.out.println("3:" + Marine3.weapon);
	}

}
