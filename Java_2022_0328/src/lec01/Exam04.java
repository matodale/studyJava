package lec01;

import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();

		// String을 8진수로 변경
		int octal = Integer.parseInt(s, 8);

		// 8진수를 10진수로 출력
		System.out.printf("%d", octal);

		/*
		 * String에서 n진수로 변환
		 * 
		 * 2진수 : Integer.valueOf(String s, 2);, return : int 
		 * 8진수 : Integer.valueOf(String s, 8);, return : int 
		 * 16진수 : Integer.valueOf(String s, 16);, return : int 
		 * 
		 * 10진수에서 n진수로 변환
		 * 2진수 : Integer.toBinaryString(int i), return : String 
		 * 8진수 : Integer.toOctalString(int i), return : String 
		 * 16진수 : Integer.toHexString(int i), return : String 
		 * 
		 * 10진수를 2, 8, 16 진수로 변환하는 소스코드 n진수에서 10진수로 변환
		 * 2진수 : Integer.parseInt(String s, 2);, return : int 
		 * 8진수 : Integer.parseInt(String s, 8);, return : int 
		 * 16진수 : Integer.parseInt(String s, 16);, return : int
		 */
	}

}
