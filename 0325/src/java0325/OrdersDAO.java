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
				System.out.println("��� �Ϸ�");
			}
			else System.out.println("��� ����.. �����ڿ��� �����ϼ��� error:");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("��� ����.. �����ڿ��� �����ϼ��� error: SQLException");
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
				System.out.println("�ֹ����� ���� �Ϸ�");
			else System.out.println("���� ����.. �����ڿ��� �����ϼ��� error:");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("���� ����.. �����ڿ��� �����ϼ��� error: SQLException");
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
				System.out.println("���� �Ϸ�");
				o_autoincrement--;
			}
			else System.out.println("���� ����.. �����ڿ��� �����ϼ��� error:");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("���� ����.. �����ڿ��� �����ϼ��� error: SQLException");
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
				System.out.print("|�ֹ���ȣID "+rs.getInt("orderID")+"\t");
				System.out.print("�ֹ���ID "+rs.getInt("custID")+"\t");
				System.out.print("åID "+rs.getInt("bookID")+"\t");
				System.out.print("�Ǹ� ���� "+rs.getInt("salePrice")+"\t");
				System.out.println("�ֹ� ���� "+rs.getString("orderDate")+"|");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
