package lec02;

public class Exam01 {

	public static void main(String[] args) {
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

	}

}

class ShaominTV extends nomalTv {
	String ShaomiTV = "샤오미Tv";
	@Override
	public void on() {
		System.out.println(this.ShaomiTV + " 켜집니다.");
	}
	@Override
	public void off() {
		System.out.println(this.ShaomiTV + " 꺼집니다.");
	}

	public void vroff() {
		System.out.println(this.ShaomiTV + " vr켜기!");
	}

}

class SamsungTV extends nomalTv {
	String SamsoungTV = "삼성Tv";
	@Override
	public void on() {
		System.out.println(this.SamsoungTV + " 켜집니다.");
	}
	@Override
	public void off() {
		System.out.println(this.SamsoungTV + " 꺼집니다.");
	}

	public void aron() {
		System.out.println(this.SamsoungTV + " ar켜기!");
	}

}

class LGTV extends nomalTv {
	String LGTV = "LGTv";
	@Override
	public void on() {
		System.out.println(this.LGTV + " 켜집니다.");
	}
	@Override
	public void off() {
		System.out.println(this.LGTV + " 꺼집니다.");
	}

	public void gameModeChange() {
		System.out.println(this.LGTV + " 게임모드전환!");
	}

}