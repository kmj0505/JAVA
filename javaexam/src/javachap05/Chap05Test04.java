package javachap05;

public class Chap05Test04 {

	public static void main(String[] args) {
		//for���� Ȱ���ؼ� �־��� �迭�� �׸񿡼� �ִ밪�� ���Ͻÿ�
		
		int max = 0;
		int[] array = {1, 5, 3, 8, 2};
		
		for(int i=0; i<array.length; i++)
		{
			if(array[i] > max)
			{
				max = array[i];
			}
		}
		
		System.out.println("max : " + max);

	}

}
