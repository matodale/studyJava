package lec01;
import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		// 정수 1개가 입력된다.
		// 부호를 바꿔 출력한다.
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = -a;
		System.out.println(b);
		sc.close();
	}

}
