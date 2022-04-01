package exam01;

public class exam02 {

	public static void main(String[] args) {
		int[] ages = new int[3];
		
		ages[0] = 10;
		ages[1] = 20;
		ages[2] = 30;
		System.out.println(ages[0] + ages[1] + ages[2]);
		// 인덱스로 위치값 지정
//		diary cheol_su = new diary();
//		cheol_su.name = "김철수";
//		cheol_su.age = 18;
//		cheol_su.height = 180.5;
//		cheol_su.marry = false;
		IntArr3 ages2 = new IntArr3();
		ages2.key0 = 10;
		ages2.key1 = 20;
		ages2.key2 = 30;
		System.out.println(ages2.key0 + ages2.key1 + ages2.key2);
		System.out.println(ages2.sum(ages2.key0, ages2.key1 , ages2.key2));
	}

}
//class diary{
//	String name;
//	int age;
//	double height;
//	boolean marry;
//}

class IntArr3 {
	int key0;
	int key1;
	int key2;
	int sum(int x, int y, int z){
		return x+y+z;
	}
}