package network;

import java.io.*;
import java.net.*;

public class Echo1Server {

	public static void main(String[] args) throws IOException {
		ServerSocket server = null;
		Socket connection = null;
		BufferedReader in = null;
		
		try {
			server = new ServerSocket(5001);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("연결 대기중");
		
		try {
			connection = server.accept();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("메시지 기다리는중");
		
		in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
		//String으로 리던
		String msg;
		
		while((msg = in.readLine())!=null) {
			if(msg.contains("끝")) break;
			System.out.println("들어온 메시지 : "+msg);
		}
		
		System.out.println("서버 종료");
		in.close();
		connection.close();
		server.close();
	}

}
