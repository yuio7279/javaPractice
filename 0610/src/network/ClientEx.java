package network;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ClientEx {

	public static void main(String[] args) throws UnknownHostException, IOException {
		BufferedReader in = null;
		BufferedWriter out = null;
		Socket socket = null;
		Scanner scanner = new Scanner(System.in);
		
		try {
			socket = new Socket();
			socket.connect(new InetSocketAddress("localhost",9999),9999);
			System.out.println("통신 완료");
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			while(true) {
				System.out.println("보내기 >>");
				String outputMessage = scanner.nextLine();
				if(outputMessage.equalsIgnoreCase("bye"))
				{
					out.write(outputMessage+"\n");
					out.flush();
					break;
				}
				out.write(outputMessage+"\n");	//전송
				out.flush();	//남아있는모든문자열 전송
				String inputMessage = in.readLine();
				System.out.println("서버 : "+inputMessage);
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} finally {
			try {
				scanner.close();
				if(socket != null) socket.close();
			} catch (IOException e) {
				System.out.println("서버와 채팅중 오류가 발생!");
			}
		}

	}

}
