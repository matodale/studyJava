package lec02;

public class Exam03 {

	public static void main(String[] args) {
		Function fn1 = new Function1();
		fn1.run();
		fn1.fix();
		reFunction fn2 = new Function1();
		fn2.fuction_make();
		int a = fn2.plus(1,3);
		System.out.println(a);
	}

}
// 인터페이스는 해당 메소드를 정의함.
interface Function{
	void run();
	void fix();
}

interface reFunction{
	void fuction_make();
	int plus(int x1, int y1);
}


// 다중 상속이 가능
// 메소드를 묶어서 정의.
class Function1 implements Function, reFunction{
	public void run() {
		System.out.println("작동하겠습니다.");
	}
	public void fix() {
		System.out.println("수리하겠습니다.");
	}
	public void fuction_make() {
		System.out.println("작동하겠습니다.1");
		System.out.println("작동하겠습니다.2");
	}
	public int plus(int x, int y) {
		System.out.println("--- 더하기 ---");
		System.out.printf("%d + %d = ", x, y);
		return x+y;
	}
}