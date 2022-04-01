package lec02;

public class Exam03 {

	public static void main(String[] args) {
		사람 a사람 = new 사람();
		원숭이 a원숭이 = new 원숭이();
		
		// 문제 1 : 아래 줄의 코드가 되는 이유 설명
		동물 a동물 = a원숭이;
		// 원숭이 라는 클래스는 동물에 상속되어 원숭이 라는 클래스로 형변환이 된다.
		
		원숭이 a원숭이2 = null; // null 은 쓰레기 리모콘이라는 뜻
		
		// 문제 2 : 아래 줄의 코드가 안되는 이유 설명
		// a원숭이2 = a동물;
		// 동물 클래스는 하위 클래스인 원숭이를 상속 받지 않기 때문이다.
		
		// 문제 3 : 아래 줄의 되는 이유 설명
		a원숭이2 = (원숭이)a동물;
		// 원숭이 클래스를 동물이라는 변수로 변환
		
		사람 a사람2 = null;
		
		// 문제 4 : 아래 줄의 코드가 수동 형변환 까지 했는데도 안되는 이유 설명
		// a사람2 = (사람)a동물;
		// 사람 클래스는 동물에 상속을 받습니다. 동물 클래스는 사람 클래스의 상위 클래스 이므로 형식에 맞지 않는다.
	}

}

abstract class 동물 {
	void 숨쉬다() {
		System.out.println("동물이 숨을 쉽니다.");
	}
}
class 사람 extends 동물 {
	void 말하다() {
		System.out.println("사람이 말을 합니다.");
	}
}
class 원숭이 extends 동물 {
	void 원숭이묘기를하다() {
		System.out.println("원숭이묘기를하다.");
	}
}