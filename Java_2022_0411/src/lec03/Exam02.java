package lec03;

import java.util.Scanner;
import java.util.ArrayList;

/* 

  게시물관리 프로그램에 오신걸 환영합니다!! 메뉴를 선택해주세요.
   1. 회원가입
   2. 로그인
   3. 비밀번호 찾기
   4. guest로 로그인

> 1

  회원가입을 진행합니다.
> 사용할 아이디를 입력해주세요.
> hong123 (이미 존재하는 아이디로 입력했을 경우)
  이미 존재하는 아이디입니다. 다른 아이디를 입력해주세요.

> 사용할 아이디를 입력해주세요.
> chacha123

> 사용할 비밀번호를 입력해주세요.
> aa123
  비밀번호는 8자리 이상 입력해주세요.

> 사용할 비밀번호를 입력해주세요.
> a12341234

> 이름을 입력해주세요.
> 김혜지

  아이디 : chacha123, 비밀번호 : a12341234, 이름 : 김혜지

> 이대로 진행하시겠습니까? (y / n)
> y

  회원가입이 완료되었습니다.

  메뉴를 선택해주세요.
   1. 회원가입
   2. 로그인
   3. 비밀번호 찾기
   4. guest로 로그인

> 2

> 아이디를 입력해주세요.
> asdf (없는 아이디일 경우)
> 없는 아이디입니다.
  
  메뉴를 선택해주세요.
   1. 회원가입
   2. 로그인
   3. 비밀번호 찾기
   4. guest로 로그인

> 2

> 아이디를 입력해주세요.
> chacha123

> 비밀번호를 입력해주세요.
> asdfsdff (틀린 비밀번호일 경우)

  비밀번호를 틀렸습니다.

  메뉴를 선택해주세요.
   1. 회원가입
   2. 로그인
   3. 비밀번호 찾기
   4. guest로 로그인

> 2

> 아이디를 입력해주세요.
> chacha123

> 비밀번호를 입력해주세요.
> a12341234

  김혜지님! 반갑습니다! 게시물 메뉴를 선택해주세요.
  
  [게시물 메뉴...]

*/

