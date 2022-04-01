package lec01;
// 문제 : 일반변수에 값 할당과정 설명

public class Exam01 {
	public static void main(String[] args) {
		new A().fn();
		// A.fn();
		A sc = new A();
		sc.fn();
		B aB = new B();
		aB.b1();
		aB.b2();
	}
}

class A {
	// static 을 쓰면 
	void fn() {
		System.out.println("Hello World");
	}
}


class B {
	void b1() {
		System.out.println("b1");
	}
	void b2() {
		System.out.println("b2");
	}
}
