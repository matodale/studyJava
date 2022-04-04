package lec01;

public class Exam01 {

	public static void main(String[] args) {
		사람인력관리소 a사람인력관리소 = new 사람인력관리소();

		a사람인력관리소.add사람("홍길순", 33);
		// 나이가 33살인 1번째 사람(홍길순)이 추가되었습니다.
		a사람인력관리소.add사람("홍길동", 20);
		// 나이가 20살인 2번째 사람(홍길동)이 추가되었습니다.
		a사람인력관리소.add사람("임꺽정", 30);
		// 나이가 30살인 3번째 사람(임꺽정)이 추가되었습니다.

		사람 a사람1 = a사람인력관리소.get사람(1);
		a사람1.자기소개();
		// 저는 1번, 홍길순, 33살 입니다.

		사람 a사람2 = a사람인력관리소.get사람(2);
		a사람2.자기소개();
		// 저는 2번, 홍길동, 20살 입니다.

		사람 a사람3 = a사람인력관리소.get사람(3);
		a사람3.자기소개();
		// 저는 3번, 임꺽정, 30살 입니다.
	}

}

class 사람인력관리소 {
	사람 a처음사람;
	사람 a두번째사람;
	사람 a세번째사람;
	int 가장_마지막에_추가된_사람번호;

	void add사람(String 이름, int 나이) {
		사람 a사람 = new 사람();
		a사람.번호 = this.가장_마지막에_추가된_사람번호 + 1;
		a사람.이름 = 이름;
		a사람.나이 = 나이;
		
		System.out.printf("나이가 %d인 %d번째 사람(%s)이 추가되었습니다.\n", a사람.나이, a사람.번호, a사람.이름);
		
		if ( a사람.번호 == 1 ) {
			a처음사람 = a사람;
		}
		else if ( a사람.번호 == 2 ) {
			a두번째사람 = a사람;
		}
		else if ( a사람.번호 == 3 ) {
			a세번째사람 = a사람;
		}
		
		this.가장_마지막에_추가된_사람번호 = a사람.번호;
	}
	
	사람 get사람(int 번호) {
		사람 a사람 = null;

		if (번호 == 1) {
			a사람 = a처음사람;
		} else if (번호 == 2) {
			a사람 = a두번째사람;
		} else if (번호 == 3) {
			a사람 = a세번째사람;
		}

		return a사람;
	}

}

class 사람 {
	int 번호;
	int 나이;
	String 이름;

	void 자기소개() {
		System.out.printf("저는 %d번, %s, %d살 입니다.\n", 번호, 이름, 나이);
	}
}