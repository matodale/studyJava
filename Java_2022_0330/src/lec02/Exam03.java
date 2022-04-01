package lec02;

public class Exam03 {

	public static void main(String[] args) {
		// 문제 : `a무기.공격();` 가 실행되는 세부과정을 자세히 쓰세요.
		Weapon aWeapon = new Sword();
		
		
		aWeapon.attack();
		// 오버라이딩 메소드 attack()이 Weapon에서 정의 되어 하위 클래스인 Sword 에도 같은 메소드 형으로 재정의 되어야 호출이 가능함.

	}

}

class Weapon {
	void attack() {
		System.out.println("공격하다.1");
	}
}

class Sword extends Weapon {
	@Override
	void attack() {
		System.out.println("공격하다.2");
	}
}