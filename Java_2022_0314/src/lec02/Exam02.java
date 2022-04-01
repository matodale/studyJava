package lec02;
//문제 : 객체를 사용하지 않고 2번째 플레이어를 만들어주세요.

public class Exam02 {

	public static void main(String[] args) {
		Player aPlayer1;
		aPlayer1 = new Player();
		aPlayer1.age = 20;
		aPlayer1.name = "홍길동";
		aPlayer1.job = "의적";
		
		Player aPlayer2 = new Player();
		aPlayer2.age = 25;
		aPlayer2.name = "임꺽정";
		aPlayer2.job = "도적";
	}

}

class Player {
	int age;
	String name,job;
}