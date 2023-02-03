package javachap04;

public class Chap04Test06 {

	public static void main(String[] args) {
		//for문을 활용해서
		//   *
		//  **
		// ***
		//**** 만드시오.
		
		for(int i=0; i<4; i++)
		{
			System.out.print("");
			for(int j=0; j<3-i; j++)
			{
				System.out.print(" ");

			}
			for(int k=0; k<i+1; k++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}

		//정답지
		
		// for(int i = 1; i<5; i++)
		// {
		//    for(int j = 4; j>0; j--)
		//	  {
		//	 	 if(i<j){
		//	 		System.out.print(" ");
		//	 	 }
		//	 	 else{
		//		   System.out.print("*");
		//		 }
		//	  }
		//   System.out.println();
		// }
		
	}

}


