package exam01;

public class exam03 {

	public static void main(String[] args) {
		MyCustom ch1 = new MyCustom(); // 객체 선언
		MyCustom ch2 = new MyCustom();
		MyCustom ch3 = ch1;
		MyCustom ch4 = ch2;
		ch3.age = 20;
		ch3.isMarried = false;
		ch3.name = "김철수";
		ch4.age = 21;
		ch4.isMarried = false;
		ch4.name = "박희영";

		Person a = new Person(); // 객체 선언
		a.age = 23;
		a.isMarried = false;
		a.name = "이기철";
		a.name = "박철호";
		a.age = 23;
		a.introduce(); // 객체 함수 호출
	}
}

class MyCustom { // 클래스 선언
	int age;
	boolean isMarried;
	String name;

}

class Person { // 클래스 선언
	int age;
	boolean isMarried;
	String name;

	void introduce() { // 메서드 method 선언
		
		System.out.println("안녕하세요. 저는 50살 미혼 철수 입니다.");
		System.out.println("=== 자기 소개 ===");
		System.out.printf("이름 : %s\n", name); // 해당 클래스 변수를 가져옴.
		System.out.printf("나이 : %d\n", age);
		System.out.printf("결혼 여부 : %b\n", isMarried);
	}
}