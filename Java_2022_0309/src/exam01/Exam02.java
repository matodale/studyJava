package exam01;

public class Exam02 {

	public static void main(String[] args) {
		int a = 5;
		fnA(a); // 함수 호출
		System.out.println(a); // 5를 출력
		int[] arr = new int[3]; // new연산자 배열 선언
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		fnB(arr); 
		System.out.printf("a[0] : %d\n", arr[0]); // 50을 출력함.
		fnC(4,3); // 7을 출력
		int[] arr2 = new int[3];
		fnD(arr2); // fnD 메서드 호출 및 출력
		int b = 10;
		fnE(b); // 10을 출력
		System.out.printf("%d\n", b); // 
		
		System.out.println("=== 함수6 ===");
		int[] c = new int[] {10, 20}; // new 생성자 선언
		int[] d = c;
		d[0] = 100;
		d[1] = 200;
		System.out.println(c[0]); // 100 출력
		System.out.println(c[1]); // 200 출력
	}
	static void fnA(int a) { // fnA 메서드 선언
		System.out.println("=== 함수1 ===");
//		for(int i = 1; i<=9; i++) {
//			System.out.printf("%d * %d = %d\n", dan , i, dan*i);
//		}
		a = 20;
		
	}
	static void fnB(int[] arr) {
		System.out.println("=== 함수2 ===");
		arr[0] = 50;
	}
	static void fnC(int a, int b) {
		System.out.println("=== 함수3 ===");
		System.out.println(a+b);
	}
	static void fnD(int[] arr2) {
		System.out.println("=== 함수4 ===");
		for(int i = 0; i < arr2.length; i++) {
			arr2[i] = (i+1)*10;
			System.out.println(arr2[i]); // 10 20 30
		}
	}
	static void fnE(int data) {
		System.out.println("=== 함수5 ===");
		data = 20;
	}
}
