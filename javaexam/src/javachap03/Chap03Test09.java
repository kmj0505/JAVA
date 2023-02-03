package javachap03;

import java.util.Scanner;

public class Chap03Test09 {

	public static void main(String[] args) {
		
		// 입력된 수에 결과를 출력하되, 두 번째로 입력받는 수가 0.0 또는 0일 경우 무한대로 결과가 나오게 하시오
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫 번째 수 : ");
		String var1 = scanner.nextLine();
		
		System.out.print("두 번째 수 : ");
		String var2 = scanner.nextLine();
		
		double result = Double.parseDouble(var1) / Double.parseDouble(var2);
		
		if((var2 == "0.0") || (var2 == "0"))
		{
			System.out.print("결과 : 무한대");
		}
		else
		{
			System.out.print("결과 : " + result);
		}
		
	}

}
