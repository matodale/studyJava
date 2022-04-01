package exam01;

public class exam01 {
	public static void main(String[] args) {
		boolean[] studentMilks = new boolean[4];
		studentMilks[0] = false;
		studentMilks[1] = true;
		studentMilks[2] = true;
		studentMilks[3] = false;
		
		System.out.println("== 학생 우유급식 내역 ==");
		for ( int i = 0; i < studentMilks.length; i++ ) {
			int no = i + 1;
			String yesOrNo = "아니오";
			if ( studentMilks[i] ) {
				yesOrNo = "예";
			}
			System.out.printf("%d번 학생 우유 먹나요? : %s\n", no, yesOrNo);
		}
	}
}
