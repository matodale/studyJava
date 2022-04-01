import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class exam03 {
	public static void main(String[] args) {
		int dan = 8;
		int i = 1;
		// 포멧 변환
		String str = String.format("%d * %d = %d", dan, i, dan*i);
		System.out.println("[" + str + "]");
		
		int[] arr = new int[3]; // 정수 타입 배열 선언
		// 배열변수[인덱스] = 값;
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		
		int[] arr2 = arr;
		arr2[0] = 10;
		arr2[1] = 20;
		arr2[2] = 30;
		
		boolean[] arr5 = new boolean[3]; // 객체 생성
		
		arr5[0] = true;
		arr5[1] = true;
		arr5[2] = false;
		
		// boolean[] arr6 = {true, false, true};
		// double[] arr7 = {3.14, 5.55, 10.0};
		
		/*
		 * HashSet은 Set 인터페이스의 구현 클래스입니다. 
		 * 그렇기에 Set의 성질을 그대로 상속받습니다. 
		 * Set은 객체를 중복해서 저장할 수 없고 하나의 null 값만 저장할 수 있습니다. 
		 * 또한 저장 순서가 유지되지 않습니다. 
		 * 만약 요소의 저장 순서를 유지해야 한다면 JDK 1.4부터 제공하는 LinkedHashSet 클래스를 사용하면 됩니다. 
		 * Set 인터페이스를 구현한 클래스로는 HashSet과 TreeSet이 있는데 
		 * HashSet의 경우 정렬을 해주지 않고 TreeSet의 경우 자동정렬을 해준다는 차이점이 있습니다. 
		 * Set의 가장 큰 장점은 중복을 자동으로 제거해준다는 점입니다. 
		 * 만약 한 편의점에서 오늘 방문한 손님의 총숫자를 계산하고 싶을 경우도 있을 것입니다. 
		 * 이럴 경우 오늘 하루 동안 편의점을 여러 번 방문한 손님은 한 번으로 체크해주어야 정확한 손님의 숫자가 나올것입니다. 
		 */
		HashSet<Integer> arr3 = new HashSet<Integer>(Arrays.asList(1,2,3)); // 클래스 (객체) 생성
		arr3.add(4); // 값을 추가
		arr3.remove(1); // 값을 제거
		arr3.clear(); // 모든 값을 제거함.
		/*
		 * 
		 * */
		ArrayList<Integer> arr4 = new ArrayList<Integer>(); // 객체 생성 , 순서가 중요함.
		arr4.add(0, 0); // 배열리스트인 경우 인덱스, 값으로 해당 인덱스의 값을 추가
		for(i=0;i<=4;i++) { // 0 1 2 3
			arr4.add(i,i); // 0부터 3까지 값을 추가.
		}
		System.out.print(arr4);
		arr4.remove(i); // arr4 클래스의 
			
	}
}
