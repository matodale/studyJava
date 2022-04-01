package exam01;

public class Exam04 {

	public static void main(String[] args) {
		int[] a = new int[] {};
		a = new int[] {20, 40};
		int[] b = a;
		
		System.out.println(b[0]); // 20 출력
		System.out.println(b[1]); // 40 출력
	}

}
