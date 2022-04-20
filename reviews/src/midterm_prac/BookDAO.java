package midterm_prac;

import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class BookDAO implements ActionListener {
	ArrayList<Book> books = new ArrayList<>();
	MakeConnection m = new MakeConnection();
	

	@Override
	public void actionPerformed(ActionEvent e) {
		String select = e.getActionCommand();
		
		//�޴�
		switch(select)
		{
			case "�������":insertBook();break;
//			case "��������":deleteBook();break;
//			case "��������":updateBook();break;
			case "�������":showBook();break;
			default :{System.out.println("error");break;}
		}
	}
	
	public void insertBook()
	{
		MadangSystem ms = new MadangSystem();
		ms.tx_area.append("\n\n��������� �����Ͽ����ϴ�.");
		ms.tx_area.append("\n\n������, ���ǻ��, ���� ������ �Է��ϼ���");
		ms.tx_area.append("\n=================================================================");
		
		ms.txfd.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
			}
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == 10)
				{
					String temp = ms.txfd.getText();
					
					ms.tx_area.append("\n\n"+ms.txfd.getText());
					String[] a = temp.split(" ");
					
					int price = Integer.parseInt(a[2]);
					
					String sql = "insert into book values (0,?,?,?)";
					Connection con = m.makeConnection();
					try {
						PreparedStatement pstmt = con.prepareStatement(sql);
						pstmt.setString(1, a[0]);
						pstmt.setString(2, a[1]);
						pstmt.setInt(3,price);
						
						if(pstmt.executeUpdate()==0)
						{
							ms.tx_area.append("\n\n��� ����");
						}
						else
						{
							books.add(new Book(a[0],a[1],price));
							ms.tx_area.append("\n\n��� ����");
							ms.tx_area.append("\n=================================================================");
							ms.txfd.setText("");
						}
						pstmt.close();
						con.close();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				}
			}
			
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
			}
		});
	}
	public void deleteBook()
	{
		
	}
	public void updateBook()
	{
		
	}
	
	
	
	public void showBook()
	{
		MadangSystem ms = new MadangSystem();
		ms.tx_area.append("\n\n��������� �����Ͽ����ϴ�.");
		ms.tx_area.append("\n\n���� ��ϵ� ������ ����Ʈ�� �����ݴϴ�.");
		ms.tx_area.append("\n=================================================================");
		String sql = "select * from book";
		Connection con = m.makeConnection();
		
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next())
			{
				int id = rs.getInt("bookID");
				String pub = rs.getString("publisher");
				String name = rs.getString("bookName");
				int price = rs.getInt("price");
				
				ms.tx_area.append("\nID: "+id+"\tå�̸�: "+name+"\t���ǻ�: "+pub+"\t����: "+price);
			}

			con.close();
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
