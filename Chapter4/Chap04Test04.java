package minjichap04;

public class Chap04Test04 {

	public static void main(String[] args) {
		// 4x+5y=60�� �����ϴ� ��� �ظ� ���ؼ� (x,y)�� ���·� ��Ÿ���ÿ�.
		
		
		for(int x=1; x<=10; x++)
		{
			for(int y=1; y<=10; y++)
			{
				if(4*x + 5*y == 60)
				{
					System.out.println(4*x + "+" + 5*y + "=" + "60");
					System.out.println("(" + x + ", " + y + ")");
				}
				
			}
		}
		
		
	}

}
