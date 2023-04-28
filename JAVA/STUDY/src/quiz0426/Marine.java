package quiz0426;

public class Marine {
//   게임에서 병사를 클래스로 정의
// 문제 이클래스 멤버에서 static을 붙여야 하는 것은?
//	중요) 모든 병사의 공격력과 방어력은 같아야한다.
	
	int x = 0, y = 0; // Marine의 위치좌표(x,y)
	int hp = 60; // 현재 체력
	static int weapon = 6; // 공격력
	static int armor = 0; // 방어력

	
//	정적필드의 값을 변경하는 메소드가 있으면 그 메소드도 정적메소드로 만들어주는게 좋다.
	
	static void weaponUp() {
		weapon++;
	}

	void armorUp() {
		armor++;
	}

	void move(int x, int y) {
		this.x = x; // this.x는 인스턴스 변수, x는 지역변수
		this.y = y; // this.y는 인스턴스 변수, y는 지역변수
	
}
}
