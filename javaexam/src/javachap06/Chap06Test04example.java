package javachap06;

public class Chap06Test04example {
	public static void main(String[] args) {
		//login �޼ҵ�� id�� "hong", pw�� "12345"�� ��츸 true����, logout �޼ҵ�� "�α׾ƿ� �Ǿ����ϴ�."�� ����ϼ���.
		
		Chap06Test04 chap06test04 = new Chap06Test04();
		boolean result = chap06test04.login("hong", "12345");
		if(result) {
			System.out.println("�α��� �Ǿ����ϴ�.");
			chap06test04.logout("hong");
		}else {
			System.out.println("id �Ǵ� password�� �ùٸ��� �ʽ��ϴ�.");
		}
	}
}
