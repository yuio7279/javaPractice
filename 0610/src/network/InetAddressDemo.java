package network;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class InetAddressDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InetAddress addr1 = null, addr2 = null;
		System.out.println("호스트 이름을 입력");
		Scanner in = new Scanner(System.in);
		String url = in.nextLine();
		
		try {
			addr1 = InetAddress.getByName(url);
			addr2 = InetAddress.getLocalHost();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
		
		}
		System.out.print(url+"의 ip 주소 : ");
		System.out.println(addr1.getHostAddress());
		System.out.print("로컬 IP주소 : ");
		System.out.println(addr2.getHostAddress());
		
	}

}
