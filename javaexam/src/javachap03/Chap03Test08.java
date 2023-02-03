package javachap03;

public class Chap03Test08 {

	public static void main(String[] args) {
		//사다리꼴 넓이를 구하시오
		
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area = (lengthTop+lengthBottom) * (double)height / 2;  //(윗변 + 아랫변) * 높이 /2
		System.out.println(area);

	}

}
