package exam01;

//문제 : 아래와 같이 출력되도록 해주세요.
//조건 : `숨쉬다` 기능을 중복하지 말아주세요.
public class Exam02 {

	public static void main(String[] args) {
		Animals aPeople = new Person();
		aPeople.fn();
		
		
	}

}

class Animals {
	void fn() {
		System.out.println("숨쉬다.");
	}
}

class Person extends Animals{
	void fn() {
		super.fn();
		int[] arr = new int[3];
		for (int i = 0; i <3; i++) {
			arr[i] = i;
		}
		for (int i = 0; i < 3; i++) {
			System.out.println(arr[i]);
		}
	}
}