package swing;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TextFieldEx extends JFrame{
	
		TextFieldEx(){
			this.setTitle("텍스트 필드 만들기 예제");
			this.setDefaultCloseOperation(EXIT_ON_CLOSE);
			Container c = getContentPane();
			c.setLayout(new FlowLayout());
			
			c.add(new JLabel("이름"));
			c.add(new JTextField(20));
			c.add(new JLabel("학과"));
			c.add(new JTextField(""));
			setVisible(true);
			
		}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TextFieldEx();
	}

}
