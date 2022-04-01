package lec01;
import java.util.Scanner;
public class Exam03 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String a = sc.next();
			String[] arr = a.split("\\.");
			int x = Integer.parseInt(arr[0]);
			int y = Integer.parseInt(arr[1]);
			int z = Integer.parseInt(arr[2]);
			System.out.printf("%02d-%02d-%4d", z, y, x);
		} catch (NumberFormatException e) {
			
			e.printStackTrace();
		}

	}

}
