package lec01;
import java.util.Scanner;
public class Exam02 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String a = sc.next();
			String[] arr = a.split("\\:"); // 문자열 타입 배열을 :표시로 나눈다.
			int b = Integer.parseInt(arr[1]); // 배열 arr 중 두번째 배열만 가져온다.
			if(b <= 9)
			    System.out.printf("%1d", b);
			else
			    System.out.printf("%d", b);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}
}
