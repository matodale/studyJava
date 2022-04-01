package lec01;
import java.util.Scanner;
public class Code_exam02 {
	static int a,b;
	
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String A = sc.next();
			String[] arr = A.split("\\-");
			a = Integer.valueOf(arr[0]);
			b = Integer.valueOf(arr[1]);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		System.out.printf("%06d%07d",a,b);
	}

}
