package lec01;

public class Exam02 {
	public static void main(String[] args) {
		Class_fn1 fn1 = new Class_fn1();
		fn1.fn1_name = "칸";
		fn1.fn1_age = 20;
		fn1.fn1_intro();
		// 안녕하세요. 저는 20살 칸 입니다.
		Class_fn1 fn2 = new Class_fn1();
		fn2.fn1_name = "칸";
		fn2.fn1_age = ++fn1.fn1_age;
		fn2.fn1_intro();
		// 안녕하세요. 저는 21살 칸 입니다.
		Class_fn1 fn3 = new Class_fn1();
		fn3.fn1_name = "카니";
		fn3.fn1_age = 30;
		fn3.fn1_intro();
		// 안녕하세요. 저는 30살 카니 입니다.
		
		fn3.fn2 = new Class_fn3();
		fn3.fn2_attack();
		// 카니 활로 공격합니다.
		fn3.fn2 = new Class_fn4();
		fn3.fn2_attack();
		// 카니 칼로 공격합니다.
	}
}

class Class_fn1 {
	String fn1_name;
	int fn1_age;

	void fn1_intro() {
		System.out.printf("안녕하세요. 저는 %d살 %s 입니다.\n", this.fn1_age, this.fn1_name);
	}

	Class_fn2 fn2;
	void fn2_attack() {
		fn2.fn2_name = this.fn1_name;
		fn2.fn2_run();
	}
}

class Class_fn2 {
	String fn2_name;
	void fn2_run() {
		System.out.println();
	}
}

class Class_fn3 extends Class_fn2 {
	void fn2_run() {
		System.out.println(fn2_name + " 활로 공격합니다.");
	}
}

class Class_fn4 extends Class_fn2 {
	void fn2_run() {
		System.out.println(fn2_name + " 칼로 공격합니다.");
	}
}