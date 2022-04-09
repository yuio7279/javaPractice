package swing_textfield;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class TextFieldEx extends JFrame {

	public TextFieldEx() {
		setTitle("�ؽ�Ʈ �ʵ� ����� ����");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JTextField name_txtFd = new JTextField(20);
		JTextField dptMnt_txtFd = new JTextField("��ǻ�Ͱ��а�", 20);
		JTextField addr_txtFd = new JTextField("����� ...", 20);
		
		
		c.add(new JLabel("�̸�"));
		c.add(name_txtFd);
		c.add(new JLabel("�а�"));
		c.add(dptMnt_txtFd);
		c.add(new JLabel("�ּ�"));
		c.add(addr_txtFd);
		
		addr_txtFd.addActionListener(e -> {System.out.printf("%s, %s, %s", //����
				name_txtFd.getText(),dptMnt_txtFd.getText(),addr_txtFd.getText());});
		
		setSize(300, 150);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TextFieldEx();
	}

}
