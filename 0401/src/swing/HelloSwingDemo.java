package swing;
import java.awt.*;

import javax.swing.*;

class HelloSwingDemo2 extends JFrame {
	public HelloSwingDemo2()
	{
		this.setTitle("안녕2, 스윙!");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//!!컴포넌트의 크기와 모양은 배치관리자의 영향을 받는다
		//레이아웃 설정
		
		this.setLayout(null);
//		this.setLayout(new FlowLayout());
//		this.setLayout(new BorderLayout());
//		this.setLayout(new GridLayout(4,2));
		
		//컴포넌트 만들어 붙이기
		JButton btn = new JButton("안녕1");
		//add(btn, BorderLayout.NORTH);
		JButton btn2 = new JButton("안녕2");
		//add(btn2, BorderLayout.SOUTH);
		JButton btn3 = new JButton("안녕3");
		//add(btn3, BorderLayout.CENTER);
		JButton btn4 = new JButton("안녕4");
		//add(btn4, BorderLayout.WEST);
		JButton btn5 = new JButton("안녕5");
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
//		f.setTitle("안녕 스윙!");
//		f.setSize(300,200);
//		f.setVisible(true);
		
		new HelloSwingDemo2();
	}
}
