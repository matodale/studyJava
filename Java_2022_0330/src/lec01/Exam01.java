package lec01;

import java.util.Scanner;
public class Exam01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char f1 = sc.nextLine().charAt(0);
		int a = (int)f1;
		System.out.printf("%d",a);
		
		sc.close();
	}

}
