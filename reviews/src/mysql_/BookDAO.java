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
		System.out.println("å�̸� �Է�");
		String in_bName = sc.next();
		System.out.println("���ǻ� �Է�");
		String in_publisher = sc.next();
		System.out.println("�����Է�");
		int in_price = sc.nextInt();
		
		books.add(new Book(in_bName, in_publisher, in_price));
		
		//��� sql
		String sql = "insert into book values (0,?,?,?)"; //autoIncrease �� �ҷ��ͼ� �����ؾ� ����� ��������. ������ �ʿ��� �κ�.
		Connection con = m.makeConnection();
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, in_bName);
			pstmt.setString(2, in_publisher);
			pstmt.setInt(3,in_price);
			
			int row = pstmt.executeUpdate();
			if(row == 0)
			{
				System.out.println("��� ����");
			}
			else
			{
				System.out.println("��� �Ϸ�");
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
			System.out.println("ID"+book.getBookID()+" �̸�"+book.getBookName());
		}
		System.out.println("���� å ID");
		int d_bookID = sc.nextInt();
		
		System.out.println("���� �Ͻðڽ��ϱ�? 1:�� 2:�ƴϿ�");
		int menu = sc.nextInt();
		if(menu == 1)
		{
			for(int i=0; i<books.size(); i++) {
				if(books.get(i).bookID == d_bookID)
				{
					books.remove(i);
					System.out.println("���� �Ϸ�");
				}
			}
		}
		else
		{
			System.out.println("��ҵǾ����ϴ�.");
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
//			System.out.println("ID"+book.getBookID()+" �̸�"+book.getBookName()+" ���ǻ�"+book.getPublisher()+" ����"+book.getPrice());
//		}
	}
	
}
