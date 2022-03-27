package java0325;

import java.sql.*;

public class BookDAO {

	 static int b_autoincrement =1;
	 MakeConnection m = new MakeConnection();
	public void insertBook(Book b) {

		
		String bookName = b.getBookName();
		String publisher = b.getPublisher();
		int price = b.getPrice();
		String sql = "insert into book values (0,?,?,?)";
		String sql2 = "ALTER TABLE book AUTO_INCREMENT = "+b_autoincrement; 
		Connection con = m.makeConnection();
		try {
			PreparedStatement pstmt = con.prepareStatement(sql2); //autoincrement ���ڸ��߱�..
			pstmt.executeUpdate();
			pstmt.close();
			pstmt = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS); 
			pstmt.setString(1, bookName);
			pstmt.setString(2, publisher);
			pstmt.setInt(3, price);
			
			int row = pstmt.executeUpdate();

			ResultSet rs = pstmt.getGeneratedKeys();
			if (rs.next()) {
				b_autoincrement = rs.getInt(1); 
			}
			if (row == 0)
				System.out.println("��� ����.. �����ڿ��� �����ϼ��� error:");
			else
				System.out.println("��� �Ϸ�");

			pstmt.close();
			con.close();
		} catch (SQLException e) {
			System.out.println("��� ����.. �����ڿ��� �����ϼ��� error:SQLException");
		}
	}

	public void updateBook(int id,String name, String publisher, int price) {
		String sql = "update book set bookName = ?, publisher = ? , price = ? where bookID = ?";
		Connection con = m.makeConnection();
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, publisher);
			pstmt.setInt(3, price);
			pstmt.setInt(4,id);
			int row = pstmt.executeUpdate();
			if (row != 0)
				System.out.println("������ �Ϸ�Ǿ����ϴ�.");
			else
				System.out.println("���� ����.. �����ڿ��� �����ϼ��� error:");
		} catch (SQLException e) {
			System.out.println("���� ����.. �����ڿ��� �����ϼ��� error:SQLException");
		}
	}

	public void deleteBook(int bookID) {

		String sql = "delete from book where bookID = ?";
		
		Connection con = m.makeConnection();
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			int row = 0;

			pstmt.setInt(1, bookID);
			row = pstmt.executeUpdate();
			if (row != 0) {
				System.out.println(String.format("ID[%s] �����Ϸ�", bookID));
				b_autoincrement--;
			}
			else
				System.out.println("���� ����.. �����ڿ��� �����ϼ��� error:");
//			
			pstmt.close();
//			 pstmt = con.prepareStatement(sql2);
			con.close();
		} catch (SQLException e) {
			System.out.println("���� ����.. �����ڿ��� �����ϼ��� error:SQLException");
		}
	}

	public void showBookList(int zero) { // �����ε�

		Connection con =  m.makeConnection();
		String sql = "select bookID,bookName from book";
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
				while (rs.next()) {
				System.out.print("ID "+rs.getInt("bookID") + "\t");
				System.out.println("å�̸� "+rs.getString("bookName"));
			
				}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void showBookList() {

		Connection con = m.makeConnection();
		String sql = "select * from book";
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				System.out.print("ID "+rs.getInt("bookID") + "\t\t");
				System.out.print("å�̸� "+rs.getString("bookName") + "\t\t");
				System.out.print("���ǻ�� "+rs.getString("publisher") + "\t\t");
				System.out.println("���� "+rs.getInt("price"));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}