class Exam02 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		MemberManager mm = new MemberManager();

		String cmd = "";
		Member loginedMember = null;

		// 회원 관리 플로우
		while (true) {

			System.out.println("게시물관리 프로그램에 오신걸 환영합니다!! 메뉴를 선택해주세요.\n1. 회원가입\n2. 로그인\n3. 비밀번호 찾기\n4. guest로 로그인");
			System.out.print("> ");
			cmd = scan.next();

			if (cmd.equals("exit")) {

				System.out.println("프로그램이 종료됩니다.");
				break;

			} else if (cmd.equals("1")) {

				System.out.println("회원 가입을 진행합니다.");
				String id = "";
				String pw = "";
				String nm = "";

				while (true) {
					System.out.println("사용할 아이디를 입력해주세요.");
					System.out.print("> ");
					id = scan.next();

					if (mm.isExistId(id) > -1) {
						System.out.println("이미 존재하는 아이디입니다.");
					} else {
						while (true) {

							System.out.println("사용할 비밀번호를 입력해주세요.");
							System.out.print("> ");
							pw = scan.next();

							if (pw.length() < 8) {
								System.out.println("비밀번호는 8자리 이상 입력해주세요.");
							} else {
								System.out.println("이름을 입력해주세요.");
								System.out.print("> ");
								nm = scan.next();
								break;
							}
						}

						System.out.println("아이디 : " + id + ", 비밀번호 : " + pw + ", 이름 : " + nm);
						System.out.println("이대로 진행하시겠습니까? (y / n)");
						System.out.print("> ");
						String yn = scan.next();

						if (yn.equals("y")) {
							break;
						}

					}
				}

				Member m = new Member(id, pw, nm);
				mm.addMember(m);
				System.out.println("회원가입이 완료되었습니다.");

			} else if (cmd.equals("2")) {

				System.out.println("아이디를 입력해주세요.");
				System.out.print("> ");
				String id = scan.next();
				Member m = mm.getMemberById(id);

				if (m == null) {
					System.out.println("없는 아이디입니다.");
				} else {

					System.out.println("비밀번호를 입력해주세요.");
					System.out.print("> ");
					String pw = scan.next();
					if (m.loginPw.equals(pw)) {
						System.out.println(m.name + "님 반갑습니다! 게시물 메뉴를 선택해주세요.");
						loginedMember = m;
						break;
					} else {
						System.out.println("비밀번호를 틀렸습니다.");
					}
				}
			}
		}

		// 게시물 관리 플로우
		ArticleManager am = new ArticleManager();
		am.init();

		System.out.println(loginedMember.loginId + "님! 반갑습니다! 아래는 현재 게시물을 목록입니다. 명령어 목록을 보시려면 help를 입력하세요. ");
		am.printArticles();

		while (true) {

			System.out.print("> ");
			cmd = scan.next();

			if (cmd.equals("help")) {

				am.printHelp();

			} else if (cmd.equals("read")) {

				am.printArticles();

				System.out.println("몇번 게시물을 보시겠습니까?");
				System.out.print("> ");
				int aid = scan.nextInt();

				am.printArticleById(aid);

				System.out.println("댓글을 다시겠습니까? (y/n)");
				System.out.print("> ");
				String yn = scan.next();

				if (yn.equals("y")) {
					System.out.println("댓글 내용을 등록해주세요.");
					System.out.print("> ");
					String replyBody = scan.next();
					String writer = loginedMember.loginId;
					am.insertReply(aid, replyBody, writer);
					am.printArticleById(aid);
				}

			} else if (cmd.equals("create")) {

				System.out.println("게시물 제목을 입력해주세요.");
				System.out.print("> ");
				String title = scan.next();

				System.out.println("게시물 내용을 입력해주세요.");
				System.out.print("> ");
				String body = scan.next();
				String writer = loginedMember.loginId;

				am.insertArticle(title, body, writer);

				System.out.println("게시물이 성공적으로 등록되었습니다.");

				am.printArticles();
			} else if (cmd.equals("update")) { // 문자열 비교

				System.out.println("몇번 게시물을 수정하시겠습니까?");
				System.out.print("> ");
				int aid = scan.nextInt();

				System.out.println("제목을 수정해주세요.");
				System.out.print("> ");
				String title = scan.next();

				System.out.println("내용을 수정해주세요.");
				System.out.print("> ");
				String body = scan.next();

				am.updateArticle(aid, title, body);

				System.out.println("게시물이 성공적으로 수정되었습니다.");

				am.printArticles();

			} else if (cmd.equals("delete")) {
				System.out.println("몇번 게시물을 삭제하시겠습니까?");
				System.out.print("> ");
				int aid = scan.nextInt();

				am.deleteArticle(aid);

				System.out.println("게시물이 성공적으로 삭제되었습니다.");

				am.printArticles();
			}
		}
	}

}

class MemberManager {

	Member[] mlist;
	int size;

	MemberManager() {
		mlist = new Member[10];
		size = 0;
	}

	int isExistId(String id) {

		int index = -1;

		for (int i = 0; i < size; i++) {
			if (mlist[i].loginId.equals(id)) {
				index = i;
				break;
			}
		}

		return index;
	}

	Member getMemberById(String id) {
		int idx = isExistId(id);

		if (idx > -1) {
			return mlist[idx];
		}

		return null;
	}

	void addMember(Member m) {
		if (size < 10) {
			this.mlist[size] = m;
			size++;
		} else {
			System.out.println("저장소가 가득 찼습니다.");
		}
	}
}

class ArticleManager {

