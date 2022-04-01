package lec02;

public class Exam04 {

	public static void main(String[] args) {
		// 설명
		int a;

		// 변수 a를 선언하고 빈 값으로 두었다.
		// 설명
		// class 무기 { void 공격() { } } 의 의미
		// 무기라는 클래스의 공격이라는 메소드를 생성. 명령문은 없다.
		
		게임.작동하다();
		// 게임 클래스의 작동하다라는 메소드의 a무기라는 무기 클래스 객체를 선언
		// 게임 클래스의 작동하다라는 메소드 호출.
		// `class 칼 extends 무기 { }` 의 의미 설명
		// 칼 클래스는 무기 라는 클래스에 상속된다.
	}

}

class 무기 {
	void 공격() {
	}
}

class 칼 extends 무기 {
	void 사과를_깍다() {
	}
}
class 게임 {
	static void 작동하다() {
		// 설명
		무기 a무기;
		// 무기 클래스를 변수 a무기라고 선언
		// 설명
		a무기 = new 무기();
		// a무기는 무기클래스 객체라고 선언함.
	}
}