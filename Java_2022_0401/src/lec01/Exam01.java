package lec01;
import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		// 2개의 정수가 공백으로 구분되어 입력된다.
		// 두 정수의 합을 출력한다.
		Scanner sc = new Scanner(System.in); 
		long firstNum = sc.nextLong(); 
		long secondNum = sc.nextLong(); 
		System.out.printf("%d", firstNum+secondNum);
		sc.close();
		
	}

}
