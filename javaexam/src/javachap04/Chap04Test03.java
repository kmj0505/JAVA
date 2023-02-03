package javachap04;

public class Chap04Test03 {

	public static void main(String[] args) {
		// 주사위 2개의 합이 5면 프로그램 종료하시오.
		
		while(true) {
			int num1 = (int)(Math.random()*6)+1;
			int num2 = (int)(Math.random()*6)+1;
			
			if((num1+num2)==5) {
				
				System.out.println("(" + num1 + ", " + num2 + ")");
				break;
			}
			else {
				System.out.println("(" + num1 + ", " + num2 + ")");
			}
		}
		System.out.println("프로그램 종료");
	}
}
