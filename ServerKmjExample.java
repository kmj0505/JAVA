package kcci.iotkmj_v1;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerKmjExample {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		ServerKmjThread serverKmjThread = new ServerKmjThread();
		serverKmjThread.start();
		String queueData = null;
		while(true){
		try {
			queueData = ServerKmjThread.queueInput.take();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
		

	}

}
