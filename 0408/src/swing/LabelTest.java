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
		JButton  btn = new JButton("����������");
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
			System.out.println("��ư�� �������ϴ�.");
			JButton b =(JButton) e.getSource();
			b.setBackground(Color.YELLOW);
			b.setText("ȫ�浿");
		}
		
	}
	
	
	
	
	
	
	
	class MyPanel extends JPanel {
		MyPanel(){
			JLabel lbl = new JLabel("ȫ�浿");
			this.add(lbl);
			
			ImageIcon img = new ImageIcon("images/cherry.jpg");
			JLabel imgLbl = new JLabel(img);
			this.add(imgLbl);
			
			//radio
			ButtonGroup group = new ButtonGroup();
			
			JRadioButton apple = new JRadioButton("���");
			JRadioButton pear = new JRadioButton("��");
			JRadioButton  cherry = new JRadioButton("ü��");
			
			group.add(apple);
			group.add(pear);
			group.add(cherry);
			
			this.add(apple);
			this.add(pear);
			this.add(cherry);

			//
			ImageIcon normalIcon = new ImageIcon("images/normalIcon.gif");
			JLabel label = new JLabel("��������� ��ȭ�ϼ���",normalIcon, SwingConstants.CENTER);

			this.add(label);
			
		}
		
	}

		
		
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new LabelTest();
	}

}
