package kcci.iotkmj_v1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientKmjExample {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		ClientKmjThread clientKmjThread = new ClientKmjThread();
		
		
		clientKmjThread.start();
	
		
		
    }
}