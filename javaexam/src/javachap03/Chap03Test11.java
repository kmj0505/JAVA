package javachap03;

import java.util.Scanner;

public class Chap03Test11 {

	public static void main(String[] args) {
		//Id : java, Pw : 12345로 로그인을 성공하시오
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("아이디 : ");
		String name = scanner.nextLine();
		
		System.out.print("패스워드 : ");
		String strPassword = scanner.nextLine();
		int password = Integer.parseInt(strPassword);
		
		if(name.equals("java")) {           //name == "java"는 안된다 (java는 맞으면 true, 틀리면 false를 반환하기 때문에)
			if(password == 12345) {
				System.out.println("로그인 성공");
			}
			else {
				System.out.println("로그인 실패 : 패스워드가 틀림");
			}
			
		}
		else {
			System.out.println("로그인 실패 : 아이디가 존재하지 않음");
		}
	}

}
