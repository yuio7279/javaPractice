package mysql_;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class BookDAO {

	ArrayList<Book> books = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	MakeConnection m = new MakeConnection();
	public void insertBook()
	{
		System.out.println("책이름 입력");
		String in_bName = sc.next();
		System.out.println("출판사 입력");
		String in_publisher = sc.next();
		System.out.println("가격입력");
		int in_price = sc.nextInt();
		
		
		//등록 sql
		String sql = "insert into book values (0,?,?,?)";
		Connection con = m.makeConnection();
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, in_bName);
			pstmt.setString(2, in_publisher);
			pstmt.setInt(3,in_price);
			
			int row = pstmt.executeUpdate();
			if(row == 0)
			{
				System.out.println("등록 실패");
			}
			else
			{
				System.out.println("등록 완료");
			}
				
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
