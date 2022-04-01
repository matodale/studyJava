package lec02;

/*
	상속을 통한 캐스팅, 형변환과 매개변수 문제
*/
public class Exam01 {
	public static void main(String[] args) {
		// 문제 : 아래가 실행되도록 해주세요.
		Weapon aWeapon = new Sword();
		aWeapon.fn(); // Sword
		int a = aWeapon.fn1();
		System.out.println(a); // 1

		Weapon bWeapon = new Sword();
		bWeapon.attack();
		// 출력 : 칼로 공격합니다.

		// 문제 : 매개변수를 사용해서 전사가 매번 다르게 공격하도록 해주세요.
		Warrior aWarrior = new Warrior();

		aWarrior.attack(/* 수정가능지역 시작 */
				"브라이언", "칼"
		/* 수정가능지역 끝 */);
		// 출력 : 브라이언이(가) 칼(으)로 공격합니다.

		aWarrior.attack(/* 수정가능지역 시작 */
				"필립", "창"
		/* 수정가능지역 끝 */);
		// 출력 : 필립이(가) 창(으)로 공격합니다.

		aWarrior.attack(/* 수정가능지역 시작 */
				"마크", "지팡이"
		/* 수정가능지역 끝 */);
		// 출력 : 마크(가) 지팡이(으)로 공격합니다.
		
		
		// 문제 : 매개변수를 사용해서 전사가 매번 다르게 공격하도록 해주세요.
		
		Warrior bWarrior = new Warrior();

		bWarrior.attack(/* 수정가능지역 시작 */
				"브라이언", "칼"
				/* 수정가능지역 끝 */); 
	    // 브라이언이(가) 칼(으)로 공격합니다.

		bWarrior.re_attack();
	    // 브라이언이(가) 칼(으)로 공격합니다.

		bWarrior.attack(/* 수정가능지역 시작 */ 
				"필립", "창"
				/* 수정가능지역 끝 */); 
	    // 필립이(가) 창(으)로 공격합니다.

		bWarrior.attack(/* 수정가능지역 시작 */ 
				"마크", "지팡이"
				/* 수정가능지역 끝 */); 
	    // 마크(가) 지팡이(으)로 공격합니다.

		bWarrior.re_attack();
	    // 마크(가) 지팡이(으)로 공격합니다.

		bWarrior.re_attack();
	    // 마크(가) 지팡이(으)로 공격합니다.

	}
}

class Weapon {
	void fn() {
		System.out.println("Weapon");
	}

	int fn1() {
		return 0;
	}

	void attack() {
		System.out.println("무기로 칼을 듭니다.");
	}
}

class Sword extends Weapon {
	void fn() {
		System.out.println("Sword");
	}

	int fn1() {
		return 1;
	}

	void attack() {
		System.out.println("칼로 공격합니다.");
	}
}

class Warrior {
	String name,Weapon;
	
	void attack(String name, String Weapon) {
		System.out.printf("%s(가) %s(으)로 공격합니다.\n", name, Weapon);
		this.name = name;
		this.Weapon = Weapon;
	}
	
	void re_attack() {
		System.out.printf("%s(가) %s(으)로 공격합니다.\n", name, Weapon);
	}
}