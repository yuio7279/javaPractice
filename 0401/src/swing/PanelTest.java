package swing;

import java.awt.*;
import javax.swing.*;

public class PanelTest extends JFrame {
	public PanelTest()
	{
		this.setTitle("hello");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);;
		
		Container c = this.getContentPane();
		
		JPanel p = new JPanel();
		JLabel l = new JLabel("�ڹ�");
		JTextField tx = new JTextField(20); 
		
		p.add(l);
		p.add(tx);
		
		c.add(p); //�׳� add�ص� contentPanel�� �ٴ´�
		this.setSize(300,200);;
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new PanelTest();
	}
}
