package javachap02;

import java.util.Scanner;

public class Chap02Test13 {

	public static void main(String[] args) {
		// 첫 번째 수와 두 번째 수를 입력받아 덧셈하시오
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫 번째 수 : ");
		String strNum1 = scanner.nextLine();
		
		System.out.print("두 번째 수 : ");
		String strNum2 = scanner.nextLine();
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		
		int result = num1 + num2;
		System.out.println("덧셈 결과 : " + result);
	}

}
