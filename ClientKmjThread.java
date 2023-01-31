package kcci.iotkmj_v1;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.net.InetSocketAddress;
import java.net.Socket;
//import java.util.concurrent.BlockingQueue;
//import java.util.concurrent.LinkedBlockingQueue;
import java.util.Scanner;

public class ClientKmjThread extends Thread {
	//static BlockingQueue<String> queueInput = new LinkedBlockingQueue<String>();
	Socket socket = null;
	
	
	@Override
	public void run() {
		Scanner sc = new Scanner(System.in);
		InputStream ips = System.in;
		Reader reader = new InputStreamReader(ips);
		BufferedReader br = new BufferedReader(reader);
		// TODO Auto-generated method stub
		//super.run();
		Socket socket = null;
		try {
			socket = new Socket();
			System.out.println("[연결 요청]");
			socket.connect(new InetSocketAddress("localhost", 5000));
			System.out.println("[연결 성공]");

			byte[] bytes = null;
			String message = null;
			
			OutputStream os = socket.getOutputStream();

			message = sc.nextLine();
			
			bytes = message.getBytes("UTF-8");
			os.write(bytes);
			os.flush();
			System.out.println("[데이터 보내기 성공]");
			
			//is.close();
			
			InputStream is = socket.getInputStream();
			bytes = new byte[100];
			int readByteCount = is.read(bytes);
			message = new String(bytes, 0, readByteCount, "UTF-8");
			System.out.println("[데이터 받기 성공]: " + message);
			os.close();
			
			
			
			while(true) {
				message = br.readLine();
			if (message.equals("quit"))
				break;	
				
			//is.close();
		}
			br.close();
		} catch (Exception e) {
			System.out.println("서버가 중지되었습니다");
		}
		
		if (!socket.isClosed()) {
			try {
				socket.close();
			} catch (IOException e1) {
			}

		}
		System.out.println("클라이언트가 종료되었습니다");
	}
}




