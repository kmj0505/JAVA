package minjichap02;

import java.util.Scanner;

public class Chap02Test14 {

	public static void main(String[] args) {
		//scanner를 이용해 홍길동, 123456, 010-1234-1234를 이름, 주민번호 앞 6자리, 전화번호 순서대로 입력받으시오
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = scanner.nextLine();
		
		System.out.print("주민번호 앞 6자리 : ");
		String num = scanner.nextLine();
		
		System.out.print("전화번호 : ");
		String phone = scanner.nextLine();

	}

}
