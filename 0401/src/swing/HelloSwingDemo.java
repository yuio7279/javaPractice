package swing;
import java.awt.*;

import javax.swing.*;

class HelloSwingDemo2 extends JFrame {
	public HelloSwingDemo2()
	{
		this.setTitle("�ȳ�2, ����!");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//!!������Ʈ�� ũ��� ����� ��ġ�������� ������ �޴´�
		//���̾ƿ� ����
		
		this.setLayout(null);
//		this.setLayout(new FlowLayout());
//		this.setLayout(new BorderLayout());
//		this.setLayout(new GridLayout(4,2));
		
		//������Ʈ ����� ���̱�
		JButton btn = new JButton("�ȳ�1");
		//add(btn, BorderLayout.NORTH);
		JButton btn2 = new JButton("�ȳ�2");
		//add(btn2, BorderLayout.SOUTH);
		JButton btn3 = new JButton("�ȳ�3");
		//add(btn3, BorderLayout.CENTER);
		JButton btn4 = new JButton("�ȳ�4");
		//add(btn4, BorderLayout.WEST);
		JButton btn5 = new JButton("�ȳ�5");
		//add(btn5, BorderLayout.EAST);
		
		btn.setSize(70,40);
		btn.setLocation(20,20);
		
		btn2.setBounds(100, 100, 70, 40);
		
		
		
		add(btn);
		add(btn2);
		add(btn3);
		add(btn4);
		add(btn5);
		
		
		
		this.setSize(500, 300);
		this.setVisible(true);
	}
}


public class HelloSwingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		JFrame f = new JFrame();
//		f.setTitle("�ȳ� ����!");
//		f.setSize(300,200);
//		f.setVisible(true);
		
		new HelloSwingDemo2();
	}
}
