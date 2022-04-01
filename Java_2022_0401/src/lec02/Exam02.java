package lec02;

public class Exam02 {

	public static void main(String[] args) {
		// 추상 클래스와 인터페이스
		Weapon1 aWeapon1 = new Sword1();
		Weapon1 aBow1 = new Bow1();
		Weapon1 aGun1 = new Gun1();
//		aWeapon1.run1();
//		aBow1.run1();
//		aGun1.run1();
		
		Weapon1[] arr_Weapon = new Weapon1[3];
		arr_Weapon[0] = aWeapon1;
		arr_Weapon[1] = aBow1;
		arr_Weapon[2] = aGun1;
		
		
		for(int i = 0; i < arr_Weapon.length; i++) {
			Weapon1 aWeapon2 = arr_Weapon[i];
			aWeapon2.run1();
		}
		
		// new Weapon1(); 객체 생성 불가 
	}
}
// 추상 클래스
abstract class Weapon1{
	// 메소드만 정의하고 구현은 필요없는 경우에 사용합니다.
	abstract void run1(); // 메소드만 정의합니다. 오버라이드를 항상 해줘야 실행이 가능.
	
}

class Sword1 extends Weapon1{
	void run1() {
		System.out.println("칼 작동");
	}
}

class Bow1 extends Weapon1{
	void run1() {
		System.out.println("활 작동");
	}
}

class Gun1 extends Weapon1{
	void run1() {
		System.out.println("총 작동");
	}
}