package lec02;

//문제 : 자동차 설계도를 만들어주세요.
//문제 : 자동차 객체를 담을 변수를 만들어주세요.
//문제 : 자동차 객체를 만들고 변수에 담아주세요.
//문제 : 자동차 객체마다 서로 다른 최고속력를 가지도록 해주세요.
//문제 : 1개의 자동차가 3번 달리게 해주세요.
//문제 : 3개의 자동차가 각각 1번씩 달리게 해주세요.
public class Exam01 {

	public static void main(String[] args) {
		Car car1Menu = new Car();
		car1Menu.Menu("아이오닉", 200, 2500);
		car1Menu.Speed(3);
		car1Menu.Speed(1);

		Car car2Menu = new Car();
		car2Menu.Menu("카니발", 300, 3000);
		car2Menu.Speed(1);

		Car car3Menu = new Car();
		car3Menu.Menu("I30", 160, 2000);
		car3Menu.Speed(1);
	}
}

class Car {
	String carName;
	int carRPM, MaxSpeed;

	void Menu(String carName, int carRPM, int MaxSpeed) {
		this.carName = carName;
		this.carRPM = carRPM;
		this.MaxSpeed = MaxSpeed;
		System.out.printf("%s, %d, %d\n", this.carName, this.carRPM, this.MaxSpeed);
	}

	int Speed(int S) {
		System.out.println("자동차 달리는 횟수 : " + S);
		return S;
	}
	
}


