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
		
		//메뉴
		switch(select)
		{
			case "도서등록":insertBook();break;
//			case "도서삭제":deleteBook();break;
//			case "도서수정":updateBook();break;
			case "도서목록":showBook();break;
			default :{System.out.println("error");break;}
		}
	}
	
	public void insertBook()
	{
		MadangSystem ms = new MadangSystem();
		ms.tx_area.append("\n\n도서등록을 선택하였습니다.");
		ms.tx_area.append("\n\n도서명, 출판사명, 가격 순으로 입력하세요");
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
							ms.tx_area.append("\n\n등록 실패");
						}
						else
						{
							books.add(new Book(a[0],a[1],price));
							ms.tx_area.append("\n\n등록 성공");
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
		ms.tx_area.append("\n\n도서목록을 선택하였습니다.");
		ms.tx_area.append("\n\n현재 등록된 도서의 리스트를 보여줍니다.");
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
				
				ms.tx_area.append("\nID: "+id+"\t책이름: "+name+"\t출판사: "+pub+"\t가격: "+price);
			}

			con.close();
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
