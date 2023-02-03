package javachap04;

public class Chap04Test02 {

	public static void main(String[] args) {
		//1부터 100까지 정수 중 3의 배수의 총합을 구하시오
		
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
