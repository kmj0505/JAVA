package javachap04;

import java.util.Scanner;

public class Chap04Test07 {

	public static void main(String[] args) { 
		//while���� Scanner�� �̿��ؼ� Ű����� �Էµ� �����ͷ� ����, ���, ��ȸ, ���� ����� �����ϴ� �ڵ带 �ۼ��Ͻÿ�.
		
		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);
		
		
		while(run) {
			System.out.println("--------------------------------");
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("--------------------------------");
			System.out.print("����>");
		
			int inputData = Integer.parseInt(scanner.nextLine());
			
			switch(inputData) {
			case 1:
				System.out.print("���ݾ�> ");
				balance += Integer.parseInt(scanner.nextLine());
				break;
			case 2:
				System.out.print("��ݾ�> ");
				balance -= Integer.parseInt(scanner.nextLine());
				break;
			case 3:
				System.out.print("�ܰ�> ");
				System.out.println(balance);
				break;
			case 4:
				run = false;
				break;
			}
			System.out.println();
		}
		System.out.println("���α׷� ����");

	}

}
