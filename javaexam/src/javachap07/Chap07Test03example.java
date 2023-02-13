package javachap07;

public class Chap07Test03example {

	public static void main(String[] args) {
		method(new Chap07Test03LoginServlet());
		method(new Chap07Test03FileDownloadServlet());
	}
	
	public static void method(Chap07Test03 servlet) {
		servlet.service();
	}

}
