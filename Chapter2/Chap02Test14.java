package minjichap02;

import java.util.Scanner;

public class Chap02Test14 {

	public static void main(String[] args) {
		//scanner�� �̿��� ȫ�浿, 123456, 010-1234-1234�� �̸�, �ֹι�ȣ �� 6�ڸ�, ��ȭ��ȣ ������� �Է¹����ÿ�
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("�̸� : ");
		String name = scanner.nextLine();
		
		System.out.print("�ֹι�ȣ �� 6�ڸ� : ");
		String num = scanner.nextLine();
		
		System.out.print("��ȭ��ȣ : ");
		String phone = scanner.nextLine();

	}

}
