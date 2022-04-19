package mysql_;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class ConnectionText_ {

	public static void main(String[] args) {
		//����path
		//driver, url�� String����
		//driver�ε�
		//mysql�� ����
		//sql ����
		//statement or preparedstatement
		//resultset or row
		
	String jdbc_driver = "com.mysql.cj.jdbc.Driver";
	String jdbc_url = "jdbc:mysql://localhost:3306/board?serverTimeZone=UTC";
	
	try {
		Class.forName(jdbc_driver).newInstance();
		System.out.println("�ε� ����");
		Connection con = DriverManager.getConnection(jdbc_url,"root","1234");
		System.out.println("���� ����");
		
		String sql = "SELECT * FROM member";
		Statement st = con.createStatement();
		
		ResultSet rs = st.executeQuery(sql);
		while(rs.next())
		{
			String name = rs.getString("name");
			String owner = rs.getString("owner");
			String date = rs.getString("date");
			
			System.out.println(name+" "+owner+" "+date);
		}
	} catch (InstantiationException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IllegalAccessException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}