	// 게시물
	ArrayList<Integer> idList = new ArrayList<Integer>();
	ArrayList<String> titleList = new ArrayList<String>();
	ArrayList<String> bodyList = new ArrayList<String>();
	ArrayList<String> writerList = new ArrayList<String>();
	int lastId;

	// 댓글
	ArrayList<Integer> parentIdList = new ArrayList<Integer>();
	ArrayList<String> replyBodyList = new ArrayList<String>();
	ArrayList<String> replyWriterList = new ArrayList<String>();

	void init() {
		idList.add(1);
		titleList.add("제목1");
		bodyList.add("내용1");
		writerList.add("hong123");

		idList.add(2);
		titleList.add("제목2");
		bodyList.add("내용2");
		writerList.add("user2");

		idList.add(3);
		titleList.add("제목3");
		bodyList.add("내용3");
		writerList.add("user3");

		lastId = 3;

		parentIdList.add(2);
		replyBodyList.add("2번 게시물 좋습니다!!");
		replyWriterList.add("user1");

		parentIdList.add(2);
		replyBodyList.add("저도 user2님 응원합니다!");
		replyWriterList.add("user3");

	}

	void printHelp() {
		System.out.println("create : 게시물 등록");
		System.out.println("read   : 게시물 조회");
		System.out.println("update : 게시물 수정");
		System.out.println("delete : 게시물 삭제");
	}

	void printArticles() {
		System.out.println("======================== 게시물 목록 ==========================");
		for (int i = 0; i < idList.size(); i++) {
			System.out.println(
					"게시물 번호 : " + idList.get(i) + "      제목 : " + titleList.get(i) + "     작성자 : " + writerList.get(i));
		}
		System.out.println("================================================================");
	}

	void printArticleById(int id) {
		int idx = getArticleIndexById(id);

		if (idx > -1) {
			System.out.println("======================== 게시물 상세 ==========================");
			System.out.println("게시물 번호  : " + idList.get(idx));
			System.out.println("제목        : " + titleList.get(idx));
			System.out.println("내용        : " + bodyList.get(idx));
			System.out.println("작성자      : " + writerList.get(idx));
			System.out.println("================================================================");
			printReplyByArticleId(id);
			System.out.println("================================================================");
		} else {
			System.out.println("없는 게시물입니다.");
		}
	}

	void insertArticle(String title, String body, String writer) {

		int id = this.lastId + 1;

		idList.add(id);
		titleList.add(title);
		bodyList.add(body);
		writerList.add(writer);

	}

	void updateArticle(int id, String title, String body) {
		int idx = getArticleIndexById(id);

		if (idx > -1) {
			titleList.set(idx, title);
			bodyList.set(idx, body);
		} else {
			System.out.println("없는 게시물입니다.");
		}
	}

	void deleteArticle(int id) {
		int idx = getArticleIndexById(id);

		if (idx > -1) {

			idList.remove(idx);
			titleList.remove(idx);
			bodyList.remove(idx);
			writerList.remove(idx);

		} else {
			System.out.println("없는 게시물입니다.");
		}
	}

	int getArticleIndexById(int id) {

		int idx = -1;

		for (int i = 0; i < idList.size(); i++) {
			if (id == idList.get(i)) {
				idx = i;
				break;
			}
		}

		return idx;
	}

	void printReplyByArticleId(int id) {
		for (int i = 0; i < parentIdList.size(); i++) {
			if (id == parentIdList.get(i)) {
				System.out.println("댓글 : " + replyBodyList.get(i) + "           작성자 : " + replyWriterList.get(i));
			}
		}
	}

	void insertReply(int parentId, String replyBody, String replyWriter) {
		parentIdList.add(parentId);
		replyBodyList.add(replyBody);
		replyWriterList.add(replyWriter);
	}

}

class Member {

	Member(String id, String pw, String nm) {
		this.loginId = id;
		this.loginPw = pw;
		this.name = nm;
	}

	String loginId;
	String loginPw;
	String name;
}
