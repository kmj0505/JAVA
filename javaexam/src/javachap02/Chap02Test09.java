package javachap02;

public class Chap02Test09 {

	public static void main(String[] args) {
		//���� �� 9�� ������ ����ÿ�
		
		long var1 = 2L;
		float var2 = 1.8f;
		double var3 = 2.5;
		String var4 = "3.9";
		int result = (int)(var1+var2+var3) + (int)Double.parseDouble(var4);
		System.out.println(result);
		
	}
}
