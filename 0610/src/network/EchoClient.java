package network;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.*;
import java.util.Scanner;

public class EchoClient {

	public static void main(String[] args) throws IOException {
		Socket client = null;
		PrintWriter out = null;
		
		try {
			client = new Socket();
			System.out.println("에코 서버와 연결 시도");
			client.connect(new InetSocketAddress("localhost",5000),3000); 
			System.out.println("에코 서버와 연결 성공");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		out = new PrintWriter(client.getOutputStream(),true);
		Scanner in = new Scanner(System.in);
		String msg;
		System.out.println("보낼 메시지 ? ");
		while((msg = in.nextLine())!=null) {
			if(msg.contains("끝"))break;
			out.println(msg);	//에코서버로 메시지를 보냄
			System.out.println("보낼 메시지가 더 있나요?");
			
		}
		System.out.println("클라이언트 종료");
		out.close();
		in.close();
		client.close();
	}

}

