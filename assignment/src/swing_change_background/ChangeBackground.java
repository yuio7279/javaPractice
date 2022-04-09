package swing_change_background;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame extends JFrame{
	
	private JButton btn1;
	private JButton btn2;
	private JPanel  panel;
	
	public MyFrame() {
		this.setSize(300,200);;
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("�̺�Ʈ ����");
		
		btn1 = new JButton("�����");
		btn2 = new JButton("��ũ��");
		panel = new JPanel();
		MyListener listener = new MyListener();
		
		btn1.addActionListener(listener);
		btn2.addActionListener(listener);
		panel.add(btn1);
		panel.add(btn2);
		
		add(panel);
		
		this.setVisible(true);
	}
	
	class MyListener implements ActionListener {		//����Ŭ����

		@Override
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton) e.getSource();
			if((b.getText().equals("�����")))
				panel.setBackground(Color.YELLOW);
			else panel.setBackground(Color.PINK);
		}
	}
}
public class ChangeBackground{
	public static void main(String[] args) {
		MyFrame t = new MyFrame();
	
	}
}
