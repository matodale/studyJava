package lec01;

class car {
	void run() {
		System.out.println("자동차는 달립니다.");
	}
}
class car1 extends car{
	void run() {
		super.run(); // 명령문추가
		System.out.println("자동차는 달립니다.1");
	}
}

class car2 {
	void run() {
		System.out.println("자동차는 달립니다.2");
	}
}
class car3 {
	static void run() {
		System.out.println("자동차는 달립니다.3");
	}
}
class car4 {
	static int run(int i, int j) { // 리턴 타입을 같게 해줘야 사용이 가능.
		System.out.println(i+j);
		return i+j;
	}
}
class car5 {
	void run() {
		System.out.println("자동차는 달립니다.5");
	}
}

public class Exam02 {

	static void print_to5() {
		System.out.println("===1번===");
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
	}

	static void print_8Dan() {
		int dan = 8;
		System.out.println("===2번===");
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n", dan, i, dan * i);
		}
	}

	// 오버로딩
	static void print_Dan(int dan) {
		int i, j;
		i = dan;
		System.out.println("===3번===");
		for (j = 1; j <= 9; j++) {
			System.out.printf("%d * %d = %d\n", i, j, i * j);
		}
	}

	// 오버로딩 : 매개변수만 다르게 해서 함수명은 같게 사용이 가능.
	// static 객체화 없이 바로 호출
	static void print_Dan(int dan1, int dan2) {
		int i, j;
		i = dan1;
		j = dan2;
		System.out.println("===4번===");
		System.out.printf("%d * %d = %d\n", i, j, i * j);
		car2 car = new car2(); 
		car.run(); // 추가 명령 호출
	}
	
	
	public static void main(String[] args) {
		print_to5();
		print_8Dan();
		print_Dan(2);
		print_Dan(5, 8);
		
		// 5개의 서로 다른 종류의 객체를 만들고 각각의 객체에게 일을 시켜주세요.
		// 문제 : 아래 코드가 실행되도록 자동차 클래스를 만들어주세요.
		// 상속 받은 car1클래스를 사용
		car car = new car1(); 
		car.run();
		
		car3.run(); // 객체화 없이 사용
		int result = car4.run(30,40); // 70
		int su = result * 8; // 70 * 8
		System.out.println(su); // 560
	}

}
