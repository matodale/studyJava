package lec01;
import java.util.Scanner;
// 2147483648을 입력 받는다.
public class Exam04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next(); // 문자열로 받는 함수
		sc.close();
		System.out.printf("%s", a);
	}
}
