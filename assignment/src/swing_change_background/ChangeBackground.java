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
		this.setTitle("이벤트 예제");
		
		btn1 = new JButton("노란색");
		btn2 = new JButton("핑크색");
		panel = new JPanel();
		MyListener listener = new MyListener();
		
		btn1.addActionListener(listener);
		btn2.addActionListener(listener);
		panel.add(btn1);
		panel.add(btn2);
		
		add(panel);
		
		this.setVisible(true);
	}
	
	class MyListener implements ActionListener {		//내부클래스

		@Override
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton) e.getSource();
			if((b.getText().equals("노란색")))
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
