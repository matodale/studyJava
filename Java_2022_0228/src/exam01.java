class A { // 상위 클래스 선언
	int x, y;
	int fn(int x, int y) {
		while (x <= 10) {
			System.out.println(x + "번째");
			while (y <= 3) {
				System.out.println(y);
				y++;
			}
			y = 1;
			x++;
		}
		return 0;
	}
}
class B extends A{ // 상속
	int x1, y1;
	
	int fn(int x, int y) {
		x = this.x1;
		y = this.y1;
		System.out.println("for문으로 쓰일때");
		for(x= 1; x<10; x++) {
			System.out.println(x + "번째");
			for(y=1; y<4; y++) {
				System.out.println(y);
			}
			y = 1;
		}
		return 0;
	}
}

public class exam01 {
	public static void main(String[] args) {
		// 문제 : 1부터 3까지 출력하는 작업을 10번 해주세요.
		// 조건 : 2중 while문 사용
		int i=1,j=1; // 초기값 변수 선언
		A a1 = new B(); // for문으로 실행과 while 문으로 실행문 두가지
		a1.fn(i, j); 
	}
}
