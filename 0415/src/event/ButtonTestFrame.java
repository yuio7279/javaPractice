package event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class ButtonTestFrame extends JFrame {
	ButtonTestFrame() {
		setTitle("�迹��");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		//------------------------------------
//		JPanel myPanel = new JPanel();
//		JButton btn1 = new JButton("�ȳ�");
//		
		add(new MyPanel());
		//------------------------------------------
		setSize(500,300);
		setVisible(true);
	}
	
	
	
	
	//ButtonTestFrame�� ���� Ŭ����
	class MyPanel extends JPanel{
		JButton btn1;
		JButton btn2;
		
		MyPanel(){			
			
			MyActionListener listener = new MyActionListener();
			
			
			btn1 = new JButton("�ȳ�");
			this.add(btn1);
			btn1.addActionListener(listener);
			
			btn2 = new JButton("����");
			this.add(btn2);
			btn2.addActionListener(listener);
			
			btn1.addMouseListener(new MouseListener() {

				@Override
				public void mouseClicked(MouseEvent e) {
					System.out.println("Clicked!");
					
				}

				@Override
				public void mousePressed(MouseEvent e) {
					System.out.println("Pressed!");
					
				}

				@Override
				public void mouseReleased(MouseEvent e) {
					System.out.println("Released!");
					
				}

				@Override
				public void mouseEntered(MouseEvent e) {
					System.out.println("Entered!");
					
				}

				@Override
				public void mouseExited(MouseEvent e) {
					System.out.println("Exited!");
					
				}
			});
			
		}
		//MyPanel�� ���� Ŭ����
		class MyActionListener implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				String msg =e.getActionCommand();
				if(msg.equals("�ȳ�")) {
					btn1.setText("�迹��");
				}
				else if(msg.equals("����")) {
					System.exit(0);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		new ButtonTestFrame();
	}
}
