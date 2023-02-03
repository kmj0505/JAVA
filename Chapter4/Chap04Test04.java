package minjichap04;

public class Chap04Test04 {

	public static void main(String[] args) {
		// 4x+5y=60을 만족하는 모든 해를 구해서 (x,y)의 형태로 나타내시오.
		
		
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
