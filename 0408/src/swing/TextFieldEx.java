package swing;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TextFieldEx extends JFrame{
	
		TextFieldEx(){
			this.setTitle("�ؽ�Ʈ �ʵ� ����� ����");
			this.setDefaultCloseOperation(EXIT_ON_CLOSE);
			Container c = getContentPane();
			c.setLayout(new FlowLayout());
			
			c.add(new JLabel("�̸�"));
			c.add(new JTextField(20));
			c.add(new JLabel("�а�"));
			c.add(new JTextField(""));
			setVisible(true);
			
		}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TextFieldEx();
	}

}
