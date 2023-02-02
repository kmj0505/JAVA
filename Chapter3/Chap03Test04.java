package minjichap03;

public class Chap03Test04 {

	public static void main(String[] args) {
		//pencilsPerStudent와 pencilsLeft의 값을 구하시오
		int pencils = 534;
		int students = 30;
		
		int pencilsPerStudent = (pencils / students);
		System.out.println(pencilsPerStudent);
		
		int pencilsLeft = (pencils % students);
		System.out.println(pencilsLeft);

	}

}
