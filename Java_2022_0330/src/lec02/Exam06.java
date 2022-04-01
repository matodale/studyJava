package lec02;

public class Exam06 {

	public static void main(String[] args) {
		// 문제 : 아래가 실행되도록 해주세요.
		전사 a전사 = new 전사();

		String 이름 = "칸";
		a전사.이름 = 이름;
		a전사.나이 = 20;
		a전사.자기소개();

		a전사.나이++;
		a전사.자기소개();

		a전사.나이 = 30;
		a전사.이름 = "카니";
		a전사.자기소개();
		
		a전사.a무기 = new 활();
		a전사.공격();
		// 출력 : 카니가 활로 공격합니다.

		a전사.a무기 = new 칼();
		a전사.공격();
		// 출력 : 카니가 칼로 공격합니다.
	}

}




