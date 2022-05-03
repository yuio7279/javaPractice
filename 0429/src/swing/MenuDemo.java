package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.*;

public class MenuDemo extends JFrame implements ActionListener {
	Container c = this.getContentPane();
	MenuDemo()
	{
		//setTitle("�迹��");
		super("�迹��");
		setSize(500, 300);
		makeMenu();
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	void makeMenu() {
		JMenuItem item;
		KeyStroke key;
		
		JMenuBar mb = new JMenuBar();
		JMenu m1 = new JMenu("����");
		m1.setMnemonic(KeyEvent.VK_F);
		JMenu m2 = new JMenu("����");
		m2.setMnemonic(KeyEvent.VK_C);
		JMenu m3 = new JMenu("Screens");
		
		
		JMenuItem item1 = new JMenuItem("�� ����", KeyEvent.VK_N);
		item1.addActionListener(this);
		JMenuItem item2 = new JMenuItem("���� ����", KeyEvent.VK_O);
		item2.addActionListener(this);
		JMenuItem item3 = new JMenuItem("���� ����");
		item3.addActionListener(this);
		
		m1.addSeparator();
		
		JMenuItem item4 = new JMenuItem("����");
		item4.addActionListener(this);
		JMenuItem item5 = new JMenuItem("�Ķ���");
		item5.addActionListener(this);
		JMenuItem item6 = new JMenuItem("������");
		item6.addActionListener(this);
		JMenuItem item7 = new JMenuItem("�����");
		item7.addActionListener(this);

		JMenuItem item8 = new JMenuItem("Load");
		item8.addActionListener(this);
		
		JMenuItem item9 = new JMenuItem("Hide");
		item9.addActionListener(this);
		
		JMenuItem item10 = new JMenuItem("ReShow");
		item10.addActionListener(this);
		
		JMenuItem item11 = new JMenuItem("Exit");
		item11.addActionListener(this);

		m1.add(item1);
		m1.add(item2);
		m1.add(item3);
		m1.add(item4);
		m2.add(item5);
		m2.add(item6);
		m2.add(item7);
		m3.add(item8);
		m3.add(item9);
		m3.add(item10);
		m3.add(item11);
		
		
		mb.add(m1);
		mb.add(m2);
		mb.add(m3);
		this.setJMenuBar(mb);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new MenuDemo();
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String menu = e.getActionCommand();
		
		switch(menu)
		{
		case "�� ����":{}
		case "���� ����":{}
		case "���� ����":{}
		case "����" :{System.exit(0);break;}
		case "�Ķ���" :
		{
			c.setBackground(Color.blue);
			c.repaint();
			c.revalidate();break;}
		case "������" :
		{
			c.setBackground(Color.red);
			c.repaint();
			c.revalidate();break;}
		case "�����" :
		{
			c.setBackground(Color.yellow);
			c.repaint();
			c.revalidate();break;}
		case "Load" : 
			{
				ImageIcon flower = new ImageIcon("C:\\Users\\super\\Desktop\\2-B_KYS\\img1.png");
				JLabel imgLabel = new JLabel(flower);
				c.add(imgLabel);
				c.repaint();
				c.revalidate();
				break;
			}
		case "Hide" : 
		{
			c.setVisible(false);
			c.repaint();
			c.revalidate();break;}
		case "ReShow":
		{
			c.setVisible(true);
			c.repaint();
			c.revalidate();break;}
		
		case "Exit":{System.exit(0);break;}
		default : {System.out.println("??");break;}
		
		}
		
	}

}
