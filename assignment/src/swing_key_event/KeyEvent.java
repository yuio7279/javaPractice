package swing_key_event;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.*;
import java.util.EventObject;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class KeyEvent extends JFrame {
	JTextField txfd = new JTextField();
	JTextArea txArea = new JTextArea(3,20);
	
	KeyEvent(){
		this.setTitle("키 입력받아 keycode, keychar 출력");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(500,300);
		
		Container  c = getContentPane();
		
		JPanel p = new JPanel();
		p.setSize(500,150);
		p.setLayout(new GridLayout(0,2));
		
		
		JLabel txt = new JLabel("키보드 입력");
		p.add(txt);	
		
		
		txfd.addKeyListener(new MyKeyListener() {
			
		});
		
		p.add(txfd);	
		
		c.add(p,BorderLayout.NORTH);
		c.add(txArea, BorderLayout.CENTER);
		c.add(new JScrollPane(txArea));

		this.setVisible(true);
		
	}
	class MyKeyListener implements KeyListener {

		@Override
		public void keyTyped(java.awt.event.KeyEvent e) {
			input(e);
		}

		@Override
		public void keyPressed(java.awt.event.KeyEvent e) {
			input(e);
			
		}
		@Override
		public void keyReleased(java.awt.event.KeyEvent e) {
			input(e);
		}
	}
	
	public void input (java.awt.event.KeyEvent e) {
		
		
//		String a = "Char : "+e.getKeyChar()+"\tCode : "+e.getKeyCode()+				
//				"\tKeyText : "+java.awt.event.KeyEvent.getKeyText(e.getKeyCode())+"\n";
//		
//		txArea.append(a);
//		txfd.setText("");
		
		
		//82~ 120줄 enter 입력시 textfield내부 키데이터 출력
			try 
			{
				if(e.getKeyCode()==10)
				{
					char N = txfd.getText().charAt(0);
					int num = N;
					
					e.setKeyCode(num);
					e.setKeyChar(txfd.getText().charAt(0));
					String txt = "KeyChar : "+String.valueOf(e.getKeyChar());
							txt += "\tKeyCode : "+e.getKeyCode();
							txt += "\t"+e.getSource();
							txt += "\n";
					
					txArea.append(txt);
					txfd.setText("");
					
					
				}
				
				if(txfd.getText().length() > 1)
				{
					System.out.println("한개만 입력하세요");
					txfd.setText("");
				}
			}
			catch (StringIndexOutOfBoundsException E)	
			{
				
			}
			
		
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new KeyEvent();
	}

}
