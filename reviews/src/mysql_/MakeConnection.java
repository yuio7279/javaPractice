package mysql_;
import java.sql.*;
public class MakeConnection {
	//생성자가 아닌 메서드를 만드는것
//	public Connection makeConnection()
//	{
//		String jdbc_driver = "com.mysql.cj.jdbc.Driver";
//		String jdbc_url = "jdbc:mysql://localhost:3306/madang?serverTimeZone=UTC";
//		Connection con = null;
//		
//			try {
//				Class.forName(jdbc_driver);
//				System.out.println("로드 성공");
//				con = DriverManager.getConnection(jdbc_url,"root","1234");
//				
//			} catch (ClassNotFoundException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		return con;
//	}
	
	public Connection makeConnection()
	{
		String jdbc_driver = "com.mysql.cj.jdbc.Driver";
		String jdbc_url = "jdbc:mysql://localhost/madang?serverTimezone=Asia/Seoul";
		Connection con = null;
		
		//드라이버 로드
		try {
			Class.forName(jdbc_driver);
			con = DriverManager.getConnection(jdbc_url,"root","1234");
			
			
			
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
