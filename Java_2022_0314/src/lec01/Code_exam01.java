package lec01;
import java.util.Scanner;
public class Code_exam01 {
	static int a,b,c;
	
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String A = sc.next();
			String[] arr = A.split("\\.");
			a = Integer.valueOf(arr[0]);
			b = Integer.valueOf(arr[1]);
			c = Integer.valueOf(arr[2]);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		System.out.printf("%4d.%02d.%02d", a,b,c);
	}

}
