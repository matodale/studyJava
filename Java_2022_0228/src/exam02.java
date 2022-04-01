import java.util.Scanner;
class exam02 {
	private static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.print("당신의 이름을 입력하시오. : ");
		String name = sc.nextLine();
		System.out.print("당신의 나이을 입력하시오. : ");
		int age = sc.nextInt();
		System.out.print("당신의 키를 입력하시오.(소수점 둘째 짜리까지만 나옴) : ");
		float height = sc.nextFloat();
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.printf("키 : %.2f", height);
	}
}
