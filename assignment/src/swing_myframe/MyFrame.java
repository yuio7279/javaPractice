package swing_myframe;
import java.awt.BorderLayout;

import javax.swing.*;
public class MyFrame extends JFrame {

	public MyFrame(){
		this.setTitle("MyFrame");
		this.setSize(600,150);
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
		JLabel p2Label= new JLabel("�ڹ� ���ڿ� ���Ű��� ȯ���մϴ�. ���� ������ �����ϼ���");
		
		JButton p3Btn1 = new JButton("�޺�����");
		JButton p3Btn2 = new JButton("������������");
		JButton p3Btn3 = new JButton("�Ұ������");
		JLabel p3Label = new JLabel("����");
		JTextField p3Tx = new JTextField(5);
		
		p2.add(p2Label);
		
		p3.add(p3Btn1);
		p3.add(p3Btn2);
		p3.add(p3Btn3);
		p3.add(p3Label);
		p3.add(p3Tx);
		add(BorderLayout.NORTH,p2);
		add(BorderLayout.CENTER,p3);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new MyFrame();
		
	}

}
