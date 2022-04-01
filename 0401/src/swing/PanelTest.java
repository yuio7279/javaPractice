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
		JLabel l = new JLabel("자바");
		JTextField tx = new JTextField(20); 
		
		p.add(l);
		p.add(tx);
		
		c.add(p); //그냥 add해도 contentPanel에 붙는다
		this.setSize(300,200);;
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new PanelTest();
	}
}
