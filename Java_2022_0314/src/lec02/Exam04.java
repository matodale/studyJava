package lec02;
//문제 : 번호가 다른 각각의 자동차가 서로 다른 최고속력으로 달리게 해주세요.
public class Exam04 {

	public static void main(String[] args) {
		
		runCar aCar1 = new runCar();
		runCar aCar2 = new runCar();
		aCar1.carName = "아이오닉 "; // 상위 클래스
		aCar1.MaxSpeed = 230;
		aCar1.runing();
		aCar2.carName = "아이오닉5 ";
		aCar2.MaxSpeed = 250;
		aCar2.runing();
	}

}

class runCar extends Car{
	String carName_ex1;
	int maxSpeed_ex1;

	void runing() {
		carName_ex1 = this.carName;
		maxSpeed_ex1 = this.MaxSpeed;	
		System.out.println(carName_ex1 + maxSpeed_ex1);
	}
}
