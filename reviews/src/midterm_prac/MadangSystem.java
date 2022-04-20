package midterm_prac;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

import javax.swing.*;


public class MadangSystem extends JFrame{
	
	TextArea tx_area = new TextArea();
	TextField txfd = new TextField();
	
	MadangSystem(){
		this.setSize(600, 400);
		this.setTitle("MadangSystem");
		
		Container c = this.getContentPane();
		
		
		
		tx_area.setText("\n마당도서관 관리 프로그램에 오신것을 환영합니다 \n\n원하시는 버튼을 클릭하세요");
		tx_area.append("\n=================================================================");
		
		JPanel btn_panel = new JPanel();
		JButton insert_btn = new JButton("도서등록");
		insert_btn.addActionListener(new BookDAO());
		
		
		
		
		JButton delete_btn = new JButton("도서삭제");
		JButton update_btn = new JButton("도서수정");
		JButton show_btn = new JButton("도서목록");
		show_btn.addActionListener(new BookDAO());
		
		
		
		
		
		
		
		
		
		
		btn_panel.add(insert_btn);
		btn_panel.add(delete_btn);
		btn_panel.add(update_btn);
		btn_panel.add(show_btn);
		c.add(btn_panel,BorderLayout.NORTH);
		
		
		
		
		c.add(tx_area,BorderLayout.CENTER);
		
		c.add(txfd,BorderLayout.SOUTH);
		
		
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}

	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MadangSystem();
		
		
		
	}

}
