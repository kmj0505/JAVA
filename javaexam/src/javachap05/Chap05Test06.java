package javachap05;

import java.util.Scanner;

public class Chap05Test06 {

	public static void main(String[] args) {
		//Ű����κ��� �л� ���� ������ �Է¹޾Ƽ�, �ְ� ���� �� ��� ������ ���ϴ� ���α׷��� ����ÿ�
		
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		int max = 0;
		int sum = 0;
		
		while(run) {
			System.out.println("---------------------------------------------");
			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
			System.out.println("---------------------------------------------");
			System.out.print("����> ");
			
			int selectNo = Integer.parseInt(scanner.nextLine());
			
			if(selectNo == 1)
			{
				System.out.print("�л���> ");
				studentNum = Integer.parseInt(scanner.nextLine());
				scores = new int[studentNum];
			}
			else if(selectNo ==2)
			{
				for(int i=0; i<studentNum; i++)
				{
					System.out.print("scores[" +i+ "]> ");
					scores[i] = Integer.parseInt(scanner.nextLine());
				}
			}
			else if(selectNo == 3)
			{
				for(int i=0; i<studentNum; i++)
				{
					System.out.println("scores[" +i+ "]> " + scores[i]);
				}
			}
			else if(selectNo == 4)
			{
				for(int i=0; i<studentNum; i++)
				{
					if(scores[i] > max)
					{
						max = scores[i];
					}
					sum += scores[i];
				}
				
				double avg = (double)sum / studentNum;
				System.out.println("�ְ� ����: " + max);
				System.out.println("��� ����: " + avg);
			}
			else if(selectNo == 5)
			{
				run = false;
			}
		}
		
		System.out.println("���α׷� ����");
	}

}
