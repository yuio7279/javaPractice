package mysql_;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class BookDAO {

	
	
	
//	ArrayList<Book> books = new ArrayList<>();
//	Scanner sc = new Scanner(System.in);
//	MakeConnection m = new MakeConnection();
//	public void insertBook()
//	{
//		System.out.println("책이름 입력");
//		String in_bName = sc.next();
//		System.out.println("출판사 입력");
//		String in_publisher = sc.next();
//		System.out.println("가격입력");
//		int in_price = sc.nextInt();
//		
//		books.add(new Book(in_bName, in_publisher, in_price));
//		
//		//등록 sql
//		String sql = "insert into book values (0,?,?,?)"; //autoIncrease 값 불러와서 저장해야 제대로 지워진다. 수정이 필요한 부분.
//		Connection con = m.makeConnection();
//		try {
//			PreparedStatement pstmt = con.prepareStatement(sql);
//			pstmt.setString(1, in_bName);
//			pstmt.setString(2, in_publisher);
//			pstmt.setInt(3,in_price);
//			
//			int row = pstmt.executeUpdate();
//			if(row == 0)
//			{
//				System.out.println("등록 실패");
//			}
//			else
//			{
//				System.out.println("등록 완료");
//			}
//			
//			con.close();
//			pstmt.close();
//			
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	
//	public void deleteBook()
//	{
//		
//		
//		
//		String sql = "delete from book where bookID = ?";
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		for(Book book : books)
//		{
//			System.out.println("ID"+book.getBookID()+" 이름"+book.getBookName());
//		}
//		System.out.println("지울 책 ID");
//		int d_bookID = sc.nextInt();
//		
//		System.out.println("삭제 하시겠습니까? 1:예 2:아니오");
//		int menu = sc.nextInt();
//		if(menu == 1)
//		{
//			for(int i=0; i<books.size(); i++) {
//				if(books.get(i).bookID == d_bookID)
//				{
//					books.remove(i);
//					System.out.println("삭제 완료");
//				}
//			}
//		}
//		else
//		{
//			System.out.println("취소되었습니다.");
//		}
//		
//	}
//	public void showList() {
//		
//		String sql = "select * from book";
//		Connection con = m.makeConnection();
//		try {
//			Statement stmt = con.createStatement();
//			ResultSet rs = stmt.executeQuery(sql);
//			
//			while(rs.next())
//			{
//				String bName = rs.getString("bookName");
//				String bPub = rs.getString("publisher");
//				int price = rs.getInt("price");
//				int bID = rs.getInt("bookID");
//				System.out.println(bID+" "+bName+""+bPub+""+price);
//				
//			}
//			rs.close();
//			stmt.close();
//			con.close();
//			
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		ArrayList<Book> books = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		MakeConnection m = new MakeConnection();
		static int b_autoIncrement = 1;
		
		public void insertBook()
		{
			System.out.println("도서이름 입력 : ");
			String in_bName = sc.next();
			System.out.println("출판사명 입력 : ");
			String in_bPub = sc.next();
			System.out.println("가격 입력 : ");
			int in_bPrice = sc.nextInt();
			
			//mysql
			
			String sql = "insert into book values(0,?,?,?)";
			String sql2 = "ALTER TABLE book AUTO_INCREMENT = "+b_autoIncrement;

			Connection con = m.makeConnection();
			try {
				PreparedStatement pstmt = con.prepareStatement(sql2);
				pstmt.executeUpdate();
				pstmt.close();
				pstmt = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
				pstmt.setString(1, in_bName);
				pstmt.setString(2, in_bPub);
				pstmt.setInt(3, in_bPrice);

				int row = pstmt.executeUpdate();
				ResultSet rs = pstmt.getGeneratedKeys();
				
				if (rs.next()) {
					b_autoIncrement = rs.getInt(1); 
				}
				
				if(row ==0)
				{
					System.out.println("등록 실패");
				}
				else
				{
					System.out.println("등록 완료");
					books.add(new Book(b_autoIncrement,in_bName,in_bPub,in_bPrice));
				}
				pstmt.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		public void deleteBook()
		{
			Connection con = m.makeConnection();
			String sql = "select * from book";
			
				PreparedStatement pstmt;
				try {
					pstmt = con.prepareStatement(sql);
					ResultSet rs = pstmt.executeQuery();
					while(rs.next())
					{
						int id = rs.getInt("bookID");
						String name = rs.getString("bookName");
						
						System.out.println(id+"\t"+name);
					}
					pstmt.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			System.out.println("삭제하실 도서아이디 입력 : ");
			int d_bookID = sc.nextInt();
			if(bookCheck(d_bookID))
			{
				System.out.println("정말 삭제하시겠습니까? y:1 n:2");
				int menu = sc.nextInt();
				if(menu == 1)
				{
					String sql2 = "DELETE FROM book WHERE bookID = ?";
					try {
						pstmt = con.prepareStatement(sql2);
						pstmt.setInt(1, d_bookID);
						int row = pstmt.executeUpdate();
						if(row == 0)
						{
							System.out.println("삭제 실패");
						}
						else
						{
								//bookID는 항상 1부터 시작
								System.out.println("삭제완료");
								b_autoIncrement--;
						}
						pstmt.close();
						con.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				else
				{
					System.out.println("취소되었습니다.");
				}
			}
			else
			{
				System.out.println("해당 도서가 없습니다.");
			}
		}
		public void showList()
		{
			Connection con = m.makeConnection();
			String sql = "select * from book";
			try {
				PreparedStatement pstmt = con.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
				while(rs.next())
				{
					int id = rs.getInt("bookID");
					String pub = rs.getString("publisher");
					String name = rs.getString("bookName");
					int price = rs.getInt("price");
					
					System.out.println(id+"\t"+name+"\t"+pub+"\t"+price);
				}
				pstmt.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		public boolean bookCheck(int c_bookID)
		{
			String sql = "select bookID from book";
			Connection con = m.makeConnection();
			try {
				PreparedStatement pstmt = con.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
				while(rs.next())
				{
					int id = rs.getInt("bookID");
					if(id==c_bookID)
					{
						return true;
					}
				}
				pstmt.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return false;
		}
	}
	

