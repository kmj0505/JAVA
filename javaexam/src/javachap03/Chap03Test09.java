package javachap03;

import java.util.Scanner;

public class Chap03Test09 {

	public static void main(String[] args) {
		
		// �Էµ� ���� ����� ����ϵ�, �� ��°�� �Է¹޴� ���� 0.0 �Ǵ� 0�� ��� ���Ѵ�� ����� ������ �Ͻÿ�
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("ù ��° �� : ");
		String var1 = scanner.nextLine();
		
		System.out.print("�� ��° �� : ");
		String var2 = scanner.nextLine();
		
		double result = Double.parseDouble(var1) / Double.parseDouble(var2);
		
		if((var2 == "0.0") || (var2 == "0"))
		{
			System.out.print("��� : ���Ѵ�");
		}
		else
		{
			System.out.print("��� : " + result);
		}
		
	}

}
