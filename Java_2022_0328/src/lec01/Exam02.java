package lec01;
import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		// 입력된 정수를 그대로 출력한다.
		// -2147483649
		Scanner sc = new Scanner(System.in);
		long f1 = sc.nextLong(); 
		sc.close();
		System.out.println(f1);
	}

}
