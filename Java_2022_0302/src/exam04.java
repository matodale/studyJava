
public class exam04 {

	public static void main(String[] args) {
		
		int[] arr = new int[10];
		System.out.printf("인덱스 값 : %d\n",arr.length); // 배열 변수 arr 인덱스 값
		
		for (int i = 0; i <arr.length; i++) {
			arr[i] = (i + 1) * 10; 
			System.out.print(arr[i]+" ");
			
		}
		// 10 20 30 40 50 60 70 80 90 100, 출력
		System.out.println("");
		int sum = 0 ;
		int i = 0;
		while(i<arr.length) { // i = 0 1 2 3 4 5 6 7 8 9 증가
			sum += arr[i]; 
			if (i == 9) {
				System.out.print(arr[i] + "=");
			}
			else {
				System.out.print(arr[i] + "+");
			}	
			i++;
		}
		// 10+20+30+40+50+60+70+80+90+100=, 출력
		System.out.println(sum); // 550, 출력
		System.out.println(sum/arr.length); // 배열 수 만큼 나누어 평균값을 출력
	}

}
