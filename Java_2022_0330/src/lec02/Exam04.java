package lec02;

public class Exam04 {

	public static void main(String[] args) {
		// 문제 : 아래가 실행되도록 해주세요.
		Peason aPeople = new Peason();
		aPeople.age = 20;
		aPeople.aLeft_Pal = new Pal();
		aPeople.aLeft_Pal.range = 20;
		int a = aPeople.aLeft_Pal.range;
		System.out.println(a);
		aPeople.aLeft_Pal.fn();
	}

}

class Peason{
	// 클래스안에 변수를 정의 할 수 있다.
	int age;
	Pal aLeft_Pal; // 다른 클래스를 해당 클래스에서 연결 (기능을 추가)
}

class Pal{
	int range;
	void fn() {
		System.out.println("A");
	}
}