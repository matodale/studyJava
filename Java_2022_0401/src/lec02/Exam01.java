package lec02;

public class Exam01 {
	public static void main(String[] args) {
		System.out.println("=== aWarrior1 ===");
		Warrior aWarrior1 = new Warrior();
		aWarrior1.attack(); // '철수가 무기로 공격을 합니다' 를 출력
		System.out.println("=== aWarrior2 ===");
		Warrior aWarrior2 = new Warrior();
		aWarrior2.name = "영희";
		aWarrior2.aWeapon = new Weapon(); // 클래스 선언
		aWarrior2.attack(); // '영희가 무기로 공격을 합니다' 를 출력
		
	}
}
class Warrior{
	String name;
	Weapon aWeapon;
	Warrior(){ // 생성자, 초기값
		this.name = "철수";
		this.aWeapon = new Sword();
	}
	void attack() {
		// System.out.println("전사가 공격을 합니다.");
		aWeapon.run(name); // this.name 생략
	}
	/*
	// 필요 없는 부분을 생략하기
	void setting() {
		this.name = "철수";
		this.aWeapon = new Sword();
	}
	*/
}
class Weapon{
	void run(String user_name) {
		System.out.println(user_name + "가 무기로 공격을 합니다.");
	}
}

class Sword extends Weapon{
	void run(String user_name) {
		System.out.println(user_name + "가 칼로 공격을 합니다.");
	}
}