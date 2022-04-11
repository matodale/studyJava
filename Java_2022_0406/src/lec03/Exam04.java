package lec03;

public class Exam04 {

	public static void main(String[] args) {
		사람 a김철수 = new 김철수();
		사람 a김영희 = new 김영희();

		a김철수.배달_음식_주문하다();
		// 영화반점에서 김철수(010-1234-1234)에게 매운 짬뽕(을)를 배달합니다.

		a김영희.배달_음식_주문하다();
		// 북경반점에서 김영희(010-4321-4321)에게 안매운 짬뽕(을)를 배달합니다.

		a김영희.a좋아하는_음식점 = a김철수.a좋아하는_음식점;
		a김영희.선호하는_음식의_매운정도 = "아주 매운";
		a김영희.선호하는_음식 = "짜장";

		a김영희.배달_음식_주문하다();
		// 영화반점에서 김영희(010-4321-4321)에게 아주 매운 짜장(을)를 배달합니다.

	}

}

class 사람 {
	String 이름, 전화번호, 선호하는_음식의_매운정도, 선호하는_음식;
	음식점 a좋아하는_음식점;

	void 배달_음식_주문하다() {
		a좋아하는_음식점.주문하다(이름, 전화번호, 선호하는_음식의_매운정도, 선호하는_음식);
	}
}

class 김철수 extends 사람 {
	김철수() {
		이름 = "김철수";
		a좋아하는_음식점 = new 영화반점();
		전화번호 = "010-4321-4321";
		선호하는_음식의_매운정도 = "매운";
		선호하는_음식 = "짬뽕";
	}

	@Override
	void 배달_음식_주문하다() {
		a좋아하는_음식점.주문하다(이름, 전화번호, 선호하는_음식의_매운정도, 선호하는_음식);
	}
}

class 김영희 extends 사람 {
	김영희() {
		이름 = "김영희";
		a좋아하는_음식점 = new 북경반점();
		전화번호 = "010-1234-1234";
		선호하는_음식의_매운정도 = "안 매운";
		선호하는_음식 = "짬뽕";
	}

	@Override
	void 배달_음식_주문하다() {
		a좋아하는_음식점.주문하다(이름, 전화번호, 선호하는_음식의_매운정도, 선호하는_음식);
	}
}

// new 음식점()이 안됨.
abstract class 음식점 {
	String 음식점;

	abstract void 주문하다(String 이름, String 전화번호, String 선호하는_음식의_매운정도, String 선호하는_음식);
}

class 영화반점 extends 음식점 {

	@Override
	void 주문하다(String 이름, String 전화번호, String 선호하는_음식의_매운정도, String 선호하는_음식) {
		음식점 = "영화반점";
		System.out.println(음식점 + "에서 " + 이름 + "(" + 전화번호 + ")에게 " + 선호하는_음식의_매운정도 + " " + 선호하는_음식 + "(을)를 배달합니다.");
	}
}

class 북경반점 extends 음식점 {
	@Override
	void 주문하다(String 이름, String 전화번호, String 선호하는_음식의_매운정도, String 선호하는_음식) {
		음식점 = "북경반점";
		System.out.println(음식점 + "에서 " + 이름 + "(" + 전화번호 + ")에게 " + 선호하는_음식의_매운정도 + " " + 선호하는_음식 + "(을)를 배달합니다.");
	}
}