package swing_textfield;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class TextFieldEx extends JFrame {

	public TextFieldEx() {
		setTitle("텍스트 필드 만들기 예제");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JTextField name_txtFd = new JTextField(20);
		JTextField dptMnt_txtFd = new JTextField("컴퓨터공학과", 20);
		JTextField addr_txtFd = new JTextField("서울시 ...", 20);
		
		
		c.add(new JLabel("이름"));
		c.add(name_txtFd);
		c.add(new JLabel("학과"));
		c.add(dptMnt_txtFd);
		c.add(new JLabel("주소"));
		c.add(addr_txtFd);
		
		addr_txtFd.addActionListener(e -> {System.out.printf("%s, %s, %s", //람다
				name_txtFd.getText(),dptMnt_txtFd.getText(),addr_txtFd.getText());});
		
		setSize(300, 150);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TextFieldEx();
	}

}
