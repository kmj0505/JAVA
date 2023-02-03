package javachap02;

public class Chap02Test11 {

	public static void main(String[] args) {
		//문자열을 기본 타입으로 변환하시오
		
		byte value1 = Byte.parseByte("10");
		int value2 = Integer.parseInt("1000");
		float value3 = Float.parseFloat("20.5");
		double value4 = Double.parseDouble("3.14159");
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
	}

}
