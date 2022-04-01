package lec02;

public class Exam02 {
	public static void main(String[] args) {
		// 문제 : 자동차 리모콘이 페라리 객체를 가리키게 한 후 
		// 해당 리모콘이 가리키고 있는 객체를 다시 페라리 리모콘으로 가리키게(참조하게) 하는 코드를 작성해주세요.
		// 수정가능지역 시작
		Palali f1 = new Palali();
	    Car f2 = (Palali) f1; // f1을 형변환 Car 클래스 f2 변수에 대입
	    Palali f3 = (Palali) f2;
	    f3.car_open();
	    // 수정가능지역 끝
	}
}


class Car {
	void run() {
		System.out.println("A");
	}
	void stop() {
		System.out.println("B");
	}
}
class Palali extends Car {
	void car_open() {
		System.out.println("C");
	}
}