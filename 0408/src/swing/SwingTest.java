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
		setTitle("ȫ�浿");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		Container c = this.getContentPane();
		JPanel panel = new JPanel();
		JLabel lbl = new JLabel("�ȳ��ϼ���");
		JButton btn = new JButton ("��ư");
		
//		btn.setBackground(Color.yellow);
		btn.setBackground(new Color(255, 0,0));
		btn.setForeground(new Color(0,255,0)); //����� ����
		Font font = new Font("����ü",Font.ITALIC,20);
		lbl.setFont(font);
//		lbl.setVisible(false);
		btn.setEnabled(false);
		btn.setToolTipText("�ȳ��ϼ��� �ڹ��Դϴ�.");
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
