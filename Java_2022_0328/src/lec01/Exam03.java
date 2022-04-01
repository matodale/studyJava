package lec01;
import java.util.Scanner;
public class Exam03 {

	public static void main(String[] args) {
		// 10진수 1개가 입력된다.
		// 단, 입력되는 정수는 int 범위이다.
		// 입력은 8
		// %o를 사용해 출력하면 8진수(octal)로 출력된다.
		Scanner sc = new Scanner(System.in);
		int f1 = sc.nextInt();
		sc.close();
		System.out.printf("%o\n", f1);
		System.out.printf("%x\n", f1);
		System.out.printf("%X\n", f1);
	}

}
