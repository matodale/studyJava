package exam01;


class Exam01 {
	
	public static void main(String[] args) {
		// trim() 메소드는 문자열의 양쪽 공백을 없애주는 기능을 합니다.

        String a="a b c d e";
        String [] b= a.split(" ");
        System.out.println(b[0]);
        System.out.println(b[1]);
        System.out.println(b[2]);
        System.out.println(b[3]);
        System.out.println(b[4]);
        // 결과값의 반환을 하나씩 입력
        
        System.out.println("-----");
        for(int i=0; i<5; i++){
        	System.out.println(b[i]);
        }
        System.out.println("-----");
        
        // 결과값의 반환을 for문을 이용하여 split 의 결과 a/b/c/d/e 5개이므로 b[0]~b[4]
        // 하지만, 위의 방법에는 단점이 있다. 문장이 아주 길어진다면 어떻게 될까요. 0~4까지인지 확인이 불가능하다.
        String c=a.replace(" ", "");
        for(int j=0; j<c.length(); j++){
                System.out.println(b[j]);
        }
        // 따라서 c라는 String이라는 값을 두고 공백을 제거한 것이므로 한 글자씩 split의 경우에는 c.length()
        // 의 length -1의 값과 같다. 하지만 한 글자 이상의 String을 split 한다면 또 생각해야한다.
	}

}
