package javachap06;

public class Chap06Test02 {

	public class Member {
		//Member user1 = new Member("홍길동", "hong"); 객체 생성 시 생성자에서 name 필드와 id필드를 외부에서 받은 값으로 초기화 할 수 있도록 클래스 작성하기
		
		String name;
		String id;
		
		Member(String name, String id){
			this.name = name;
			this.id = id;
		}
		
	}
}
