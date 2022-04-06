package lec04;

public class Exam06 {

	public static void main(String[] args) {
		전사 a전사 = new 전사();
		String 이름 = "칸";
		a전사.이름 = 이름;
		a전사.나이 = 20;
		a전사.자기소개();
		a전사.나이++;
		a전사.자기소개();
		a전사.나이 = 30;
		a전사.이름 = "카니";
		a전사.자기소개();
		a전사.a무기 = new 활();
		a전사.공격();
		// 출력 : 카니가 활로 공격합니다.
		a전사.a무기 = new 칼();
		a전사.공격();
		// 출력 : 카니가 칼로 공격합니다.

	}

}

class 전사 {
	// 인스턴스 변수
	String 이름;
	// 인스턴스 변수
	int 나이;
	// 인스턴스 변수
	무기 a무기;

	void 자기소개() {
		System.out.println("안녕하세요. 저는 " + this.나이 + "살 " + this.이름 + " 입니다.");
	}

	void 공격() {
		a무기.무기사용자 = this.이름;
		a무기.공격무기();
	}
}

abstract class 무기 {
	String 무기종류, 무기사용자;
	abstract void 공격무기();
}

class 칼 extends 무기 {
	void 공격무기() {
		무기종류 = "칼";
		System.out.println(this.무기사용자+"가 "+ 무기종류+"로 공격합니다."); // 카니가 활로 공격합니다.
	}
}

class 활 extends 무기 {
	void 공격무기() {
		무기종류 = "활";
		System.out.println(this.무기사용자+"가 "+ 무기종류+"로 공격합니다."); // 카니가 활로 공격합니다.
	}
}