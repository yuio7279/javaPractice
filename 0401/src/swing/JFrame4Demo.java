package swing;
import javax.swing.*;

public class JFrame4Demo extends JFrame{

	JFrame4Demo()
	{
		this.setTitle("���̷�, ����!");
		
		JPanel p = new JPanel();
		JLabel I = new JLabel("�ȳ�, ����!");
		JButton b = new JButton("��ư");
		p.add(I);
		p.add(b);
		add(p);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300, 100);
		this.pack(); //wrap_content
		this.setVisible(true);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JFrame4Demo();
	}

}
