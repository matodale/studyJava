package lec02;

//문제 : 각각의 자동차가 서로 다른 최고속력으로 달리게 해주세요.
public class Exam03 {

	public static void main(String[] args) {
		// 구현시작
		MaxSpeedCar aCar1 = new MaxSpeedCar();
		MaxSpeedCar aCar2 = new MaxSpeedCar();
		// 구현끝

		aCar1.run(230);
		// 출력 => 자동차가 최고속력 230km로 달립니다.

		aCar2.run(210);
		// 출력 => 자동차가 최고속력 210km로 달립니다.

	}

}

class MaxSpeedCar extends Car{
	int run(int MS) {
		this.MaxSpeed = MS;
		System.out.printf("자동차가 최고속력 %dkm로 달립니다.\n", this.MaxSpeed);
		return MS;
	}

	
}