package javachap03;

import java.util.Scanner;

public class Chap03Test11 {

	public static void main(String[] args) {
		//Id : java, Pw : 12345�� �α����� �����Ͻÿ�
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���̵� : ");
		String name = scanner.nextLine();
		
		System.out.print("�н����� : ");
		String strPassword = scanner.nextLine();
		int password = Integer.parseInt(strPassword);
		
		if(name.equals("java")) {           //name == "java"�� �ȵȴ� (java�� ������ true, Ʋ���� false�� ��ȯ�ϱ� ������)
			if(password == 12345) {
				System.out.println("�α��� ����");
			}
			else {
				System.out.println("�α��� ���� : �н����尡 Ʋ��");
			}
			
		}
		else {
			System.out.println("�α��� ���� : ���̵� �������� ����");
		}
	}

}
