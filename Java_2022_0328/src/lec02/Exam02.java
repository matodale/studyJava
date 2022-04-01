package lec02;

public class Exam02 {

	public static void main(String[] args) {
		// 상황 : DVD방에 3개의 서로다른 tv가 있다.
		// 영업을 하다보니 각 tv의 특별한 기능은 거의 사용될 일이 없고 기본적인 켜기/끄기 만 사용된다.
		// 현재 리모콘이 3개나 있는습니다.
		// 문제 : 알바를 편하게 하기 위해서 표준Tv 리모콘을 구현해주세요.
		System.out.println("== 표준Tv 리모콘 들여오기 전 ==");

		// 문제 : 아래 코드가 실행되도록 해주세요.
		ShaominTV aShaominTV = new ShaominTV();
		SamsungTV aSamsungTV = new SamsungTV();
		LGTV aLGTV = new LGTV();

		aShaominTV.on();
		// 출력 => 샤오미Tv 켜집니다.
		aShaominTV.off();
		// 출력 => 샤오미Tv 꺼집니다.
		aShaominTV.vroff();
		// 출력 => 샤오미Tv vr켜기!

		aSamsungTV.on();
		// 출력 => 삼성Tv 켜집니다.
		aSamsungTV.off();
		// 출력 => 삼성Tv 꺼집니다.
		aSamsungTV.aron();
		// 출력 => 삼성Tv ar켜기!

		aLGTV.on();
		// 출력 => LGTv 켜집니다.
		aLGTV.off();
		// 출력 => LGTv 꺼집니다.
		aLGTV.gameModeChange();
		// 출력 => LGTv 게임모드전환!

		System.out.println("== 표준Tv 리모콘 들여온 후 ==");

		// 표준Tv 리모콘을 만든다.
		nomalTv anomalTv;

		// a표준Tv 변수에 샤오미Tv 객체를 연결한다.
		anomalTv = aShaominTV;
		anomalTv.on();
		// 출력 : 샤오기TV 켜집니다.
		anomalTv.off();
		// 출력 : 샤오기TV 꺼집니다.

		// a표준Tv 변수에 삼성Tv 객체를 연결한다.
		anomalTv = aSamsungTV;
		anomalTv.on();
		// 출력 : 삼성TV 켜집니다.
		anomalTv.off();
		// 출력 : 삼성TV 꺼집니다.

		// a표준Tv 변수에 LGTv 객체를 연결한다.
		anomalTv = aLGTV;
		anomalTv.on();
		// 출력 : LGTV 켜집니다.
		anomalTv.off();
		// 출력 : LGTV 꺼집니다.

		// LGTV만의 고유 기능을 표준Tv 리모콘을 이용해서 호출하기 => 불가능
		// (LGTv) => a표준Tv 변수에 있던 표준Tv 리모콘이 LGTv리모콘화 해서 `aLGTv2` 변수에 들어간다.
		LGTV aLGTv2 = (LGTV) anomalTv;
		aLGTv2.gameModeChange();
	}
}

abstract class nomalTv{
	String nomalTv;
	abstract public void on(); 
	abstract public void off();
}

