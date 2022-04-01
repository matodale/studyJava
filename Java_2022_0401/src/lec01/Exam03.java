package lec01;
import java.util.Scanner;
public class Exam03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char f1 = sc.nextLine().charAt(0);
		int a = (int)f1+1;
		char f2 = (char) a;
		System.out.printf("%s",f2);
		sc.close();
	}
}
