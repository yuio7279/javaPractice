package java0325;
import java.sql.*;
public class MakeConnection {
	public  Connection makeConnection()
	{
		String url = "jdbc:mysql://localhost:3306/madang?serverTimezone=Asia/Seoul"; 
		String root = "root"; String password = "1234";
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url,root,password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
}
