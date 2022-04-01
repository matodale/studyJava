package exam01;
//문제 : 구구단을 만들어주세요

//출력양식
/*
== 2단 ==
2 * 1 = 2
2 * 2 = 4
2 * 3 = 6
...
== 9단 ==
9 * 1 = 9
...
9 * 9 = 81
*/

//문제 : 99단을 만들어주세요

public class Exam01 {

	public static void main(String[] args) {
		new DanFx().fn();
		// new Dan99Fx().fn();
		// 더한결과를_화면에_출력
		System.out.println();
		
		System.out.println(calc.plus(10, 20));
		// 출력 => 결과 : 30

		System.out.println(calc.plus(50, 20));
		// 출력 => 결과 : 70

		System.out.println(calc.minus(50, 20));
		// 출력 => 결과 : 30

		System.out.println(calc.minus(5, 2));
		// 출력 => 결과 : 3

		System.out.println(calc.multi(5, 2));
		// 출력 => 결과 : 10

		System.out.println();
		
		int result;

		result = calc.plus(10, 20);
		System.out.println("결과 : " + result);
		// 출력 => 결과 : 30

		result = calc.plus(30, 20);
		System.out.println("결과 : " + result);
		// 출력 => 결과 : 50

		result = calc.plus(30, 70);
		System.out.println("결과 : " + result);
		// 출력 => 결과 : 100

		result = calc.minus(30, 70);
		System.out.println("결과 : " + result);
		// 출력 => 결과 : -40

		result = calc.multi(3, 7);
		System.out.println("결과 : " + result);
		// 출력 => 결과 : 21
		System.out.println();

		// 문제 : 아래와 같이 출력 되도록 해주세요.
		// 예시 시작
		int c = 20 + Math.plus(10, 20);
		System.out.println(c);
		// 예시 끝

		int result1 = Math.oneToSum(3);
		System.out.println("결과1 : " + result1);
		// 출력 : 결과1 : 6

		int result2 = Math.oneToSum(10);
		System.out.println("결과2 : " + result2);
		// 출력 : 결과2 : 55

		int result3 = Math.nToMSum(2, 3);
		System.out.println("결과3 : " + result3);
		// 출력 : 결과1 : 5

		int result4 = Math.nToMSum(5, 10);
		System.out.println("결과4 : " + result4);
		// 출력 : 결과2 : 45
	}

}
class DanFx {
	// 구현시작
	void fn() {
		for (int x = 2; x <= 9; x++) {
			System.out.println("== " + x + "단 ==");
			for (int y = 1; y <= 9; y++) {
				System.out.printf("%d * %d = %d\n", x, y, x * y);
			}
		}
	}
	// 구현끝
}

class Dan99Fx {
	// 구현시작
	void fn() {
		for (int x = 2; x <= 99; x++) {
			System.out.println("== " + x + "단 ==");
			for (int y = 1; y <= 9; y++) {
				System.out.printf("%d * %d = %d\n", x, y, x * y);
			}
		}
	}
}

class calc {
	static int plus(int x, int y) {
		return x + y;
	}

	static int minus(int x, int y) {
		return x - y;
	}

	static int multi(int x, int y) {
		return x * y;
	}

}

class Math extends calc{
	static int re1, re2 = 0;
	static int oneToSum(int x) {
		for (int i = 0; i <= x; i++) {
			re1 += i;
		}
		return re1;
	}
	
	static int nToMSum(int i, int j) {
		for (int x = i; x <= j; x++) { 
			// 2 3
			// 5 6 7 8 9 10
			re2 += x;
		}
		return re2;
	}
}

