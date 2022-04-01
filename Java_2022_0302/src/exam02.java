import java.util.Scanner;
public class exam02 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			//		int a,b;
			//		a = sc.nextInt();
			//		b = sc.nextInt();
					char x,y;
					x = sc.next().charAt(0); // 문자 타입 입력
					y = sc.next().charAt(0); // 문자 타입 입력
					System.out.printf("%c %c", y,x);
		}
	}

}
