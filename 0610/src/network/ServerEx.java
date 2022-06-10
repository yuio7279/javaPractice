package network;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ServerEx {

	public static void main(String[] args) throws IOException {
		
		
		BufferedReader in = null;
		BufferedWriter out = null;
		ServerSocket listener = null;
		Socket socket = null;
		Scanner scanner = new Scanner(System.in);
		
		try {
			listener = new ServerSocket(9999);
			System.out.println("연결을 기다리고 있습니다.");
			socket = listener.accept();
			System.out.println("연결되었습니다.");
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			while(true) {
				String inputMessage = in.readLine();
				if(inputMessage.equalsIgnoreCase("bye")) 
				{
					System.out.println("bye입력으로 인해 종료됨");
					break;
				}
				System.out.println("클라이언트 : "+inputMessage);
				System.out.print("보내기>>"); //프롬프트
				String outputMessage = scanner.nextLine(); //키보드에서 한출
				out.write(outputMessage + "\n");	//
				out.flush();
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				scanner.close();
				socket.close();
				listener.close();
			} catch (IOException e) {System.out.println("클라이언트와 채팅중 오류 발생!");}
		}
	}
}
