package javachap06;

public class Chap06Test06example {

	public static void main(String[] args) {
		//getInstance()메소드로 싱글톤을 얻을 수 있도록 Chap06Test06 클래스를 작성해보시오.
		
		Chap06Test06 obj1 = Chap06Test06.getInstance();
		Chap06Test06 obj2 = Chap06Test06.getInstance();
		
		if(obj1 == obj2)
		{
			System.out.println("같은 Chap06Test06 객체입니다.");
		}
		else {
			System.out.println("다른 Chap06Test06 객체입니다.");
		}

	}

}
