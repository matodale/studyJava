package lec01;
import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		// 입력된 실수를 소수점 이하 11자리까지 반올림하여 출력한다.
		// %.11lf 를 사용하면 소수점 이하 11자리까지 출력된다.
		Scanner sc = new Scanner(System.in);
		double f1 = sc.nextDouble();
		sc.close();
		String arr = String.format("%.11f", f1);
		System.out.println(arr);
		System.out.printf("%.11f", f1);
	}

}
