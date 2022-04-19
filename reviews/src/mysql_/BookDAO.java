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
		
		books.add(new Book(in_bName, in_publisher, in_price));
		
		//등록 sql
		String sql = "insert into book values (0,?,?,?)"; //autoIncrease 값 불러와서 저장해야 제대로 지워진다. 수정이 필요한 부분.
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
			
			con.close();
			pstmt.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void deleteBook()
	{
		
		
		
		String sql = "delete from book where bookID = ?";
		
		
		
		
		
		
		
		
		
		for(Book book : books)
		{
			System.out.println("ID"+book.getBookID()+" 이름"+book.getBookName());
		}
		System.out.println("지울 책 ID");
		int d_bookID = sc.nextInt();
		
		System.out.println("삭제 하시겠습니까? 1:예 2:아니오");
		int menu = sc.nextInt();
		if(menu == 1)
		{
			for(int i=0; i<books.size(); i++) {
				if(books.get(i).bookID == d_bookID)
				{
					books.remove(i);
					System.out.println("삭제 완료");
				}
			}
		}
		else
		{
			System.out.println("취소되었습니다.");
		}
		
	}
	public void showList() {
		
		String sql = "select * from book";
		Connection con = m.makeConnection();
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next())
			{
				String bName = rs.getString("bookName");
				String bPub = rs.getString("publisher");
				int price = rs.getInt("price");
				int bID = rs.getInt("bookID");
				System.out.println(bID+" "+bName+""+bPub+""+price);
				
			}
			rs.close();
			stmt.close();
			con.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
//		for(Book book : books)
//		{
//			System.out.println("ID"+book.getBookID()+" 이름"+book.getBookName()+" 출판사"+book.getPublisher()+" 가격"+book.getPrice());
//		}
	}
	
}
