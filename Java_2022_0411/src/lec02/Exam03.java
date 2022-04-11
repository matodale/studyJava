package lec02;
import java.util.Scanner;
public class Exam03 {

	public static void main(String[] args) {
		System.out.println("== 프로그램 시작 ==");
		Scanner sc = new Scanner(System.in);
		System.out.printf("명령어 )");
		String command = sc.nextLine();
		System.out.printf("입력된 명령어 : %s\n", command);
		
		System.out.printf("명령어 )");
		int num = sc.nextInt();
		System.out.printf("입력된 정수 : %d\n", num);
		sc.close();
		System.out.println("== 프로그램 끝 ==");
	}

}
