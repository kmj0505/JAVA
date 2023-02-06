package javachap06;

public class Chap06Test04example {
	public static void main(String[] args) {
		//login 메소드는 id가 "hong", pw가 "12345"일 경우만 true리턴, logout 메소드는 "로그아웃 되었습니다."를 출력하세요.
		
		Chap06Test04 chap06test04 = new Chap06Test04();
		boolean result = chap06test04.login("hong", "12345");
		if(result) {
			System.out.println("로그인 되었습니다.");
			chap06test04.logout("hong");
		}else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
	}
}
