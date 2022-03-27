package java0325;

import java.sql.*;
public class OrdersDAO {
	static int o_autoincrement = 1;
	MakeConnection m = new MakeConnection();
	
	public void orders(Orders o) {
		
		String sql = "insert into orders values (0,?,?,?,curDate())";
		String sql2 = "alter table orders auto_increment = "+o_autoincrement;
		int custID = o.getCustID();
		int bookID = o.getBookID();
		int salePrice = o.getSalePrice();
		Connection con = m.makeConnection();
		try {
			PreparedStatement pstmt = con.prepareStatement(sql2);
			pstmt.executeUpdate();
			pstmt.close();
			pstmt = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
			pstmt.setInt(1, custID);
			pstmt.setInt(2,bookID);
			pstmt.setInt(3, salePrice);
			int row =pstmt.executeUpdate();
			
			ResultSet rs = pstmt.getGeneratedKeys();
			while(rs.next())
			{
				o_autoincrement = rs.getInt(1);
			}
			
			if(row !=0)
			{
				System.out.println("등록 완료");
			}
			else System.out.println("등록 실패.. 관리자에게 문의하세요 error:");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("등록 실패.. 관리자에게 문의하세요 error: SQLException");
		}
	}
	public  void updateOrders(int orderID, int bookID, int custID, int salePrice)
	{
		try {
			String sql = "update orders set bookID = ?, custID = ?, salePrice = ? where orderID = ?";
			Connection con = m.makeConnection();
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1,bookID);
			pstmt.setInt(2,custID);
			pstmt.setInt(3,salePrice);
			pstmt.setInt(4,orderID);
			int row =pstmt.executeUpdate();
			if(row !=0)
				System.out.println("주문내역 수정 완료");
			else System.out.println("수정 실패.. 관리자에게 문의하세요 error:");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("수정 실패.. 관리자에게 문의하세요 error: SQLException");
		}
	}
	public  void deleteOrders(int orderID)
	{
		String sql = "delete from orders where orderID = ?";
		Connection con = m.makeConnection();
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, orderID);
			int row = pstmt.executeUpdate();
			if(row !=0)
			{
				System.out.println("삭제 완료");
				o_autoincrement--;
			}
			else System.out.println("삭제 실패.. 관리자에게 문의하세요 error:");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("수정 실패.. 관리자에게 문의하세요 error: SQLException");
		}
			
		
	}
	public  void showOrdersList(int zero)
	{
		String sql = "select orderID,custID,bookID,salePrice from orders";
		Connection con = m.makeConnection();
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next())
			{
				System.out.print("orderID "+rs.getInt("orderID")+"\t");
				System.out.print("custID "+rs.getInt("custID")+"\t");
				System.out.print("bookID "+rs.getInt("bookID")+"\t");
				System.out.println("salePrice "+rs.getInt("salePrice"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public  void showOrdersList()
	{
		String sql = "select * from orders";
		Connection con = m.makeConnection();
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next())
			{
				System.out.print("|주문번호ID "+rs.getInt("orderID")+"\t");
				System.out.print("주문고객ID "+rs.getInt("custID")+"\t");
				System.out.print("책ID "+rs.getInt("bookID")+"\t");
				System.out.print("판매 가격 "+rs.getInt("salePrice")+"\t");
				System.out.println("주문 일자 "+rs.getString("orderDate")+"|");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
