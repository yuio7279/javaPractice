package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SwingTest extends JFrame {

	SwingTest(){
		setTitle("홍길동");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		Container c = this.getContentPane();
		JPanel panel = new JPanel();
		JLabel lbl = new JLabel("안녕하세요");
		JButton btn = new JButton ("버튼");
		
//		btn.setBackground(Color.yellow);
		btn.setBackground(new Color(255, 0,0));
		btn.setForeground(new Color(0,255,0)); //전경색 변경
		Font font = new Font("굴림체",Font.ITALIC,20);
		lbl.setFont(font);
//		lbl.setVisible(false);
		btn.setEnabled(false);
		btn.setToolTipText("안녕하세요 자바입니다.");
		lbl.setBorder(BorderFactory.createLineBorder(Color.BLUE,5));
		
		panel.setBackground(Color.PINK);
		panel.add(lbl);
		panel.add(btn);
		lbl.setOpaque(true);
		lbl.setBackground(Color.GREEN);
		
		
		c.add(panel);
//		panel.remove(lbl);
		
		//
		setSize(300,200);
		setVisible(true);
		//
	}

	
	public static void main(String[] args) {
		new SwingTest();

	}

}
