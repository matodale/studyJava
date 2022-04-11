package lec01;

import java.util.ArrayList;
import java.util.List;
/*
 * ArrayList를 배워보자.
 * 배열의 장점
 * 관련된 데이터를 묶을 수 있다. (객체의 특징)*/
public class Exam01 {
	public static void main(String[] args) {
		// exam2();
		// exam3();
		exam4();
	}
	static void exam4() {
		List<Article> articles = new ArrayList<Article>();
		articles.add(new Article());
		articles.add(new Article());
		articles.add(new Article());
		articles.add(new Article());
		articles.add(new Article());
		
		for(int i = 0; i<articles.size(); i++) {
			Article article = articles.get(i);
			System.out.println(article.id);
		}
	}
	static void exam3() {
		ArrayList<Article> articles = new ArrayList<Article>(); // 재네릭 : 제한을 할 수 있는 것.
		articles.add(new Article());
		articles.add(new Article());
		articles.add(new Article());
		articles.add(new Article());
		articles.add(new Article());
		for (int i = 0; i< articles.size(); i++) {
			Article article = articles.get(i);
			System.out.println(article.id);
		}
	}
	static void exam2() {
		ArrayList<Article> articles = new ArrayList<Article>();
		articles.add(new Article());
		articles.add(new Article());
		articles.add(new Article());
		articles.add(new Article());
		articles.add(new Article());
		
		for (int i = 0; i< articles.size(); i++) {
			Article article = (Article) articles.get(i);
			System.out.println(article.id);
		}
	}
	static void exam1() {
		Article[] articles = new Article[1000]; // 배열 객체 1000 자리 로 생성.
		int articleSize = 0; // 객체의 번호를 가질 수 있는 변수를 지정.
		articles[0] = new Article(); // 배열 객체 주소 0번째 Article 클래스 생성
		articleSize++;
		articles[1] = new Article(); // 배열 객체 주소 1번째 Article 클래스 생성
		articleSize++;
		articles[2] = new Article(); // 배열 객체 주소 2번째 Article 클래스 생성
		articleSize++;
		articles[3] = new Article(); // 배열 객체 주소 2번째 Article 클래스 생성
		articleSize++;
		articles[4] = new Article(); // 배열 객체 주소 2번째 Article 클래스 생성
		articleSize++;
		for (int i = 0; i < articleSize; i++) {
			System.out.println(articles[i].id);
		}
	}
}

class Article {
	static int LastId; // 공유가 가능함.
	int id;
	String regDate;

	static { // 프로그램이 실행 될때 한번 실행됨.
		LastId = 0; // 초기값 설정
	}

	Article() { // new 연산자 에서 실행
		this(LastId + 1, "2022-12-12"); // 다른 생성자를 호출
		LastId++;
	}

	// 오버로딩
	Article(int id, String regDate) { // new 연산자에서 실행함
		this.id = id;
		this.regDate = regDate;
	}

}