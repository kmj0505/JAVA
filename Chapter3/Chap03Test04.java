package minjichap03;

public class Chap03Test04 {

	public static void main(String[] args) {
		//pencilsPerStudent�� pencilsLeft�� ���� ���Ͻÿ�
		int pencils = 534;
		int students = 30;
		
		int pencilsPerStudent = (pencils / students);
		System.out.println(pencilsPerStudent);
		
		int pencilsLeft = (pencils % students);
		System.out.println(pencilsLeft);

	}

}
