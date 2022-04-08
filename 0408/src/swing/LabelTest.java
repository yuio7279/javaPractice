package swing;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

public class LabelTest extends JFrame {

	LabelTest(){
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel p = new JPanel();
		JButton  btn = new JButton("눌러보세요");
		btn.addActionListener(new MyActionListener());
		p.add(btn);
		add(p);
		
//		MyPanel panel = new MyPanel();
//		add(panel);
		
		
		this.setSize(500,300);
		this.setVisible(true);
	}
	
	class MyActionListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("버튼을 눌렀습니다.");
			JButton b =(JButton) e.getSource();
			b.setBackground(Color.YELLOW);
			b.setText("홍길동");
		}
		
	}
	
	
	
	
	
	
	
	class MyPanel extends JPanel {
		MyPanel(){
			JLabel lbl = new JLabel("홍길동");
			this.add(lbl);
			
			ImageIcon img = new ImageIcon("images/cherry.jpg");
			JLabel imgLbl = new JLabel(img);
			this.add(imgLbl);
			
			//radio
			ButtonGroup group = new ButtonGroup();
			
			JRadioButton apple = new JRadioButton("사과");
			JRadioButton pear = new JRadioButton("배");
			JRadioButton  cherry = new JRadioButton("체리");
			
			group.add(apple);
			group.add(pear);
			group.add(cherry);
			
			this.add(apple);
			this.add(pear);
			this.add(cherry);

			//
			ImageIcon normalIcon = new ImageIcon("images/normalIcon.gif");
			JLabel label = new JLabel("보고싶으면 전화하세요",normalIcon, SwingConstants.CENTER);

			this.add(label);
			
		}
		
	}

		
		
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new LabelTest();
	}

}
