package javachap06;

public class Chap06Test06example {

	public static void main(String[] args) {
		//getInstance()�޼ҵ�� �̱����� ���� �� �ֵ��� Chap06Test06 Ŭ������ �ۼ��غ��ÿ�.
		
		Chap06Test06 obj1 = Chap06Test06.getInstance();
		Chap06Test06 obj2 = Chap06Test06.getInstance();
		
		if(obj1 == obj2)
		{
			System.out.println("���� Chap06Test06 ��ü�Դϴ�.");
		}
		else {
			System.out.println("�ٸ� Chap06Test06 ��ü�Դϴ�.");
		}

	}

}
