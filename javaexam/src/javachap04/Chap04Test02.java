package javachap04;

public class Chap04Test02 {

	public static void main(String[] args) {
		//1���� 100���� ���� �� 3�� ����� ������ ���Ͻÿ�
		
		int sum=0;
		int i;
		
		for(i=1; i<100; i++)
		{
			if(i%3 == 0)
			{
				sum += i;
			}
			
		}
		System.out.println(sum);
	}
}
