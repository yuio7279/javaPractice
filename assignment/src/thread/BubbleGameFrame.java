package thread;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;

import javax.swing.*;

public class BubbleGameFrame extends JFrame {
	
	public BubbleGameFrame() {
		this.setTitle("버블 게임");
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
			bubble.paintComponents(null);	//자동완성으로 null값이 들어가서 해결이 돼긴 됐는데 이유를 못찾았습니다.. new Graphics(bubbleX, bubbleY, 20, 20)
			
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
					if(bubble.getY() < 10) {	//0으로하면 티가안나서 10으로했습니다.
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
			private Image img = icon.getImage(); // 이미지 객체
			public void paintComponent(Graphics g) 
			{
				super.paintComponent(g);
				g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
			}
		}

	}
}
