package javachap04;

public class Chap04Test03 {

	public static void main(String[] args) {
		// �ֻ��� 2���� ���� 5�� ���α׷� �����Ͻÿ�.
		
		while(true) {
			int num1 = (int)(Math.random()*6)+1;
			int num2 = (int)(Math.random()*6)+1;
			
			if((num1+num2)==5) {
				
				System.out.println("(" + num1 + ", " + num2 + ")");
				break;
			}
			else {
				System.out.println("(" + num1 + ", " + num2 + ")");
			}
		}
		System.out.println("���α׷� ����");
	}
}
