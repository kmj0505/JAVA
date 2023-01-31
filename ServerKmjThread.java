package kcci.iotkmj_v1;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ServerKmjThread extends Thread {
//	private ServerKmjThread serverKmjThread;
//	private BufferedReader br;
//	private PrintWriter pw;
//	private Socket ClientSocket;
	static BlockingQueue<String> queueInput = new LinkedBlockingQueue<String>();

	Socket socket = null;
	@Override
	public void run() {
		Scanner sc = new Scanner(System.in);

		// super.run();
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("localhost", 5000));
			while (true) {
				System.out.println("[연결 기다림]");
				socket = serverSocket.accept();
				InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
				System.out.println("[연결 수락함] " + isa.getHostName());
				
				
				InputStream is = socket.getInputStream();
				byte[] bytes = null;
				String message = null;
				bytes = new byte[100];
				int readByteCount = is.read(bytes);
				if(readByteCount <= 0)
					break;
				message = new String(bytes, 0, readByteCount, "UTF-8");
				System.out.println("[데이터 받기 성공]: " + message);
				
				Writer writer = new FileWriter("recvdata.txt", true);
				String str = message;
				String[] strArr = str.split("@");
				for (int i = 0; i < strArr.length; i++) {
					writer.write("ID : " + strArr[i] + " 온도: " + strArr[i+1] + " 조도: " + strArr[i+2] + " 습도: " + strArr[i+3]);
					writer.write(0x0a);
					System.out.println("ID : " + strArr[i] + " 온도: " + strArr[i+1] + " 조도: " + strArr[i+2] + " 습도: " + strArr[i+3]);
				//String mess = message;
				sendData(message);
				
				
				writer.flush();
				writer.close();
				}
				socket.close();
			}
		} catch (Exception e) {
		}


		 if (!serverSocket.isClosed()) {
			try {
				serverSocket.close();
			} catch (IOException e1) {
			}
		}
		 
	}

	void sendData(String message) {
		queueInput.offer(message);
		OutputStream os = null;
		try {
			os = socket.getOutputStream();
			message = "hello";
			System.out.println("[데이터 보내기 성공]: " + message);
			byte[] bytes = message.getBytes("UTF-8");
			os.write(bytes);
			os.flush();
			os.close();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
