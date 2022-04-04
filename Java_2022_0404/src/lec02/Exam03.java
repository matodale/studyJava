package lec02;

public class Exam03 {

	public static void main(String[] args) {
		Person_manager a_Person_manager = new Person_manager();

		a_Person_manager.add_Person("홍길순", 33);
		// 나이가 33살인 1번째 사람(홍길순)이 추가되었습니다.
		a_Person_manager.add_Person("홍길동", 20);
		// 나이가 20살인 2번째 사람(홍길동)이 추가되었습니다.
		a_Person_manager.add_Person("임꺽정", 30);
		// 나이가 30살인 3번째 사람(임꺽정)이 추가되었습니다.

		Person aPerson1 = a_Person_manager.get_Person(1);
		aPerson1.introduce();
		// 저는 1번, 홍길순, 33살 입니다.

		Person aPerson2 = a_Person_manager.get_Person(2);
		aPerson2.introduce();
		// 저는 2번, 홍길동, 20살 입니다.

		Person aPerson3 = a_Person_manager.get_Person(3);
		aPerson3.introduce();
		// 저는 3번, 임꺽정, 30살 입니다.
	}

}

class Person_manager {
	// 전역변수
	Person[] b_Person;
	int last_Person;

	Person_manager() {
		last_Person = 0;
		b_Person = new Person[100];
	}

	void add_Person(String p_name, int p_age) {
		// 지역 변수
		int num = last_Person + 1; // num = 1 , 2 , 3
		Person a_Person = new Person();
		a_Person.num = num;
		a_Person.name = p_name;
		a_Person.age = p_age;
		
		b_Person[num - 1] = a_Person; 
		System.out.printf("나이가 %d인 %d번째 사람(%s)이 추가되었습니다.\n", p_age, num, p_name);
		last_Person = num; // last_Person = 1 , 2 , 3
	}

	Person get_Person(int num) {
		return b_Person[num - 1];
	}
}

class Person {
	String name;
	int age;
	int num;

	void introduce() {
		System.out.printf("저는 %d번, %s, %d살 입니다.\n", num, name, age);
	}

}