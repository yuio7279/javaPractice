package thread;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;

import javax.swing.*;

public class BubbleGameFrame extends JFrame {
	
	public BubbleGameFrame() {
		this.setTitle("���� ����");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		GamePanel p = new GamePanel();
		this.setContentPane(p);
		this.setSize(300,300);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new BubbleGameFrame();
	}
}
class GamePanel extends JPanel{
	
	public GamePanel() {
		this.setLayout(null);
		this.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				
				BubbleThread th = new BubbleThread(e.getX(),e.getY());
				th.start();
			}
		});
	}
	
	class BubbleThread extends Thread {
		private JLabel bubble;
		
		public BubbleThread(int bubbleX, int bubbleY) {
			bubble = new MyLabel();
			bubble.paintComponents(null);	//�ڵ��ϼ����� null���� ���� �ذ��� �ű� �ƴµ� ������ ��ã�ҽ��ϴ�.. new Graphics(bubbleX, bubbleY, 20, 20)
			
			bubble.setLocation(bubbleX, bubbleY);
			bubble.setSize(20,20);
			bubble.setOpaque(true);
			add(bubble);
			
		}
		public void run() {
			while(true)
			{
				int yCor = bubble.getY()-5;
				try {
					if(bubble.getY() < 10) {	//0�����ϸ� Ƽ���ȳ��� 10�����߽��ϴ�.
						bubble.setVisible(false);
						bubble.removeAll();
											}
					else {
						bubble.setLocation(bubble.getX(), yCor);
					}
					Thread.sleep(20);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		class MyLabel extends JLabel 
		{
			private ImageIcon icon = new ImageIcon("images/image0.jpg");
			private Image img = icon.getImage(); // �̹��� ��ü
			public void paintComponent(Graphics g) 
			{
				super.paintComponent(g);
				g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
			}
		}

	}
}
