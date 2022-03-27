package java0325;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CustomerDAO {

	static int c_autoincrement = 1;
	MakeConnection m = new MakeConnection();
	public void insertCust(Customer c) {
		
		String name = c.getName();
		String address = c.getAddress();
		String phone = c.getPhone();
		String sql = "insert into customer values (0,?,?,?)";
		String sql2 = "ALTER TABLE customer AUTO_INCREMENT = "+c_autoincrement; 
		Connection con = m.makeConnection();
		try {
			PreparedStatement pstmt = con.prepareStatement(sql2); //autoincrement ���ڸ��߱�..
			pstmt.executeUpdate();
			pstmt.close();
			 
			pstmt = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
			pstmt.setString(1, name);
			pstmt.setString(2, address);
			pstmt.setString(3, phone);

			int row = pstmt.executeUpdate();
			ResultSet rs = pstmt.getGeneratedKeys();
			if (rs.next()) {
				c_autoincrement = rs.getInt(1); 
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

	public  void updateCust(String name, String address, String phone,int custID) {
		
		String pphone =null;
		if(phone!=null)
		{
			String[] splitPhone = { phone.substring(0, 3), phone.substring(3, 7), phone.substring(7, 11) };
			pphone =splitPhone[0] + "-" + splitPhone[1] + "-" + splitPhone[2]; 
		}

		String sql = "update customer set name = ? ,address = ?, phone = ? where custID = ?";
		Connection con = m.makeConnection();
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, address);
			pstmt.setString(3, pphone);
			pstmt.setInt(4, custID);

			int row = pstmt.executeUpdate();
			if (row != 0) {
				System.out.println("���� �Ϸ�");
			} else
				System.out.println("���� ����.. �����ڿ��� �����ϼ��� error:");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("���� ����.. �����ڿ��� �����ϼ��� error:SQLException");
		}

	}

	public void deleteCust (int custID)
	{
		String sql = "delete from customer where custID = ?";
		Connection con = m.makeConnection();
		
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, custID);
			int row = pstmt.executeUpdate();
			if(row !=0)
			{System.out.println(String.format("ID[%s] �����Ϸ�", custID));
				c_autoincrement--;
			}
			else
				System.out.println("���� ����.. �����ڿ��� �����ϼ��� error:");
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("���� ����.. �����ڿ��� �����ϼ��� error:SQLException");
		}
	}
	
	public void showCustList(int zero) { // �����ε�

		Connection con = m.makeConnection();
		String sql = "select custID,name from customer";
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				System.out.print("ID " + rs.getInt("custID") + "\t");
				System.out.println("���� " + rs.getString("name"));

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void showCustList() {

		Connection con = m.makeConnection();
		String sql = "select * from customer";
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				System.out.print("ID " + rs.getInt("custID") + "\t\t");
				System.out.print("���� " + rs.getString("name") + "\t\t");
				System.out.print("�ּ� " + rs.getString("address") + "\t\t");
				System.out.println("�޴��� ��ȣ " + rs.getString("phone"));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
