package lec02;

public class Exam05 {

	public static void main(String[] args) {
		// 문제 : 아래가 실행되도록 해주세요.
		전사 a전사 = new 전사();

		a전사.나이 = 20;
		a전사.a무기 = new 활();

		a전사.a무기 = new 칼();
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
		a무기.작동(이름);
	}

}

class 무기 {
	void 작동(String 사용자) {
		System.out.println(사용자+"가 무기로 공격합니다.");
	}
}

class 활 extends 무기 {
	void 작동(String 사용자) {
		System.out.println(사용자+"가 활로 공격합니다.");
	}
}

class 칼 extends 무기 {
	void 작동(String 사용자) {
		System.out.println(사용자+"가 칼로 공격합니다.");
	}
}