package thread;

import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

class RandomThread extends Thread implements Runnable{
	Container c;
	public boolean stop;
	public RandomThread(Container c) {
		this.c = c;
	}

@Override
public void run() {
	while(!stop)
	{
		try {
			JLabel r_text = new JLabel("Java");
			int rand1 = (int)Math.floor(Math.random()*200);
			int rand2 = (int)Math.floor(Math.random()*150);
			r_text.setBounds(rand1, rand2, 30, 20);
			c.add(r_text);
			c.repaint();
//			c.revalidate();
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
}



public class ThreadFinishFlagEx extends JFrame {

	public ThreadFinishFlagEx() {
		this.setTitle("ThreadFinishFlageEx 예제");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		
		RandomThread th;
		this.setSize(300,200);
		this.setVisible(true);
		
		th = new RandomThread(c);
		th.start();
		
		c.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				c.removeAll();
				JLabel finish = new JLabel("finish");
				c.add(finish);
				finish.setBounds(100, 100, 40, 20);
				th.stop = true;
				c.repaint();
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ThreadFinishFlagEx();
	}

}
